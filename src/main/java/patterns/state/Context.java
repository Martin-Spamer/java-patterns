package patterns.state;

/**
 * The Context Class.
 */
public class Context {

	private AbstractState state;

	public void toA() {
		this.state = new StateA();
	}

	public void toZ() {
		this.state = new StateZ();
	}

}
