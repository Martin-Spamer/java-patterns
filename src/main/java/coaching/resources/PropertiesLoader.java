
package coaching.resources;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

    private static final Logger LOG = LoggerFactory.getLogger(PropertiesLoader.class);

    private PropertiesLoader() {
        super();
    }

    /**
     * Gets the properties.
     *
     * @param resourceFilename the resource filename
     * @return the properties
     * @throws IOException the IO exception
     */
    public static Properties getProperties(final String resourceFilename) {
        Properties properties = new Properties();
        try {
            final InputStream stream = ResourceLoader.getStream(resourceFilename);
            properties.load(stream);
        } catch (IOException e) {
            LOG.error(e.getLocalizedMessage(), e);
        }
        return properties;
    }

    /**
     * Gets the xml properties.
     *
     * @param xmlResourceFilename the xml resource filename
     * @return the xml properties
     * @throws IOException the IO exception
     */
    public static Properties getXmlProperties(final String xmlResourceFilename) {
        Properties properties = new Properties();
        try {
            final InputStream stream = ResourceLoader.getStream(xmlResourceFilename);
            properties.loadFromXML(stream);
        } catch (IOException e) {
            LOG.error(e.getLocalizedMessage(), e);
        }
        return properties;
    }

}
