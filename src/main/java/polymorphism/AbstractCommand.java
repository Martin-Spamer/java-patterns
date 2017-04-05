
package polymorphism;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The AbstractCommand Class.
 */
public abstract class AbstractCommand implements CommandInterface {

	/** The log. */
	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/**
	 * Do process.
	 *
	 * @return true, if successful
	 */
	public abstract boolean doProcess();

}
