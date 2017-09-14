package automation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Abstract Page class.
 */
public abstract class AbstractPage {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/**
	 * Login.
	 */
	public void login() {
		this.log.info("login");
	}

	/**
	 * Verify that.
	 */
	public void verify() {
		this.log.info("verify");
	}

}
