package patterns.interpreter;

import org.slf4j.*;

/**
 * Represent the current context Class.
 */
public class Context implements ContextInterface {

	private static final Logger LOG = LoggerFactory.getLogger(Context.class);
	private Object state;
	private Boolean result;

	/**
	 * Instantiates a new context.
	 */
	public Context() {
		super();
		setState("");
	}

	/**
	 * Instantiates a new context.
	 *
	 * @param state the state
	 */
	public Context(final Object state) {
		super();
		setState(state);
	}

	/**
	 * Set the state.
	 *
	 * @param state the new
	 * 			state
	 * @return
	 */
	public Context setState(final Object state) {
		this.state = state;
		return this;
	}

	/**
	 * get the current state.
	 *
	 * @return the state
	 */
	public Object getState() {
		return this.state;
	}

	/* (non-Javadoc)
	 * @see patterns.interpreter.ContextInterface#contains(patterns.interpreter.Data)
	 */
	@Override
	public boolean contains(final Object state) {
		return false;
	}

}
