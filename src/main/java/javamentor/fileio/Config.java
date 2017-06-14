/**
 *  @title       Example1.java
 *  @description TODO
 *  @author      martin.spamer.
 *  @version     0.1 - first release.
 *	Created      13-Oct-2004
 **/

package javamentor.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Configuration Class.
 *
 * @author martin.spamer
 * @version 0.1 - 12:23:05
 */
@SuppressWarnings("serial")
public class Config extends java.util.Properties {
	private final boolean loaded = false;

	/**
	 * Instantiates a new config.
	 */
	public Config() {
		final String propertyFileName = this.getClass().getSimpleName() + ".properties";
		load(propertyFileName);
	}

	/**
	 * Instantiates a new config.
	 *
	 * property file name
	 *
	 * @param propertyFileName the property file name
	 */
	public Config(String propertyFileName) {
		load(propertyFileName);
	}

	/**
	 * Load.
	 *
	 * property file name
	 *
	 * @param propertyFileName the property file name
	 */
	public void load(String propertyFileName) {
		try {
			load(new File(propertyFileName));
		} catch (final Exception exception) {
			exception.printStackTrace();
		}
	}

	/**
	 * Load.
	 *
	 * property file
	 *
	 * @param propertyFile the property file
	 */
	public void load(File propertyFile) {
		try {
			super.load(new FileInputStream(propertyFile));
		} catch (final java.lang.Exception exception) {
			exception.printStackTrace();
		}
	}

	/**
	 * Save.
	 *
	 * property file name
	 *
	 * @param propertyFileName the property file name
	 */
	public void save(String propertyFileName) {
		try {
			save(new File(propertyFileName));
		} catch (final Exception exception) {
			exception.printStackTrace();
		}
	}

	/**
	 * Save.
	 *
	 * property file
	 *
	 * @param propertyFile the property file
	 */
	public void save(java.io.File propertyFile) {
		try {
			super.store(new FileOutputStream(propertyFile), "# Header");
		} catch (final Exception exception) {
			exception.printStackTrace();
		}
	}

	/**
	 * Checks if is loaded.
	 *
	 * @return true, if is
	 * 			loaded
	 */
	public boolean isLoaded() {
		return loaded;
	}

}
