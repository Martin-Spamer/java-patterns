
package coaching.application;

import java.util.Arrays;

/**
 * Example Application class.
 */
public final class Application extends AbstractApplication {

    /**
     * Instantiates a new application.
     */
    public Application() {
        super();
    }

    /**
     * Instantiates a new application.
     *
     * @param args the args
     */
    public Application(final String[] args) {
        super(args);
        this.log.debug("args = {}", Arrays.toString(args));
    }

    /**
     * Execute.
     *
     * @return true, if successful
     */
    public boolean execute() {
        try {
            this.log.info("execute() : {}", this);
            return true;
        } catch (final Exception e) {
            this.log.error(e.getLocalizedMessage(), e);
            return false;
        }
    }

    /**
     * The main entry method. exit codes 0 Success 1 Catchall for general errors
     * 2 Misuse of shell builtins (according to Bash documentation) 126 Command
     * invoked cannot execute 127 Command not found 128 Invalid argument to exit
     * 128+n Fatal error signal “n” 130 Control+C 255 Exit status out of range
     *
     * @param args the program arguments as a String array.
     */
    public static void main(final String[] args) {
        new Application(args).execute();
    }
}
