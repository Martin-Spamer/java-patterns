
package patterns.filter;

import lombok.extern.slf4j.Slf4j;

/**
 * Filter Manager Class.
 */




@Slf4j
public final class FilterManager {

    /**
     * Operation that needs to be filtered.
     */
    public void operation() {
        final FilterInterface first = new FilterAlice();
        first.addNextFilter(new FilterBob());
        first.addNextFilter(new FilterCharlie());
        first.handleRequest(new Payload());
    }

}
