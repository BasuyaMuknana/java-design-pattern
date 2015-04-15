package basuya.muknana.pattern.chain;

import basuya.muknana.origin.logger.AbstractLogger;
import basuya.muknana.origin.logger.ConsoleLogger;
import basuya.muknana.origin.logger.ErrorLogger;
import basuya.muknana.origin.logger.FileLogger;

/**
 * Created by 2904 on 2015/4/15.
 */
public class ChainPatternDemo {
    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
