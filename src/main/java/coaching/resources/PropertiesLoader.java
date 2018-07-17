
package coaching.resources;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.fail;

/**
 * Property Loader class.
 *
 * Loads a properties file by name from the classpath.
 *
 * The resource must be a file with .properties extension.
 *
 * The name is assumed to be absolute and can use either "/" or "." for package
 * segment separation with an
 * optional leading "/" and
 * The ".properties" suffix optional.
 * The following names refer to the same resource:
 * some.pkg.Resource
 * some.pkg.Resource.properties
 * some/pkg/Resource
 * some/pkg/Resource.properties
 * /some/pkg/Resource
 * /some/pkg/Resource.properties
 */
public final class PropertiesLoader {

    private static final Logger LOG = LoggerFactory
        .getLogger(PropertiesLoader.class);

    private PropertiesLoader() {
        fail("Use static methods");
    }

    /**
     * Gets the properties.
     *
     * @param resourceName the resource filename
     * @return the properties
     * @throws IOException the IO exception
     */
    public static Properties getProperties(final String resourceName) {
        final Properties properties = new Properties();
        try {
            final InputStream stream = ResourceLoader.getStream(resourceName);
            properties.load(stream);
        } catch (final IOException e) {
            LOG.error(e.getLocalizedMessage(), e);
        }
        return properties;
    }

    /**
     * Gets the xml properties.
     *
     * @param resourceName the xml resource filename
     * @return the xml properties
     * @throws IOException the IO exception
     */
    public static Properties getXmlProperties(final String resourceName) {
        final Properties properties = new Properties();
        try {
            final InputStream stream = ResourceLoader.getStream(resourceName);
            properties.loadFromXML(stream);
        } catch (final IOException e) {
            LOG.error(e.getLocalizedMessage(), e);
        }
        return properties;
    }

}
