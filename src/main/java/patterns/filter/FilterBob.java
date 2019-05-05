
package patterns.filter;

import lombok.extern.slf4j.Slf4j;

/**
 * Second Filter.
 */




@Slf4j
public final class FilterBob extends AbstractFilter {

    /**
     * Instantiates a new filter two.
     */
    public FilterBob() {
        super();
    }

    /**
     * Instantiates a new filter two.
     *
     * filter
     *
     * @param filter the filter
     */
    public FilterBob(final FilterInterface filter) {
        super(filter);
    }

}
