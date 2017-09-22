
package patterns.filter;

/**
 * FilterInterface Interface.
 */
public interface FilterInterface {

	/**
	 * next filter.
	 *
	 * @param newFilter the new filter
	 * @return the filter interface
	 */
	public FilterInterface addNextFilter(FilterInterface newFilter);

	/**
	 * handleRequest.
	 *
	 * @param payload the payload
	 */
	public void handleRequest(PayloadInterface payload);

}
