package patterns.state;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class AbstractStateTest {

	@Test
	public void testAbstractState() {
		assertNotNull(new StateA());
		assertNotNull(new StateZ());
	}

}
