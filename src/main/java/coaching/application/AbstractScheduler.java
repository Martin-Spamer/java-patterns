
package coaching.application;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractScheduler {

    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
    private String[] args = null;
    private Properties properties = null;

    public AbstractScheduler() {
        super();
        loadConfiguration();
    }

    public AbstractScheduler(final String[] args) {
        super();
        this.args = args;
        loadConfiguration(args);
    }

    public AbstractScheduler(final Properties properties) {
        super();
        loadConfiguration(properties);
    }

    private void loadConfiguration() {
        final String filename = defaultFilename();
        try {
            final InputStream resourceAsStream = getClass().getResourceAsStream(filename);
            properties.load(resourceAsStream);
        } catch (final Exception e) {
            log.error(e.toString());
        }
    }

    private String defaultFilename() {
        return String.format("%s.properties", this.getClass().getSimpleName());
    }

    private void loadConfiguration(final Properties properties) {
        this.properties = properties;
    }

    private void loadConfiguration(final String[] args) {
        try {
            if (args != null) {
                for (final String arg : this.args) {
                    String key = arg.substring(0, arg.indexOf("="));
                    log.info("key = {}", key);
                    String value = arg.substring(arg.length());
                    log.info("value = {}", value);
                    properties.setProperty(key, value);
                }
            }
        } catch (final IndexOutOfBoundsException indexOutOfBoundsException) {
            log.error("{} : reading args", indexOutOfBoundsException, args);
        }
    }

    public AbstractScheduler setProperties(final Properties properties) {
        this.properties = properties;
        return this;
    }

    public AbstractScheduler execute() {
        return execute(properties);
    }

    public AbstractScheduler execute(final Properties properties) {
        final Enumeration<?> keys = properties.propertyNames();
        while (keys.hasMoreElements()) {
            final String key = (String) keys.nextElement();
            final String value = properties.getProperty(key);
            try {
                final Thread thread = (Thread) Class.forName(value).newInstance();
                thread.start();
            } catch (final Exception exception) {
                log.error(exception.toString());
            }
        }
        return this;
    }
}
