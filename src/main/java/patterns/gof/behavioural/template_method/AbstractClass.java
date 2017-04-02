package patterns.gof.behavioural.template_method;

public abstract class AbstractClass {

	/**
	 * ... primitiveOperationA() ... primitiveOperationB() ...
	 */

	public void templateMethod() {
	}

	abstract protected void primitiveOperationA();

	abstract protected void primitiveOperationB();
}