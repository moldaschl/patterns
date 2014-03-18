package net.mmoldaschl.patterns.chainofresponsiblity;

/**
 * A minimal sample application to demonstrate the pattern "Chain of responsibility"
 *
 * Taken from http://en.wikipedia.org/wiki/Chain-of-responsibility_pattern
 *
 * @author markus.moldaschl@gmail.com
 * Date: 18.03.14
 * Time: 15:22

 */
public class ChainOfResponsibilityMainApp {

    private static Logger createChain() {
        // Build the chain of responsibility

        Logger logger = new StdoutLogger(Logger.DEBUG);

        Logger logger1 = new EmailLogger(Logger.NOTICE);
        logger.setNext(logger1);

        Logger logger2 = new StderrLogger(Logger.ERR);
        logger1.setNext(logger2);

        return logger;
    }

    public static void main(String[] args) {

        Logger chain = createChain();

        // Handled by StdoutLogger (level = 7)
        chain.message("Entering function y.", Logger.DEBUG);

        // Handled by StdoutLogger and EmailLogger (level = 5)
        chain.message("Step1 completed.", Logger.NOTICE);

        // Handled by all three loggers (level = 3)
        chain.message("An error has occurred.", Logger.ERR);
    }

}
