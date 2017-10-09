
package patterns.facade;

/**
 * Concrete Facade Class.
 */
public final class ConcreteFacade implements FacadeInterface {

	private final SubSystemOne subSystemOne = new SubSystemOne();
	private final SubSystemTwo subSystemTwo = new SubSystemTwo();
	private final SubSystemThree subSystemThree = new SubSystemThree();

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.facade.FacadeInterface#operation()
	 */
	@Override
	public void operation() {
		subSystemOneOperation();
		subSystemTwoOperation();
		subSystemThreeOperation();
	}

	/**
	 * Sub system one operation.
	 */
	public void subSystemOneOperation() {
		this.subSystemOne.operation();
	}

	/**
	 * Sub system two operation.
	 */
	public void subSystemTwoOperation() {
		this.subSystemTwo.operation();
	}

	/**
	 * Sub system three operation.
	 */
	public void subSystemThreeOperation() {
		this.subSystemThree.operation();
	}

}
