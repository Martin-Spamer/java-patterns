


package patterns.mvc.view;

/**
 * View Class.
 */
public class View extends AbstractView {

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.mvc.view.AbstractView#showView()
	 */
	@Override
	public void show() {
		log.info("{}.showView", this.getClass().getSimpleName());
	}

}
