
package coaching.config;

import java.io.IOException;
import java.io.InputStream;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * XML Configuration Properties.
 */
public class XmlProperties extends AbstractConfig {

    /** configuration element. */
    private final Element configElement = null;

    /**
     * Instantiates a new XmlConfig.
     */
    public XmlProperties() {
        super();
        final Class<? extends XmlProperties> className = this.getClass();
        final String simpleName = className.getSimpleName();
        loadFrom(String.format("%s.xml", simpleName));
    }

    /**
     * Instantiates a new XmlConfig from configuration file name.
     *
     * @param configFilename the Configuration filename
     */
    public XmlProperties(final String configFilename) {
        super();
        loadFromXmlFile(inputStream(toXmlFilename(configFilename)));
    }

    /**
     * To xml filename.
     *
     * @param configFilename the Configuration filename
     * @return the string
     */
    protected String toXmlFilename(final String configFilename) {
        return String.format("%s.xml", configFilename);
    }

    /**
     * Load from xml file resource as stream.
     *
     * @param resourceAsStream the resource as stream
     */
    public void loadFromXmlFile(final InputStream resourceAsStream) {
        if (resourceAsStream != null) {
            try {
                properties.loadFromXML(resourceAsStream);
            } catch (final IOException e) {
                log.error(e.toString());
            }
        }
    }

    /* (non-Javadoc)
     * @see coaching.config.AbstractConfig#getProperty(java.lang.String, java.lang.String)
     */
    @Override
    public String getProperty(final String key, final String defaultValue) {
        final String property = getProperty(key);
        return property == null ? defaultValue : property;
    }

}
