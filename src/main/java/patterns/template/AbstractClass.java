package patterns.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Template Methods
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
