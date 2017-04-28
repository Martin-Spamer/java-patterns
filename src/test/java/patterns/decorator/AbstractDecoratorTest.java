package patterns.decorator;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbstractDecoratorTest {

	private static final Logger LOG = LoggerFactory.getLogger(AbstractDecoratorTest.class);

	@Test
	public void testOperation() {
		final DecoratedComponent component = new DecoratedComponent();
		assertNotNull(component);
		assertNotNull(component.operation());
		LOG.info("{}", component.toString());
	}

	@Test
	public void testBefore() {
		final DecoratedComponent component = new DecoratedComponent();
		assertNotNull(component);
		final AbstractComponent behaviour = new ConcreteDecorator();
		component.attachBefore(behaviour);
		component.operation();
		component.detachBefore(behaviour);
		component.operation();
	}

	@Test
	public void testAfter() {
		final DecoratedComponent component = new DecoratedComponent();
		assertNotNull(component);
		final AbstractComponent behaviour = new ConcreteDecorator();
		component.attachAfter(behaviour);
		component.operation();
		component.detachAfter(behaviour);
		component.operation();
	}

}
