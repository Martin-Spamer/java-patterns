package patterns.command;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommandFactoryTest {

	private static final Logger LOG = LoggerFactory.getLogger(CommandFactoryTest.class);

	@Test
	public void testMissingCommandExecute() throws Exception {
		final InvokerInterface commandFactory = new CommandFactory();
		assertNotNull(commandFactory);
		final String actionName = "MissingCommand";
		commandFactory.execute(actionName);
	}

}
