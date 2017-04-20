package patterns.interpreter;

public class Context implements ContextInterface {

	private Object state;

	public Context() {
		super();
		setState(new String(""));
	}

	public Context(final String state) {
		super();
		setState(state);
	}

	public void setState(Object state) {
		this.state = state;
	}

	public Object getState() {
		return state;
	}

}
