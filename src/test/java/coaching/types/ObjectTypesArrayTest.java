
package coaching.types;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * The ObjectTypesArrayTest Class.
 */
public class ObjectTypesArrayTest {

	/**
	 * Unit Test to display.
	 */
	@Test
	public void testDisplay() {
		final ObjectTypesArray objectTypes = new ObjectTypesArray();
		assertNotNull("Value cannot be null",objectTypes);
		objectTypes.display();
	}

}
