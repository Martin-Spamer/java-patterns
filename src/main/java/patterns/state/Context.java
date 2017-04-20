package patterns.state;

/**
 * The Context Class.
 */
public class Context {

	private AbstractState state;

	public void toA() {
		state = new StateA();
	}

	public void toZ() {
		state = new StateZ();
	}

}
