package patterns.interpreter;

public class Context implements ContextInterface {

	private Object state;

	public Context() {
		super();
		this.setState(new String(""));
	}

	public Context(final String state) {
		super();
		this.setState(state);
	}

	public void setState(Object state) {
		this.state = state;
	}

	public Object getState() {
		return this.state;
	}

}
