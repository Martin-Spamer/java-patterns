package javamentor.types;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ObjectTypesArrayTest {

	@Test
	public void testDisplay() {
		final ObjectTypesArray objectTypes = new ObjectTypesArray();
		assertNotNull(objectTypes);
		objectTypes.display();
	}

}
