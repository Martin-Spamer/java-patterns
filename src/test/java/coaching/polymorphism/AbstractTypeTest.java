package coaching.polymorphism;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
	public void testPolymorphism() {
		this.abstractType = new SubTypeOne();
		LOG.info("{}", this.abstractType);
		this.abstractType.operation();
	}

	/**
	 * Unit Test to two.
	 */
	@Test
	public void testTwo() {
		this.abstractType = new SubTypeTwo();
		LOG.info("{}", this.abstractType);
		this.abstractType.operation();
	}

}
