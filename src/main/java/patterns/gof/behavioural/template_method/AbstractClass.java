
package patterns.gof.behavioural.template_method;

/**
 * The Class AbstractClass.
 */
public abstract class AbstractClass {

	/**
	 * Template method.
	 */

	public void templateMethod() {
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