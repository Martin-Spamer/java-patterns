
package automation;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

/**
 * AbstractData Class.
 */
public abstract class AbstractData implements DataInterface {
	private final Properties properties = new Properties();

	/**
	 * property.
	 *
	 * key
	 * value
	 * abstract data
	 *
	 * @param key the key
	 * @param value the value
	 * @return the abstract data
	 */
	public AbstractData setProperty(String key, String value) {
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
	 * abstract data
	 *
	 * @param inStream the in stream
	 * @return the abstract data
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public AbstractData load(InputStream inStream) throws IOException {
		properties.load(inStream);
		return this;
	}

	/**
	 * Load from XML.
	 *
	 * in
	 * abstract data
	 *
	 * @param in the in
	 * @return the abstract data
	 * @throws IOException Signals that an I/O exception has occurred.
	 * invalid properties format exception
	 * @throws InvalidPropertiesFormatException the invalid properties format exception
	 */
	public AbstractData loadFromXML(InputStream in) throws IOException, InvalidPropertiesFormatException {
		properties.loadFromXML(in);
		return this;
	}

	/**
	 * Store.
	 *
	 * out
	 * abstract data
	 *
	 * @param out the out
	 * @return the abstract data
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public AbstractData store(OutputStream out) throws IOException {
		return this.store(out, "");
	}

	/**
	 * Store.
	 *
	 * out
	 * comments
	 * abstract data
	 *
	 * @param out the out
	 * @param comments the comments
	 * @return the abstract data
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public AbstractData store(OutputStream out, String comments) throws IOException {
		properties.store(out, comments);
		return this;
	}

}
