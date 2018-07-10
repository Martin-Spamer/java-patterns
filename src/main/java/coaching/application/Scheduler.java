
package coaching.application;

import java.util.Properties;

public class Scheduler extends AbstractScheduler {

    public Scheduler() {
        super();
    }

    public Scheduler(final Properties properties) {
        super(properties);
    }

    public Scheduler(final String[] args) {
        super(args);
    }

    public static void main(final String[] args) {
        final Scheduler scheduler = new Scheduler(args);
        scheduler.execute();
    }
}
