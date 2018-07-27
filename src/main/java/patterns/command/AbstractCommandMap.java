
package patterns.command;

import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import coaching.resources.PropertiesLoader;

public abstract class AbstractCommandMap  {

    /** logging provided */
    protected final Logger log = LoggerFactory
            .getLogger(this.getClass().getSimpleName());

    private final ConcurrentHashMap<String, AbstractCommand> commands = new ConcurrentHashMap();

    public AbstractCommandMap() {
        super();
        initialise();
    }

    public AbstractCommandMap(final String resourceName) {
        super();
        initialise(resourceName);
    }

    public AbstractCommandMap(final Properties properties) {
        super();
        initialise(properties);
    }

    protected void initialise() {
        String className = this.getClass().getSimpleName();
        initialise(className);
    }

    protected void initialise(final String resourceName) {
        initialise(PropertiesLoader.getProperties(resourceName));
    }

    protected void initialise(final Properties properties) {
        assertNotNull(properties);

        for (final Map.Entry<Object, Object> entry : properties.entrySet()) {
            final String key = (String) entry.getKey();
            final String className = (String) entry.getValue();
            log.debug("\t{} = {}", key, className);
            try {
                Class<?> aClass = Class.forName(className);
                AbstractCommand command;
                command = (AbstractCommand) aClass.newInstance();
                commands.put(key, command);
            } catch (
                    ClassNotFoundException |
                    InstantiationException |
                    IllegalAccessException e) {
                log.error("Class not found for command {}", key);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%s [commands=%s]",
                this.getClass().getSimpleName(),
                commands);
    }

}
