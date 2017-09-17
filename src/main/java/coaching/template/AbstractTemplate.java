package coaching.template;

import org.slf4j.*;

/**
 * Abstract Template Class.
 */
public abstract class AbstractTemplate {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/**
	 * Template method provides common entry.
	 */
	public void templateMethod() {
		primitiveOperationAlice();
		primitiveOperationBob();
	}

	/**
	 * Primitive operation A.
	 */
	abstract protected AbstractTemplate primitiveOperationAlice();

	/**
	 * Primitive operation B.
	 */
	abstract protected AbstractTemplate primitiveOperationBob();
}
