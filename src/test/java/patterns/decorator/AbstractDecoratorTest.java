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
	public void testBefore() {
		final DecoratedComponent concreteComponent = new DecoratedComponent();
		assertNotNull(concreteComponent);
		final AbstractComponent behaviour = new ConcreteDecorator();
		concreteComponent.attachBefore(behaviour);
		concreteComponent.operation();
		concreteComponent.detachBefore(behaviour);
		concreteComponent.operation();
	}

	@Test
	public void testAfter() {
		final DecoratedComponent concreteComponent = new DecoratedComponent();
		assertNotNull(concreteComponent);
		final AbstractComponent behaviour = new ConcreteDecorator();
		concreteComponent.attachAfter(behaviour);
		concreteComponent.operation();
		concreteComponent.detachAfter(behaviour);
		concreteComponent.operation();
	}

}
