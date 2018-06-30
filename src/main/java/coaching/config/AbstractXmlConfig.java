
package coaching.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Configuration from XML.
 */
public abstract class AbstractXmlConfig implements ConfigInterface {

    /** provides logging. */
    protected final Logger log = LoggerFactory.getLogger(AbstractXmlConfig.class);

    @Override
    public String getProperty(final String key) {
        return null;
    }

    @Override
    public String getProperty(final String key, final String defaultValue) {
        return defaultValue;
    }

}
