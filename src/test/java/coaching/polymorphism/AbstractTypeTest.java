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
		this.abstractType = new SubTypeOne();
		assertNotNull(this.abstractType);
		LOG.info("{}", this.abstractType);
		assertNotNull(this.abstractType.operation());
		LOG.info("{}", this.abstractType);
	}

	/**
	 * Unit Test to two.
	 */
	@Test
	public void testSubTypeTwo() {
		LOG.info("testPolymorphism");
		LOG.info("{}", this.abstractType);
		this.abstractType = new SubTypeTwo();
		assertNotNull(this.abstractType);
		LOG.info("{}", this.abstractType);
		this.abstractType.operation();
		assertNotNull(this.abstractType.operation());
		LOG.info("{}", this.abstractType);
	}

}
