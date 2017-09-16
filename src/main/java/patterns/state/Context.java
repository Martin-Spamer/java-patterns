
package patterns.state;

/**
 * Context Class.
 */
public class Context {

	private AbstractState state = null;

	public Context(final AbstractState state) {
		super();
		this.state = state;
	}

	/**
	 * To A.
	 */
	public void toA() {
		state = new StateA();
	}

	/**
	 * To Z.
	 */
	public void toZ() {
		state = new StateZ();
	}

	@Override
	public String toString() {
		return String.format("Context [state=%s]", state);
	}

}
