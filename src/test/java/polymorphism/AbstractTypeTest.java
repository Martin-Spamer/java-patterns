package polymorphism;

import org.junit.Test;

public class AbstractTypeTest {

	AbstractType abstractType;

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
