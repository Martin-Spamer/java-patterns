
package patterns.command;

import java.util.Properties;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Abstract class for Parameters to Commands.
 */
public abstract class AbstractCommandParameters implements ParametersInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private final Properties parameters = new Properties();

	/**
	 * Instantiates a new abstract parameters.
	 */
	public AbstractCommandParameters() {
		super();
	}

	/**
	 * Instantiates a new abstract parameters.
	 *
	 * @param key
	 *            the key
	 * @param value
	 *            the value
	 */
	public AbstractCommandParameters(final String key, final String value) {
		setPrameter(key, value);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.ParametersInterface#setPrameter(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public AbstractCommandParameters setPrameter(final String key, final String value) {
		this.parameters.setProperty(key, value);
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.ParametersInterface#stringPropertyNames()
	 */
	@Override
	public Set<String> stringPropertyNames() {
		return this.parameters.stringPropertyNames();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.ParametersInterface#valueFor(java.lang.String)
	 */
	@Override
	public String valueFor(final String key) {
		return this.parameters.getProperty(key);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.ParametersInterface#valueFor(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public String valueFor(final String key, final String defaultValue) {
		return this.parameters.getProperty(key, defaultValue);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.ParametersInterface#valueFor(java.lang.String,
	 * java.lang.Boolean)
	 */
	@Override
	public Boolean valueFor(final String key, final Boolean defaultValue) {
		final String property = this.parameters.getProperty(key, defaultValue.toString());
		return Boolean.parseBoolean(property);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.ParametersInterface#valueFor(java.lang.String,
	 * java.lang.Long)
	 */
	@Override
	public Long valueFor(final String key, final Long defaultValue) {
		final String property = this.parameters.getProperty(key, defaultValue.toString());
		return Long.parseLong(property);
	}
}
