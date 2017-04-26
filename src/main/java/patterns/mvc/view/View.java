package patterns.mvc.view;

/**
 * The View Class.
 */
public class View extends AbstractView {

	/**
	 * Instantiates a new view.
	 */
	public View() {
		super();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.mvc.view.AbstractView#showView()
	 */
	@Override
	public void showView() {
		this.log.info("{}.showView", this.getClass().getSimpleName());
	}

}
