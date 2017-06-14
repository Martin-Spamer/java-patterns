
package patterns.filter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

/**
 * AbstractPayload Class.
 */
public class AbstractPayload {

	private final Properties properties;

	/**
	 * Instantiates a new abstract payload.
	 */
	public AbstractPayload() {
		super();
		properties = new Properties();
	}

	/**
	 * Instantiates a new abstract payload.
	 *
	 * @param key the key
	 * @param value the value
	 */
	public AbstractPayload(String key, String value) {
		this();
		setProperty(key, value);
	}

	/**
	 * property.
	 *
	 * key
	 * value
	 * abstract payload
	 *
	 * @param key the key
	 * @param value the value
	 * @return the abstract payload
	 */
	public AbstractPayload setProperty(String key, String value) {
		properties.setProperty(key, value);
		return this;
	}

	/**
	 * Size.
	 *
	 * int
	 *
	 * @return the int
	 */
	public int size() {
		return properties.size();
	}

	/**
	 * property.
	 *
	 * key
	 * property
	 *
	 * @param key the key
	 * @return the property
	 */
	public String getProperty(String key) {
		return properties.getProperty(key);
	}

	/**
	 * property.
	 *
	 * key
	 * default value
	 * property
	 *
	 * @param key the key
	 * @param defaultValue the default value
	 * @return the property
	 */
	public String getProperty(String key, String defaultValue) {
		return properties.getProperty(key, defaultValue);
	}

	/**
	 * Load.
	 *
	 * in stream
	 * abstract payload
	 *
	 * @param inStream the in stream
	 * @return the abstract payload
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public AbstractPayload load(InputStream inStream) throws IOException {
		properties.load(inStream);
		return this;
	}

	/**
	 * Load from XML.
	 *
	 * in
	 * abstract payload
	 *
	 * @param in the in
	 * @return the abstract payload
	 * @throws IOException Signals that an I/O exception has occurred.
	 * invalid properties format exception
	 * @throws InvalidPropertiesFormatException the invalid properties format exception
	 */
	public AbstractPayload loadFromXML(InputStream in) throws IOException, InvalidPropertiesFormatException {
		properties.loadFromXML(in);
		return this;

	}

	/**
	 * Store.
	 *
	 * out
	 * abstract payload
	 *
	 * @param out the out
	 * @return the abstract payload
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public AbstractPayload store(OutputStream out) throws IOException {
		return this.store(out, "");
	}

	/**
	 * Store.
	 *
	 * out
	 * comments
	 * abstract payload
	 *
	 * @param out the out
	 * @param comments the comments
	 * @return the abstract payload
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public AbstractPayload store(OutputStream out, String comments) throws IOException {
		properties.store(out, comments);
		return this;
	}

}