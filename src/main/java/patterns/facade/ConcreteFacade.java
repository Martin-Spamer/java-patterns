
package patterns.facade;

import org.slf4j.*;

/**
 * Concrete Facade Class.
 */
public final class ConcreteFacade implements FacadeInterface {

	private static final Logger LOG = LoggerFactory.getLogger(ConcreteFacade.class);
	private SubSystemOne subSystemOne = null;
	private SubSystemTwo subSystemTwo = null;
	private SubSystemThree subSystemThree = null;
	private ConcreteFacade concreteFacade = null;

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
