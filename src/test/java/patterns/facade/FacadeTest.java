

package patterns.facade;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * class FacadeTest.
 */
public class FacadeTest {

	/**
	 * Unit Test to concrete facade operation.
	 */
	@Test
	public void testConcreteFacadeOperation() {
		assertNotNull("Value cannot be null", new ConcreteFacade());
	}

}
