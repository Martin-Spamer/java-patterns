package patterns.visitor;

/**
 * Element Class.
 */
public final class Element extends AbstractElement {

	@Override
	public void accept(final VisitorInterface visitor) {
		this.log.info("{}.accept", this.getClass().getSimpleName());
	}

}
