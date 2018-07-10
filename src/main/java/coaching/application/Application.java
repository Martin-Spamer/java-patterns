
package coaching.application;

import java.util.Arrays;

public class Application extends AbstractApplication {

    /**
     * Instantiates a new application.
     *
     * args
     */
    public Application(final String[] args) {
        super(args);
    }

    /**
     * Execute.
     *
     * @return true, if successful
     */
    public boolean execute() {
        boolean returnValue = false;
        try {
            returnValue = true;
        } catch (final Exception exception) {
            log.error(exception.toString());
        }
        return returnValue;
    }

    /**
     * The main entry method.
     * exit codes
     * 0 Success
     * 1 Catchall for general errors
     * 2 Misuse of shell builtins (according to Bash documentation)
     * 126 Command invoked cannot execute
     * 127 Command not found
     * 128 Invalid argument to exit
     * 128+n Fatal error signal “n”
     * 130 Control+C
     * 255 Exit status out of range
     *
     * @param args the program arguments as a String array.
     */
    public static void main(final String[] args) {
        log.trace("System properties = {}", System.getProperties().toString());
        log.debug("args = {}", Arrays.toString(args));

        final Application application = new Application(args);
        if (application.initialisation()) {
            if (application.execute()) {
                System.exit(0);
            } else {
                log.info("application = {}", application.toString());
                System.exit(1);
            }
        }
    }
}
