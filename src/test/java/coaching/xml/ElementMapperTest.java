


package coaching.xml;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * class ElementMapperTest.
 */
public class ElementMapperTest {

	/**
	 * Unit Test to element mapper.
	 */
	@Test
	public void testElementMapper() {
		final ElementMapper elementMapper = new ElementMapper();
		assertNotNull("Value cannot be null", elementMapper);
	}

}
