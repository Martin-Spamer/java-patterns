
package patterns.state;

/**
 * The Context Class.
 */
public class Context {

	private AbstractState state;

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

}
