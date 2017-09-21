
package automation;

import org.slf4j.*;

/**
 * Abstract Page class.
 */
public abstract class AbstractPage {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/**
	 * Login.
	 */
	public void open() {
		this.log.info("open");
	}

	/**
	 * Verify that.
	 */
	public void verify() {
		this.log.info("verify");
	}

}
