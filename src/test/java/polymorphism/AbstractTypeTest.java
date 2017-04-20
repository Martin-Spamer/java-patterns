package polymorphism;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbstractTypeTest {

	private static final Logger LOG = LoggerFactory.getLogger(AbstractTypeTest.class);
	private AbstractType abstractType;

	@Test
	public void testOne() {
		this.abstractType = new SubTypeOne();
		LOG.info("{}", this.abstractType);
	}

	@Test
	public void testTwo() {
		this.abstractType = new SubTypeTwo();
		LOG.info("{}", this.abstractType);
		this.abstractType.operation();
		LOG.info("{}", this.abstractType);
	}

}
