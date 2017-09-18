package patterns.visitor;

/**
 * Element Class.
 */
public final class Element extends AbstractElement {

	@Override
	public void accept(final VisitorInterface visitor) {
		log.info("{}.accept", this.getClass().getSimpleName());
	}

}
