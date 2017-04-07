package polymorphism;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TypeTest {

	@Test
	public void testType() {
		final AbstractType subTypeA = new SubTypeA();
		assertNotNull(subTypeA);
		final AbstractType subTypeB = new SubTypeB();
		assertNotNull(subTypeB);
	}

}
