
package patterns.filter;

import lombok.extern.slf4j.Slf4j;

/**
 * Third Filter.
 */
@Slf4j
public final class FilterCharlie extends AbstractFilter {

    /**
     * Instantiates a new filter three.
     */
    public FilterCharlie() {
        super();
    }

    /**
     * Instantiates a new filter three.
     *
     * filter
     *
     * @param filter the filter
     */
    public FilterCharlie(final FilterInterface filter) {
        super(filter);
    }
}
