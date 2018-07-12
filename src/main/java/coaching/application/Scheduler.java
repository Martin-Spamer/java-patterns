
package coaching.application;

import java.util.Properties;

/**
 * The Class Scheduler.
 */
public class Scheduler extends AbstractScheduler {

    /**
     * The Constructor.
     */
    public Scheduler() {
        super();
    }

    /**
     * The Constructor.
     *
     * @param properties the properties
     */
    public Scheduler(final Properties properties) {
        super(properties);
    }

    /**
     * The Constructor.
     *
     * @param args the args
     */
    public Scheduler(final String[] args) {
        super(args);
    }

    /**
     * The main method.
     *
     * @param args the args
     */
    public static void main(final String[] args) {
        final Scheduler scheduler = new Scheduler(args);
        scheduler.execute();
    }
}
