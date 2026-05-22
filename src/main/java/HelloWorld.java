import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        logger.info("Starting HelloWorld");

        if (args.length > 0) {
            logger.info("hello {}", args[0]);
        } else {
            logger.info("hello world");
        }

        logger.info("HelloWorld finished");
    }
}
