
package patterns.mvc.view;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * ViewTest Class.
 */
public class ViewTest {

	/**
	 * view.
	 */
	@Test
	public void testShowView() {
		final View view = new View();
		assertNotNull("Value cannot be null", view);
		view.show();
	}

}
