
package patterns.filter;

/**
 * Filter Interface.
 */
public interface FilterInterface {

    /**
     * next filter.
     *
     * @param newFilter
     *            the new filter
     * @return the filter interface
     */
    public FilterInterface addNextFilter(final FilterInterface newFilter);

    /**
     * handleRequest.
     *
     * @param payload
     *            the payload
     */
    public void handleRequest(final PayloadInterface payload);

}
