

package coaching.types;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Class showing usage of native types.
 */
public class NativeTypesTest {

	/**
	 * Unit Test to display.
	 */
	@Test
	public void testDisplay() {
		final NativeTypes nativeTypes = new NativeTypes();
		assertNotNull("Value cannot be null", nativeTypes);
		nativeTypes.display();
	}

}
