package patterns.hopp;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class LocalHoppTest {

	@Test
	public void testLocalMethod() {
		assertNotNull("Value cannot be null",new LocalHopp());
	}

}
