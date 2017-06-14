
package patterns.command;

import java.util.Properties;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Command Parameters.
 */
@SuppressWarnings("serial")
public abstract class AbstractParameters implements ParametersInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private final Properties parameters = new Properties();

	/**
	 * Instantiates a new abstract parameters.
	 */
	public AbstractParameters() {
		super();
	}

	/**
	 * Instantiates a new abstract parameters.
	 *
	 * @param key the key
	 * @param value the value
	 */
	public AbstractParameters(String key, String value) {
		setPrameter(key, value);
	}

	/* (non-Javadoc)
	 * @see patterns.command.ParametersInterface#setPrameter(java.lang.String, java.lang.String)
	 */
	@Override
	public AbstractParameters setPrameter(String key, String value) {
		parameters.setProperty(key, value);
		return this;
	}

	/* (non-Javadoc)
	 * @see patterns.command.ParametersInterface#stringPropertyNames()
	 */
	@Override
	public Set<String> stringPropertyNames() {
		return parameters.stringPropertyNames();
	}

	/* (non-Javadoc)
	 * @see patterns.command.ParametersInterface#valueFor(java.lang.String)
	 */
	@Override
	public String valueFor(String key) {
		return parameters.getProperty(key);
	}

	/* (non-Javadoc)
	 * @see patterns.command.ParametersInterface#valueFor(java.lang.String, java.lang.String)
	 */
	@Override
	public String valueFor(String key, String defaultValue) {
		return parameters.getProperty(key, defaultValue);
	}

	/* (non-Javadoc)
	 * @see patterns.command.ParametersInterface#valueFor(java.lang.String, java.lang.Boolean)
	 */
	@Override
	public Boolean valueFor(String key, Boolean defaultValue) {
		final String property = parameters.getProperty(key, defaultValue.toString());
		return Boolean.parseBoolean(property);
	}

	/* (non-Javadoc)
	 * @see patterns.command.ParametersInterface#valueFor(java.lang.String, java.lang.Long)
	 */
	@Override
	public Long valueFor(String key, Long defaultValue) {
		final String property = parameters.getProperty(key, defaultValue.toString());
		return Long.parseLong(property);
	}
}
