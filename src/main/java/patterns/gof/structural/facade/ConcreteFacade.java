
package patterns.gof.structural.facade;

/**
 * The ConcreteFacade Class.
 */
class ConcreteFacade implements FacadeInterface {

	/** The my sub system one. */
	public SubSystemOne mySubSystemOne;

	/** The my sub system two. */
	public SubSystemTwo mySubSystemTwo;

	/** The my sub system three. */
	public SubSystemThree mySubSystemThree;

	/** The my concrete facade. */
	public ConcreteFacade myConcreteFacade;

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
