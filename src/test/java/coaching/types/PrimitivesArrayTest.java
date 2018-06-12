
package coaching.types;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import coaching.arrays.NativeTypesArray;

/**
 * Unit Tests for Primitives Arrays.
 */
public class PrimitivesArrayTest {

	/**
	 * Unit Test to display array.
	 */
	@Test
	public void testDisplay() {
		final NativeTypesArray primitivesArray = new NativeTypesArray();
		assertNotNull("Value cannot be null", primitivesArray);
		primitivesArray.display();
	}

	/**
	 * Unit Test to display array.
	 */
	@Test
	public void testDisplayMatrix() {
		final NativeTypesArray primitivesArray = new NativeTypesArray();
		assertNotNull("Value cannot be null", primitivesArray);
		primitivesArray.displayMatrix();
	}

	/**
	 * Unit Test to display array.
	 */
	@Test
	public void testDisplayArray() {
		final NativeTypesArray primitivesArray = new NativeTypesArray();
		assertNotNull("Value cannot be null", primitivesArray);
		primitivesArray.iterateArray();
	}
}
