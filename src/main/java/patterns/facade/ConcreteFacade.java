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

	/**
	 * Instantiates a new concrete facade.
	 */
	public ConcreteFacade() {
		super();

		this.subSystemOne = new SubSystemOne();
		this.subSystemTwo = new SubSystemTwo();
		this.subSystemThree = new SubSystemThree();
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
