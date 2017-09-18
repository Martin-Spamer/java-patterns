package patterns.state;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class AbstractStateTest {

	@Test
	public void testAbstractState() {
		StateAlice stateAlice = new StateAlice();
		assertNotNull(stateAlice);
		StateBob stateBob = new StateBob();
		assertNotNull(stateBob);
	}

}
