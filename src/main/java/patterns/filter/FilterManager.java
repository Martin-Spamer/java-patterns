package patterns.filter;

/**
 * Filter Manager Class.
 */
public final class FilterManager {

	private FilterInterface first;

	/**
	 * Instantiates a new filter manager.
	 */
	public FilterManager() {
		super();
	}

	/**
	 * Operation that needs to be filtered.
	 */
	public void operation() {
		this.first = new FilterOne();
		this.first.addNextFilter(new FilterTwo());
		this.first.addNextFilter(new FilterThree());
		this.first.handleRequest(new Payload());
	}

}
