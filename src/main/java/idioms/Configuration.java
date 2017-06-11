package idioms;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Configuration, uses ClassName as the propertyFilename.
 */
public class Configuration {
	private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private final Properties properties = new Properties();

	/**
	 * Instantiates a new configuration.
	 */
	public Configuration() {
		super();
		try {
			final String resourceName = resourceName();
			final InputStream inputStream = inputStream(resourceName);
			this.properties.load(inputStream);
		} catch (final IOException e) {
			this.log.error("{}", e);
		}
	}

	private String resourceName() {
		final String simpleName = this.getClass().getSimpleName();
		final String filename = String.format("%s.properties", simpleName);
		return filename;
	}

	/**
	 * Input stream for resourceName.
	 *
	 * @param resourceName the resource name
	 * @return the input stream
	 */
	private InputStream inputStream(final String resourceName) {
		final ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		final InputStream resourceAsStream = classloader.getResourceAsStream(resourceName);
		return resourceAsStream;
	}

	public String valueFor(String key) {
		final String property = System.getProperty(key);
		if (property == null) {
			return this.properties.getProperty(key);
		}
		return property;
	}

	public String valueFor(String key, String defaultValue) {
		final String property = System.getProperty(key);
		if (property == null) {
			return this.properties.getProperty(key, defaultValue);
		}
		return property;
	}

	public String toPrettyString() {
		return String.format("Configuration [properties=%s]", format(this.properties.toString()));
	}

	private Object format(final String string) {
		return string.replace("{", "\n\t{\n\t").replace(", ", "\n\t").replace("}", "\n\t}\n");
	}

	@Override
	public String toString() {
		return String.format("Configuration [properties=%s]", this.properties);
	}
}
