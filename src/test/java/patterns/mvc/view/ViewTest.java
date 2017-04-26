
package patterns.mvc.view;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * The ViewTest Class.
 */
public class ViewTest {

	/**
	 * Unit Test to show the view.
	 */
	@Test
	public void testShowView() {
		final View view = new View();
		assertNotNull(view);
		view.showView();
	}

}
