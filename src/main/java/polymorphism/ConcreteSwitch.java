
package polymorphism;

/**
 * The Class ConcreteSwitch.
 */
public final class ConcreteSwitch extends AbstractSwitch<String, Object> {

	/**
	 * The Class Pass.
	 */
	protected final class Pass {
	}

	/**
	 * The Class Fail.
	 */
	protected final class Fail {
	}

	/**
	 * Instantiates a new concrete switch.
	 */
	public ConcreteSwitch() {
		add("Pass", new Pass());
		add("CaseB", new Fail());

	}
}
