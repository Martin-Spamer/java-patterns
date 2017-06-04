/**
 * CurrentWorkingDirectory.java
 * Created on 21 July 2005, 14:39
 */

package javamentor.csv;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The CurrentWorkingDirectory Class.
 */
public class CurrentWorkingDirectory {

	/** The log. */
	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/**
	 * Instantiates a new current working directory.
	 */
	public CurrentWorkingDirectory() {
		mark(this);
	}

	/**
	 * Mark.
	 *
	 * @param that the that
	 * @return the string
	 */
	public String mark(final Object that) {
		String absolutePath = null;
		try {
			final String className = that.getClass().getSimpleName();
			final String fileName = String.format("%s.CurrentWorkingDirectory", className);
			final File file = new File(fileName);
			try {
				file.createNewFile();
				absolutePath = file.getAbsolutePath();
				this.log.info("{}", absolutePath);
			} catch (final Exception exception) {
				this.log.debug(exception.toString());
			}
		} catch (final Exception exception) {
			this.log.error(exception.toString());
		}
		return absolutePath;
	}
}