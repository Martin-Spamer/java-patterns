
package coaching.rules;

import java.util.Properties;

/**
 * Abstract Context Class.
 */
public abstract class AbstractContext implements ContextInterface {

	private Properties properties = null;

	public AbstractContext(final Properties properties) {
		this.setProperties(properties);
	}

	@Override
	public ContextInterface setProperties(final Properties properties) {
		this.properties = properties;
		return this;
	}

	@Override
	public Properties getProperties() {
		return this.properties;
	}

}