
package coaching.resources;

import java.io.FileInputStream;
import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Configuration Class.
 */
public class ResourceLoader {
	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private String filename = String.format("%s.properties", this.getClass().getSimpleName());
	private boolean loaded = false;

	/**
	 * Construct a new configuration instance.
	 *
	 */
	public ResourceLoader() {
		super();
		loadResource(this.filename);
	}

	/**
	 * Construct a new configuration instance.
	 *
	 * @param propertyFileName
	 *            the property file name
	 */
	public ResourceLoader(final String propertyFileName) {
		super();
		setFilename(propertyFileName);
		loadResource(this.filename);
	}

	/**
	 * Sets the property file name.
	 *
	 * @param propertyFileName
	 *            the property file name
	 * @return this for a fluent interface.
	 */
	public ResourceLoader setFilename(final String propertyFileName) {
		final String suffix = ".properties";
		if (propertyFileName.endsWith(suffix)) {
			this.filename = propertyFileName;
		} else {
			this.filename = String.format("%s%s", propertyFileName, suffix);
		}
		return this;
	}

	/**
	 * Gets the property file name.
	 *
	 * @return the property file name
	 */
	public String getFilename() {
		return this.filename;
	}

	/**
	 * Checks if is loaded.
	 *
	 * @return true, if is loaded
	 */
	public boolean isLoaded() {
		return this.loaded;
	}

	/**
	 * Load the configuration from the resources.
	 *
	 * @param propertyFileName
	 *            the property file name
	 * @return this for a fluent interface.
	 */
	public ResourceLoader loadResource(final String propertyFileName) {
		final InputStream streamForResource = streamForResource(propertyFileName);
		return loadFrom(streamForResource);
	}

	/**
	 * Load the configuration form the property file name.
	 *
	 * @param filename
	 *            the property file name
	 * @return this for a fluent interface.
	 */
	public ResourceLoader loadFrom(final String filename) {
		try {
			final FileInputStream inputStream = new FileInputStream(filename);
			loadFrom(inputStream);
			this.loaded = true;
		} catch (final Exception e) {
			this.log.error("{}", e.toString());
		}
		return this;
	}

	/**
	 * Load the configuration form the property file name.
	 *
	 * @param streamForResource
	 *            the property InputStream
	 * @return this for a fluent interface.
	 */
	public ResourceLoader loadFrom(final InputStream streamForResource) {
		try {
			this.loaded = true;
		} catch (final Exception e) {
			this.log.error("{}", e.toString());
		}
		return this;
	}

	/**
	 * Stream for resource.
	 *
	 * @param propertyFileName
	 *            the property file name
	 * @return the input stream
	 */
	protected InputStream streamForResource(final String propertyFileName) {
		// legacy example <code>final ClassLoader classLoader =
		// this.getClass().getClassLoader();</code>
		final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		return classLoader.getResourceAsStream(propertyFileName);
	}

}
