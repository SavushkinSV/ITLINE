package ssv.home.itline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        checkCommandLineArgument(args);
    }

    private static void checkCommandLineArgument(String[] args) {
        if (args.length != 0) {
            switch (args[0]) {
                case ("spring"): {
                    SpringApplication.run(App.class, args);
                    break;
                }
                case ("javafx"): {
                    // some code
                    break;
                }
                default:
                    log.info("Unknown command line argument");
            }
        } else {
            log.info("Missing command line arguments");
        }
    }

}
