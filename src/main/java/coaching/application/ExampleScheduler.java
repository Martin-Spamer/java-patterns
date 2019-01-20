
package coaching.application;

import java.util.Properties;

/**
 * Example Scheduler class.
 */
public final class ExampleScheduler extends AbstractScheduler {

    /**
     * Instantiates a new example scheduler.
     */
    public ExampleScheduler() {
        super();
    }

    /**
     * Instantiates a new example scheduler.
     *
     * @param properties the properties
     */
    public ExampleScheduler(final Properties properties) {
        super(properties);
    }

    /**
     * Instantiates a new example scheduler.
     *
     * @param resourceName the resource name
     */
    public ExampleScheduler(final String resourceName) {
        super(resourceName);
    }

    /**
     * Instantiates a new example scheduler.
     *
     * @param args the args
     */
    public ExampleScheduler(final String[] args) {
        super(args);
    }

}
