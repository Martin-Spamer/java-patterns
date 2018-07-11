
package coaching.resources;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

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
public class PropertiesLoader {

    /**
     * Gets the properties.
     *
     * @return the properties
     * @throws IOException
     */
    public static Properties getProperties(final String resourceFilename) throws IOException {
        InputStream stream = ResourceLoader.getStream(resourceFilename);
        Properties properties = new Properties();
        properties.load(stream);
        return properties;
    }

    public static Properties getXmlProperties(final String xmlResourceFilename) throws IOException {
        InputStream stream = ResourceLoader.getStream(xmlResourceFilename);
        Properties properties = new Properties();
        properties.loadFromXML(stream);
        return properties;
    }

}
