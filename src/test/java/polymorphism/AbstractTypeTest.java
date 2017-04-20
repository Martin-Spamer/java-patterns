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
	}

	@Test
	public void testTwo() {
		this.abstractType = new SubTypeTwo();
		this.abstractType.operation();
	}

}
