
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

    /** LOG 			constant. */
    private static final Logger LOG = LoggerFactory
        .getLogger(PropertiesLoader.class);

    /**
     * Instantiates a new properties loader.
     */
    private PropertiesLoader() {
        fail("Use static methods");
    }

    /**
     * Gets the properties.
     *
     * @param resourceName the resource filename
     * @return the properties
     */
    public static Properties getProperties(final String resourceName) {
        final Properties properties = new Properties();
        try {
            final InputStream stream = ResourceLoader
                .getStream(propertiesFilename(resourceName));
            properties.load(stream);
            properties.setProperty("propertyFilename", resourceName);
        } catch (final IOException e) {
            LOG.error(e.getLocalizedMessage(), e);
        }
        return properties;
    }

    /**
     * Properties filename.
     *
     * @param resourceName the resource name
     * @return the string
     */
    private static String propertiesFilename(final String resourceName) {
        String suffix = ".properties";
        if (resourceName.endsWith(suffix)) {
            return resourceName;
        } else {
            return String.format("%s%s", resourceName, suffix);
        }
    }

    /**
     * Gets the xml properties.
     *
     * @param resourceName the xml resource filename
     * @return the xml properties
     */
    public static Properties getXmlProperties(final String resourceName) {
        final Properties properties = new Properties();
        try {
            final InputStream stream = ResourceLoader
                .getStream(xmlPropertiesFilename(
                        xmlPropertiesFilename(resourceName)));
            properties.loadFromXML(stream);
            properties.setProperty("propertyFilename", resourceName);
        } catch (final IOException e) {
            LOG.error(e.getLocalizedMessage(), e);
        }
        return properties;
    }

    /**
     * Xml properties filename.
     *
     * @param resourceName the resource name
     * @return the string
     */
    private static String xmlPropertiesFilename(final String resourceName) {
        String suffix = ".xml";
        if (resourceName.endsWith(suffix)) {
            return resourceName;
        } else {
            return String.format("%s%s", resourceName, suffix);
        }
    }

}
