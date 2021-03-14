package exception;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductIllegalArgumentException extends RuntimeException {

    public ProductIllegalArgumentException(String message) {
        super(message);
        Logger log = Logger.getLogger(this.getClass().getName());
        Logger parentLog = log.getParent();
        if (parentLog != null && parentLog.getHandlers().length > 0) {
            parentLog.removeHandler(parentLog.getHandlers()[1]);
        }
        if (message.length() == 0) {
            log.log(Level.WARNING, "Ошибка ввода данных");
        } else {
            StringBuilder trace = new StringBuilder();
            for (StackTraceElement s : this.getStackTrace()
            ) {
                trace.append("\n    at ").append(s.toString());
            }
            log.log(Level.WARNING, message + trace);

        }
    }

}
