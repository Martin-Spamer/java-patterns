


package coaching.types;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Unit Tests for Primitives Arrays.
 */
public class PrimitivesArrayTest {

	/**
	 * Unit Test to display array.
	 */
	@Test
	public void testDisplay() {
		final PrimitivesArray primitivesArray = new PrimitivesArray();
		assertNotNull("Value cannot be null", primitivesArray);
		primitivesArray.display();
	}

	/**
	 * Unit Test to display array.
	 */
	@Test
	public void testDisplayMatrix() {
		final PrimitivesArray primitivesArray = new PrimitivesArray();
		assertNotNull("Value cannot be null", primitivesArray);
		primitivesArray.displayMatrix();
	}

	/**
	 * Unit Test to display array.
	 */
	@Test
	public void testDisplayArray() {
		final PrimitivesArray primitivesArray = new PrimitivesArray();
		assertNotNull("Value cannot be null", primitivesArray);
		primitivesArray.iterateArray();
	}
}
