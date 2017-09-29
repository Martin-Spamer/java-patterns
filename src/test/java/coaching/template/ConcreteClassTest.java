package coaching.template;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ConcreteClassTest {

	@Test
	public void testPrimitiveOperationA() {
		final ConcreteTemplate concreteClass = new ConcreteTemplate();
		assertNotNull("Value cannot be null",concreteClass);
		assertNotNull("Value cannot be null",concreteClass.primitiveOperationAlice());
	}

	@Test
	public void testPrimitiveOperationB() {
		final ConcreteTemplate concreteClass = new ConcreteTemplate();
		assertNotNull("Value cannot be null",concreteClass);
		assertNotNull("Value cannot be null",concreteClass.primitiveOperationBob());
	}

}
