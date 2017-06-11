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

	private final Properties parameters = new Properties();
	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	@Override
	public AbstractParameters setPrameter(String key, String value) {
		this.parameters.setProperty(key, value);
		return this;
	}

	@Override
	public Set<String> stringPropertyNames() {
		return this.parameters.stringPropertyNames();
	}

	@Override
	public String valueFor(String key) {
		return this.parameters.getProperty(key);
	}

	@Override
	public String valueFor(String key, String defaultValue) {
		return this.parameters.getProperty(key, defaultValue);
	}

	@Override
	public Boolean valueFor(String key, Boolean defaultValue) {
		final String property = this.parameters.getProperty(key, defaultValue.toString());
		return Boolean.parseBoolean(property);
	}

	@Override
	public Long valueFor(String key, Long defaultValue) {
		final String property = this.parameters.getProperty(key, defaultValue.toString());
		return Long.parseLong(property);
	}
}
