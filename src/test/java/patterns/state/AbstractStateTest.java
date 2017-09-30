
package patterns.state;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * class AbstractStateTest.
 */
public class AbstractStateTest {

	/**
	 * Unit Test to abstract state.
	 */
	@Test
	public void testAbstractState() {
		final StateAlice stateAlice = new StateAlice();
		assertNotNull("Value cannot be null", stateAlice);
		final StateBob stateBob = new StateBob();
		assertNotNull("Value cannot be null", stateBob);
	}

}
