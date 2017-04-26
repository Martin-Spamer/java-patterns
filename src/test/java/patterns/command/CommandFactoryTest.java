package patterns.command;

import static org.junit.Assert.assertNotNull;

import java.util.Properties;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommandFactoryTest {

	private static final Logger LOG = LoggerFactory.getLogger(CommandFactoryTest.class);

	@Test
	public void testCommandFactory() throws Exception {
		final InvokerInterface commandFactory = new CommandFactory();
		assertNotNull(commandFactory);
	}

	@Test
	public void testCommandFactoryFile() throws Exception {
		final InvokerInterface commandFactory = new CommandFactory("commands.properties");
		assertNotNull(commandFactory);
	}

	@Test
	public void testCommandFactoryProperties() throws Exception {
		final Properties properties = new Properties();
		final InvokerInterface commandFactory = new CommandFactory(properties);
		assertNotNull(commandFactory);
	}

	@Test
	public void testMissingCommandExecute() throws Exception {
		final InvokerInterface commandFactory = new CommandFactory();
		assertNotNull(commandFactory);
		final String actionName = "MissingCommand";
		commandFactory.execute(actionName);
	}

}
