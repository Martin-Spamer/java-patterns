
package patterns.state;

/**
 * Context Class.
 */
public class Context {

	private AbstractState state = null;

	/**
	 * Instantiates a new context.
	 *
	 * @param state
	 *            the state
	 */
	public Context(final AbstractState state) {
		super();
		this.state = state;
	}

	/**
	 * To A.
	 */
	public void toA() {
		this.state = new StateAlice();
	}

	/**
	 * To Z.
	 */
	public void toZ() {
		this.state = new StateBob();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Context [state=%s]", this.state);
	}

}
