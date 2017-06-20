
package patterns.filter;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * The FilterManagerTest Class.
 */
public class FilterManagerTest {

	/**
	 * Unit Test to filter manager.
	 */
	@Test
	public void testFilter() {
		final FilterOne filterChain = new FilterOne(new FilterTwo(new FilterThree()));
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
