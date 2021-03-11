import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {
    private static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("market/src/logging.properties");
            LogManager.getLogManager().readConfiguration(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.log(Level.INFO,"ns");
    }
}
