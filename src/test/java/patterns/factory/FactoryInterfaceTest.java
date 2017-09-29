package patterns.factory;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * FactoryInterfaceTest Class.
 */
public class FactoryInterfaceTest {

	private static final Logger LOG = LoggerFactory.getLogger(FactoryInterfaceTest.class);

	/**
	 * Unit Test to factory one.
	 */
	@Test
	public void testFactoryOne() {
		LOG.info("testFactoryOne");
		final ConcreteFactoryOne factory = new ConcreteFactoryOne();
		assertNotNull("Value cannot be null",factory);
		final AbstractProductA productA = factory.createProductA();
		assertNotNull("Value cannot be null",productA);
		final AbstractProductB productB = factory.createProductB();
		assertNotNull("Value cannot be null",productB);
	}

	/**
	 * Unit Test to factory two.
	 */
	@Test
	public void testFactoryTwo() {
		LOG.info("testFactoryOne");
		final ConcreteFactoryTwo factory = new ConcreteFactoryTwo();
		assertNotNull("Value cannot be null",factory);
		final AbstractProductA productA = factory.createProductA();
		assertNotNull("Value cannot be null",productA);
		final AbstractProductB productB = factory.createProductB();
		assertNotNull("Value cannot be null",productB);
	}

}
