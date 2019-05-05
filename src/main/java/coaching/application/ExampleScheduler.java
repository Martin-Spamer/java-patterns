
package coaching.application;

/**
 * Example Scheduler class.
 *
 * A Scheduler is specials application used for starting other Applications
 * under specific circumstances, at certain times or in response to specific
 * events.
 */

public final class ExampleScheduler extends AbstractScheduler {

    /**
     * Instantiates a new example scheduler.
     *
     * @param args the args
     */
    public ExampleScheduler(final String[] args) {
        super(args);
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
        new ExampleScheduler(args).execute();
    }

}
