
package coaching.net;

import coaching.config.Configuration;

/**
 * A configuration class for the Scheduler.
 */
public final class SchedulerConfig extends Configuration {

    /**
     * Instantiates a new scheduler config.
     */
    public SchedulerConfig() {
        this("Scheduler.properties");
    }

    /**
     * Instantiates a new scheduler config.
     *
     * @param configFilename the config filename
     */
    public SchedulerConfig(final String configFilename) {
        super(configFilename);
    }

}
