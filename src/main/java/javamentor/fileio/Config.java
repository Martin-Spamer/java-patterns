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

	public Config() {
		final String propertyFileName = this.getClass().getSimpleName() + ".properties";
		load(propertyFileName);
	}

	public Config(String propertyFileName) {
		load(propertyFileName);
	}

	public void load(String propertyFileName) {
		try {
			load(new File(propertyFileName));
		} catch (final Exception exception) {
			exception.printStackTrace();
		}
	}

	public void load(File propertyFile) {
		try {
			super.load(new FileInputStream(propertyFile));
		} catch (final java.lang.Exception exception) {
			exception.printStackTrace();
		}
	}

	public void save(String propertyFileName) {
		try {
			save(new File(propertyFileName));
		} catch (final Exception exception) {
			exception.printStackTrace();
		}
	}

	public void save(java.io.File propertyFile) {
		try {
			super.store(new FileOutputStream(propertyFile), "# Header");
		} catch (final Exception exception) {
			exception.printStackTrace();
		}
	}

	public boolean isLoaded() {
		return loaded;
	}

}
