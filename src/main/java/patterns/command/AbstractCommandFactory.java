
package patterns.command;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A factory for creating Command objects.
 *
 * Commands are cheap to instantiate.
 */
public final class AbstractCommandFactory {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory
            .getLogger(AbstractCommandFactory.class);

    /** Properties Resource file for commands. */
    private static final String COMMANDS_PROPERTIES = "commands.properties";

    /** The properties. */
    private final Properties properties = new Properties();

    /**
     * Instantiates a new command factory.
     */
    public AbstractCommandFactory() {
        super();
        LOG.info("");
        initialise(COMMANDS_PROPERTIES);
    }

    /**
     * Instantiates a new command factory.
     *
     * @param filename
     *            the filename
     */
    public AbstractCommandFactory(final String filename) {
        super();
        initialise(filename);
    }

    /**
     * Initialise.
     *
     * @param filename
     *            the filename
     */
    private void initialise(final String filename) {
        try {
            properties.load(inputStream(filename));
            LOG.info("properties = {}", properties);
        } catch (final IOException e) {
            LOG.error(e.getLocalizedMessage(), e);
        }
    }

    /**
     * Input stream.
     *
     * @param resourceName
     *            the resource name
     * @return the input stream
     */
    private InputStream inputStream(final String resourceName) {
        final ClassLoader classloader = Thread
                .currentThread()
                .getContextClassLoader();
        return classloader.getResourceAsStream(resourceName);
    }

    /**
     * Execute.
     *
     * @return the result interface
     */
    public ResultInterface execute() {
        return null;
    }

    public ResultInterface execute(final String commandName) {
        return null;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String
                .format("%s [properties=%s]",
                        this.getClass().getSimpleName(),
                        properties);
    }

}
