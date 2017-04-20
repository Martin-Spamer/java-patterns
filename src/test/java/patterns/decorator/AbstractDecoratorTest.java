package patterns.decorator;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbstractDecoratorTest {

	private static final Logger LOG = LoggerFactory.getLogger(AbstractDecoratorTest.class);

	@Test
	public void testOperation() {
		final DecoratedComponent concreteComponent = new DecoratedComponent();
		assertNotNull(concreteComponent);
		concreteComponent.operation();
	}

	@Test
	public void testAttachDetach() {
		final DecoratedComponent concreteComponent = new DecoratedComponent();
		assertNotNull(concreteComponent);
		final Behaviour behaviour = new Behaviour();
		concreteComponent.attachBehaviour(behaviour);
		concreteComponent.operation();
		concreteComponent.detachtBehaviour(behaviour);
	}

}
