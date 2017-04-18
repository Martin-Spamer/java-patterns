package patterns.decorator;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

public class AbstractDecoratorTest {

	@Test
	public void testOperation() {
		final ConcreteComponent concreteComponent = new ConcreteComponent();
		assertNotNull(concreteComponent);
	}

	@Test
	public void testAttach() {
		fail("Not yet implemented");
	}

	@Test
	public void testDetach() {
		fail("Not yet implemented");
	}

}