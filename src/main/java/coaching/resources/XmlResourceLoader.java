
package coaching.resources;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class XmlResourceLoader {

    private XmlResourceLoader() {
        super();
    }

    /**
     * Gets the xml properties.
     *
     * @param xmlResourceFilename the xml resource filename
     * @return the xml properties
     * @throws IOException the IO exception
     */
    public static Properties getXmlProperties(final String xmlResourceFilename) throws IOException {
        final InputStream stream = ResourceLoader.getStream(xmlResourceFilename);
        final Properties properties = new Properties();
        properties.loadFromXML(stream);
        return properties;
    }

}
