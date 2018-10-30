package Singleton;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        CreatingLog cl = new CreatingLog("Andrzej", "Kraszewski");
        cl.getLogMessage();
        Logger logger = Logger.getInstance();
        logger.log("log123.155");
        logger.log(cl);
    }
}
