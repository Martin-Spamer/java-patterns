
package coaching.application;

import java.util.Arrays;

/**
 * Example Application class.
 */
public final class Application extends AbstractApplication {

    /**
     * Instantiates a new application.
     *
     * @param args the args
     */
    public Application(final String[] args) {
        super(args);
        log.trace("System properties = {}", System.getProperties().toString());
        log.debug("args = {}", Arrays.toString(args));
    }

    /**
     * Execute.
     *
     * @return true, if successful
     */
    public boolean execute() {
        try {
            log.info("execute() : {}", this);
            return true;
        } catch (final Exception exception) {
            log.error(exception.toString(), exception);
            return false;
        }
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
        final Application application = new Application(args);
        if (application.initialisation()) {
            if (application.execute()) {
                System.exit(0);
            } else {
                System.exit(1);
            }
        }
    }
}
