
package patterns.filter;

/**
 * AbstractFilter Class.
 */
public class AbstractFilter implements FilterInterface {

	private FilterInterface nextFilter = null;

	/**
	 * Instantiates a new abstract filter.
	 */
	public AbstractFilter() {
		super();
	}

	/**
	 * Instantiates a new abstract filter.
	 *
	 * filter
	 *
	 * @param filter the filter
	 */
	public AbstractFilter(FilterInterface filter) {
		super();
		addNextFilter(filter);
	}

	/* (non-Javadoc)
	 * @see patterns.filter.FilterInterface#addNextFilter(patterns.filter.FilterInterface)
	 */
	@Override
	public FilterInterface addNextFilter(FilterInterface newFilter) {
		if (nextFilter == null) {
			nextFilter = newFilter;
		} else {
			nextFilter.addNextFilter(newFilter);
		}
		return this;
	}

	/* (non-Javadoc)
	 * @see patterns.filter.FilterInterface#handleRequest(patterns.filter.PayloadInterface)
	 */
	@Override
	public void handleRequest(PayloadInterface payload) {
		if (nextFilter != null) {
			nextFilter.handleRequest(payload);
		}
	}

}
