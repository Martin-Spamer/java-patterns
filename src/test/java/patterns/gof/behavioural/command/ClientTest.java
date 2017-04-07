
package patterns.gof.behavioural.command;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * The ClientTest Class.
 */
public class ClientTest {

	@Test
	public void testCommand() throws Exception {
		final ConcreteCommand command = new ConcreteCommand();
		assertNotNull(command);
		assertNotNull(command.execute());
	}

}
