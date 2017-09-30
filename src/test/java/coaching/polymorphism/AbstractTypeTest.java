
package coaching.polymorphism;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.*;

/**
 * The AbstractTypeTest Class.
 */
public class AbstractTypeTest {

	private static final Logger LOG = LoggerFactory.getLogger(AbstractTypeTest.class);
	private TypeInterface abstractType;

	/**
	 * Unit Test to one.
	 */
	@Test
	public void testSubTypeOne() {
		LOG.info("testPolymorphism");
		abstractType = new SubTypeOne();
		assertNotNull("Value cannot be null", abstractType);
		LOG.info("{}", abstractType);
		assertNotNull("Value cannot be null", abstractType.operation());
		LOG.info("{}", abstractType);
	}

	/**
	 * Unit Test to two.
	 */
	@Test
	public void testSubTypeTwo() {
		LOG.info("testPolymorphism");
		LOG.info("{}", abstractType);
		abstractType = new SubTypeTwo();
		assertNotNull("Value cannot be null", abstractType);
		LOG.info("{}", abstractType);
		abstractType.operation();
		assertNotNull("Value cannot be null", abstractType.operation());
		LOG.info("{}", abstractType);
	}

}
