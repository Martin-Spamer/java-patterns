
package patterns.filter;

/**
 * FilterInterface Interface.
 */
public interface FilterInterface {

	/**
	 * next filter.
	 *
	 * filter
	 * abstract filter
	 *
	 * @param newFilter the new filter
	 * @return the filter interface
	 */
	FilterInterface addNextFilter(FilterInterface newFilter);

	/**
	 * handleRequest.
	 *
	 * request
	 *
	 * @param payload the payload
	 */
	void handleRequest(PayloadInterface payload);

}