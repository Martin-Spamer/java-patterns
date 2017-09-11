
package coaching.polymorphism;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The AbstractTypeTest Class.
 */
public class AbstractTypeTest {

	private static final Logger LOG = LoggerFactory.getLogger(AbstractTypeTest.class);
	private AbstractType abstractType;

	/**
	 * Unit Test to one.
	 */
	@Test
	public void testOne() {
		abstractType = new SubTypeOne();
		LOG.info("{}", abstractType);
	}

	/**
	 * Unit Test to two.
	 */
	@Test
	public void testTwo() {
		abstractType = new SubTypeTwo();
		LOG.info("{}", abstractType);
		abstractType.operation();
		LOG.info("{}", abstractType);
	}

}
