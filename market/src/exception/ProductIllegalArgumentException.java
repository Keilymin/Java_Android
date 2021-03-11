package exception;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductIllegalArgumentException extends RuntimeException {

    public ProductIllegalArgumentException(String message) {
        super(message);
        Logger log = Logger.getLogger(this.getClass().getName());
        log.log(Level.WARNING,"Ошибка ввода данных");
    }

}
