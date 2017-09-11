
package coaching.types;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * The ObjectTypesTest Class.
 */
public class ObjectTypesTest {

	/**
	 * Unit Test to display.
	 */
	@Test
	public void testDisplay() {
		final ObjectTypes objectTypes = new ObjectTypes();
		assertNotNull(objectTypes);
		objectTypes.display();
	}

}
