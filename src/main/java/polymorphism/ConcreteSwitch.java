
package polymorphism;

/**
 * The ConcreteSwitch Class.
 */
public final class ConcreteSwitch extends AbstractSwitch<String, AbstractCommand> implements CommandInterface {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * The Pass Class.
	 */
	protected final class Pass extends AbstractCommand {

		/*
		 * (non-Javadoc)
		 *
		 * @see polymorphism.AbstractCommand#doProcess()
		 */
		@Override
		public boolean doProcess() {
			return true;
		}
	}

	/**
	 * The Fail Class.
	 */
	protected final class Fail extends AbstractCommand {

		/*
		 * (non-Javadoc)
		 *
		 * @see polymorphism.AbstractCommand#doProcess()
		 */
		@Override
		public boolean doProcess() {
			return false;
		}
	}

	/**
	 * Instantiates a new concrete switch.
	 */
	public ConcreteSwitch() {
		super.put("PASS", new Pass());
		super.put("FAIL", new Fail());
	}

}
