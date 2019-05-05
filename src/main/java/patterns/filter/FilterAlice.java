
package patterns.filter;

import lombok.extern.slf4j.Slf4j;

/**
 * First Filter.
 */




@Slf4j
public final class FilterAlice extends AbstractFilter {

    /**
     * Instantiates a new filter one.
     */
    public FilterAlice() {
        super();
    }

    /**
     * Instantiates a new filter one.
     *
     * filter
     *
     * @param filter the filter
     */
    public FilterAlice(final FilterInterface filter) {
        super(filter);
    }

}
