package patterns.facade;

/**
 * Concrete Facade Class.
 */
public final class ConcreteFacade implements FacadeInterface {

	private SubSystemOne subSystemOne = null;
	private SubSystemTwo subSystemTwo = null;
	private SubSystemThree subSystemThree = null;

	/**
	 * Instantiates a new concrete facade.
	 */
	public ConcreteFacade() {
		super();

		subSystemOne = new SubSystemOne();
		subSystemTwo = new SubSystemTwo();
		subSystemThree = new SubSystemThree();
	}

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
		subSystemOne.operation();
	}

	/**
	 * Sub system two operation.
	 */
	public void subSystemTwoOperation() {
		subSystemTwo.operation();
	}

	/**
	 * Sub system three operation.
	 */
	public void subSystemThreeOperation() {
		subSystemThree.operation();
	}

}
