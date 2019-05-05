
package patterns.filter;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * The FilterManagerTest class.
 */


@Slf4j
public final class FilterManagerTest {

    /**
     * Unit Test to filter manager.
     */
    @Test
    public void testFilter() {
        final FilterAlice filterChain = new FilterAlice(new FilterBob(new FilterCharlie()));
        assertNotNull(filterChain);
        filterChain.handleRequest(new Payload());
    }

    /**
     * Unit Test to filter manager.
     */
    @Test
    public void testFilterManager() {
        final FilterManager filterManager = new FilterManager();
        assertNotNull(filterManager);
        filterManager.operation();
    }

}
