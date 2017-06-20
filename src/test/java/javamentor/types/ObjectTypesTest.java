package javamentor.types;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ObjectTypesTest {

	@Test
	public void testDisplay() {
		final ObjectTypes objectTypes = new ObjectTypes();
		assertNotNull(objectTypes);
		objectTypes.display();
	}

}
