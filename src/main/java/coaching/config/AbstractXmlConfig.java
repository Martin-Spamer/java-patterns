
package coaching.config;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertNotNull;

/**
 * An abstract XML Configuration class.
 * Loads the Configuration Properties from an XML file.
 */
public abstract class AbstractXmlConfig extends AbstractConfiguration {

    /**
     * The Constructor.
     */
    public AbstractXmlConfig() {
        super();
        loadFrom(defaultFilename());
    }

    /**
     * The Constructor.
     *
     * @param configFilename the config filename
     */
    public AbstractXmlConfig(final String configFilename) {
        filenameStem = configFilename;
        loadFrom(configFilename);
    }

    /**
     * Default filename.
     *
     * @return the string
     */
    @Override
    protected String defaultFilename() {
        filenameStem = this.getClass().getSimpleName();
        return filenameStem;
    }

    /**
     * configuration from filename.
     *
     * @param configFilename
     *            the Configuration filename
     */
    @Override
    protected void loadFrom(final String configFilename) {
        final String propertyFilename = toPropertyFilename(configFilename);
        loadFrom(inputStream(propertyFilename));
        properties.setProperty("propertyFilename", propertyFilename);
    }

    /**
     * To property filename.
     *
     * @param configFilename
     *            the Configuration filename
     * @return the string
     */
    @Override
    protected String toPropertyFilename(final String configFilename) {
        assertNotNull(configFilename);
        if (configFilename.endsWith(".xml")) {
            return configFilename;
        } else {
            return String.format("%s.xml", configFilename);
        }
    }

    /**
     * Input stream from a resource filename.
     *
     * @param resourceName
     *            the resource name
     * @return the input stream
     */
    @Override
    protected InputStream inputStream(final String resourceName) {
        final Thread currentThread = Thread.currentThread();
        final ClassLoader classloader = currentThread.getContextClassLoader();
        return classloader.getResourceAsStream(resourceName);
    }

    /**
     * Load from property file.
     *
     * @param resourceAsStream
     *            the resource as stream
     */
    @Override
    protected void loadFrom(final InputStream resourceAsStream) {
        if (resourceAsStream != null) {
            try {
                properties.loadFromXML(resourceAsStream);
                loaded = true;
            } catch (final IOException e) {
                log.error(e.toString(), e);
            }
        }
    }
}
