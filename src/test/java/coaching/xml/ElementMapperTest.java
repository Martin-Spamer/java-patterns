package coaching.xml;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ElementMapperTest {

	@Test
	public void testElementMapper() {
		final ElementMapper elementMapper = new ElementMapper();
		assertNotNull("Value cannot be null",elementMapper);
	}

}
