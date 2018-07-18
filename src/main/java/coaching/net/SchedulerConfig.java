
package coaching.net;

import coaching.config.Configuration;

/**
 * A configuration class for the Scheduler.
 */
public final class SchedulerConfig extends Configuration {

    public SchedulerConfig() {
        this("Scheduler.properties");
    }

    /**
     * @param configFilename
     */
    public SchedulerConfig(final String configFilename) {
        super(configFilename);
    }

}
