package patterns.command;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CommandFactoryTest {

	@Test
	public void testExecute() {
		final InvokerInterface commandFactory = new CommandFactory();
		assertNotNull(commandFactory);
		final String actionName = "UnitTest";
		commandFactory.execute(actionName);
	}

}
