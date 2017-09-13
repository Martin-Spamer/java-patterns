
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
		this.state = new StateA();
	}

	/**
	 * To Z.
	 */
	public void toZ() {
		this.state = new StateZ();
	}

	@Override
	public String toString() {
		return String.format("Context [state=%s]", this.state);
	}

}
