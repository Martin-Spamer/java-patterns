package patterns.mediator;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class MediatorTest {

	@Test
	public void test() {
		Mediator mediator = new Mediator();
		assertNotNull(mediator);
	}
}
