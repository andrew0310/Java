package Singleton;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

        private static Logger instance;
        final String FILEPATH = "/home/andrzej/Java/ProgramowanieII/src/main/java/log";

        public static Logger getInstance() {
            return null == instance ? new Logger() : instance;
        }

        private Logger() {
        }

        public void log(String logMessage) throws IOException {

            try (FileWriter fw = new FileWriter(FILEPATH, true); BufferedWriter bf = new BufferedWriter(fw); PrintWriter pw = new PrintWriter(bf)) {
                pw.println(getTime(logMessage));

            } catch (FileNotFoundException e) {
                System.out.println("Operation failed");
                e.printStackTrace();
            }
        }

        public void log(Loggable cl) throws IOException {
            log(cl.getLogMessage());
        }

        public String getTime(String logMessage) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            LocalDateTime localDate = LocalDateTime.now();
            String x = dtf.format(localDate);

            return "<" + x + "> : <" + logMessage + ">";
        }
    }
