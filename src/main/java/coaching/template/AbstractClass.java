
package coaching.template;

import org.slf4j.*;

/**
 * AbstractClass Class.
 */
public abstract class AbstractClass {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/**
	 * Template method.
	 */
	public void templateMethod() {
		primitiveOperationA();
		primitiveOperationB();
	}

	/**
	 * Primitive operation A.
	 */
	abstract protected void primitiveOperationA();

	/**
	 * Primitive operation B.
	 */
	abstract protected void primitiveOperationB();
}
