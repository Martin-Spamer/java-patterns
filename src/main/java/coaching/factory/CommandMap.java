
package coaching.factory;

import java.util.Properties;

import coaching.resources.PropertiesLoader;

public final class CommandMap {

    private static final CommandMap INSTANCE = new CommandMap();
    private static Properties properties;

    private CommandMap() {
        super();
        final String resourceName = this.getClass().getSimpleName();
        properties = PropertiesLoader.getProperties(resourceName);
    }

    public static CommandMap getInstance() {
        return INSTANCE;
    }

    public static CommandMap getInstance(final String resourceName) {
        properties = PropertiesLoader.getProperties(resourceName);
        return INSTANCE;
    }

    public String get(final String key) {
        return properties.getProperty(key);
    }

    public void load(final String resourceName) {
        properties = PropertiesLoader.getProperties(resourceName);
    }

}
