
package coaching.application;

import java.util.Arrays;

import coaching.solid.AbstractApplication;
import lombok.extern.slf4j.Slf4j;

/**
 * Example ThreadedApplication class.
 */


@Slf4j
public final class Application extends AbstractApplication {

    /**
     * Instantiates a new application.
     */
    public Application() {
        super();
    }

    /**
     * Instantiates a new ThreadedApplication class.
     *
     * @param args an array of string objects.
     */
    public Application(final String[] args) {
        super(args);
        log.debug("args = {}", Arrays.toString(args));
    }

    /**
     * Execute the ThreadedApplication.
     */
    public void execute() {
        log.info("execute() : {}", this.toString());
    }

    /**
     * The main entry method for the application.
     * Create a new instance of the ThreadedApplication with its default
     * constructor,
     * using any command line parameters from the args,
     * and calling the execute method.
     *
     * @param args the program arguments as a array of strings.
     */
    public static void main(final String[] args) {
        new Application(args).execute();
    }

    /**
     * The ApplicationException.
     */
    public class ApplicationException extends Exception {

        /**
         * Instantiates a new application exception.
         *
         * @param message the message
         */
        public ApplicationException(final String message) {
            super(message);
        }
    }
}
