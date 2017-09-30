
package coaching.rules;

import java.util.Properties;

/**
 * Context Class.
 */
public class Context extends AbstractContext implements ContextInterface {

	/**
	 * Instantiates a new context.
	 *
	 * @param properties the properties
	 */
	public Context(final Properties properties) {
		super(properties);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see coaching.rules.AbstractContext#getProperties()
	 */
	@Override
	public Properties getProperties() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see coaching.rules.AbstractContext#setProperties(java.util.Properties)
	 */
	@Override
	public AbstractContext setProperties(final Properties properties) {
		return null;
	}

}
