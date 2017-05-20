
package patterns.facade;

/**
 * The ConcreteFacade Class.
 */
public final class ConcreteFacade implements FacadeInterface {

	private SubSystemOne subSystemOne;
	private SubSystemTwo subSystemTwo;
	private SubSystemThree subSystemThree;
	private ConcreteFacade concreteFacade;

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.facade.FacadeInterface#operation()
	 */
	@Override
	public void operation() {
	}

	/**
	 * Sub system one operation.
	 */
	public void subSystemOneOperation() {
		new SubSystemOne().operation();
	}

	/**
	 * Sub system two operation.
	 */
	public void subSystemTwoOperation() {
		new SubSystemTwo().operation();
	}

	/**
	 * Sub system three operation.
	 */
	public void subSystemThreeOperation() {
		new SubSystemThree().operation();
	}

}
