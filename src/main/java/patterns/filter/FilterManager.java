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
		first = new FilterOne();
		first.addNextFilter(new FilterTwo());
		first.addNextFilter(new FilterThree());
		first.handleRequest(new Payload());
	}

}
