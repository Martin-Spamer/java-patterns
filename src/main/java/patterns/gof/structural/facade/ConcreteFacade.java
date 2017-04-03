
package patterns.gof.structural.facade;

/**
 * The Class ConcreteFacade.
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
	}

	/**
	 * Sub system two operation.
	 */
	public void subSystemTwoOperation() {
	}

	/**
	 * Sub system three operation.
	 */
	public void subSystemThreeOperation() {
	}

}
