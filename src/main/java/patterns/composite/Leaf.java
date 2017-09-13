package patterns.composite;

/**
 * Leaf Class.
 */
public class Leaf extends Component {

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.composite.Component#operation()
	 */
	@Override
	public ComponentInterface operation() {
		return this;
	}

}
