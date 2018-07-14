
package coaching.resources;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class XmlResourceLoader {

    private static final Logger LOG = LoggerFactory.getLogger(XmlResourceLoader.class);

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
    public static Properties getXmlProperties(final String xmlResourceFilename) {
        final Properties properties = new Properties();
        try {
            final InputStream stream = ResourceLoader.getStream(xmlResourceFilename);
            properties.loadFromXML(stream);
        } catch (IOException e) {
            LOG.error(e.getLocalizedMessage(), e);
        }
        return properties;
    }

}
