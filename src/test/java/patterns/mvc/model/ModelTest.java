
package patterns.mvc.model;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * The ModelTest Class.
 */
public class ModelTest {

	/**
	 * Unit Test to.
	 */
	@Test
	public void test() {
		final Model model = new Model();
		assertNotNull("Value cannot be null", model);
	}
}
