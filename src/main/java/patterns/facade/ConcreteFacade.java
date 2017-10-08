


package patterns.facade;

/**
 * Concrete Facade Class.
 */
public final class ConcreteFacade implements FacadeInterface {

	private final SubSystemOne subSystemOne = new SubSystemOne();
	private final SubSystemTwo subSystemTwo = new SubSystemTwo();
	private final SubSystemThree subSystemThree = new SubSystemThree();

	/**
	 * Instantiates a new concrete facade.
	 */
	public ConcreteFacade() {
		super();

		//		this.subSystemOne = new SubSystemOne();
		//		this.subSystemTwo = new SubSystemTwo();
		//		this.subSystemThree = new SubSystemThree();
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
