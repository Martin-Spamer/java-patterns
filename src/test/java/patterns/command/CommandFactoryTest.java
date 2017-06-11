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
		LOG.debug("testCommandFactory");
		final InvokerInterface commandFactory = new CommandFactory();
		assertNotNull(commandFactory);
		LOG.info(commandFactory.toString());
	}

	@Test
	public void testCommandFactoryFile() throws Exception {
		LOG.debug("testCommandFactoryFile");
		final InvokerInterface commandFactory = new CommandFactory("commands.properties");
		assertNotNull(commandFactory);
		LOG.info(commandFactory.toString());
	}

	@Test
	public void testCommandFactoryProperties() throws Exception {
		LOG.debug("testCommandFactoryProperties");
		final Properties properties = new Properties();
		final InvokerInterface commandFactory = new CommandFactory(properties);
		assertNotNull(commandFactory);
		LOG.info(commandFactory.toString());
	}

	@Test(expected = MissingCommandException.class)
	public void testMissingCommandExecute() throws Exception {
		LOG.debug("testMissingCommandExecute");
		final InvokerInterface commandFactory = new CommandFactory();
		assertNotNull(commandFactory);
		final String actionName = "MissingCommand";
		final ResultInterface result = commandFactory.execute(actionName);
		LOG.info(result.toString());
	}

	@Test(expected = MissingCommandException.class)
	public void testExecuteMissingCommand() throws Exception {
		LOG.debug("testExecuteMissingCommand");
		final InvokerInterface commandFactory = new CommandFactory();
		assertNotNull(commandFactory);
		final String actionName = "MissingCommand";
		final ResultInterface result = commandFactory.execute(actionName);
		assertNotNull(result);
		LOG.info(result.toString());
	}

	@Test(expected = MissingCommandException.class)
	public void testExecuteMissingClass() throws Exception {
		LOG.debug("testExecuteMissingClass");
		final InvokerInterface commandFactory = new CommandFactory();
		assertNotNull(commandFactory);
		final String actionName = "MissingClass";
		final ResultInterface result = commandFactory.execute(actionName);
		assertNotNull(result);
		LOG.info(result.toString());
	}

	@Test
	public void testExecuteExampleCommand() throws Exception {
		LOG.debug("testExecuteExampleCommand");
		final InvokerInterface commandFactory = new CommandFactory();
		assertNotNull(commandFactory);
		final String actionName = "ExampleCommand";
		final ResultInterface result = commandFactory.execute(actionName);
		assertNotNull(result);
		LOG.info(result.toString());
	}

	@Test
	public void testExecuteSequenceCommand() throws Exception {
		LOG.debug("testExecuteSequenceCommand");
		final InvokerInterface commandFactory = new CommandFactory();
		assertNotNull(commandFactory);
		final String actionName = "SequenceCommand";
		final ResultInterface result = commandFactory.execute(actionName);
		assertNotNull(result);
		LOG.info(result.toString());
	}

	@Test
	public void testExecuteCompoundCommand() throws Exception {
		LOG.debug("testExecuteCompoundCommand");
		final InvokerInterface commandFactory = new CommandFactory();
		assertNotNull(commandFactory);
		final String actionName = "CompoundCommand";
		final ResultInterface result = commandFactory.execute(actionName);
		assertNotNull(result);
		LOG.info(result.toString());
	}

	@Test
	public void testExecuteConditionalCommand() throws Exception {
		LOG.debug("testExecuteConditionalCommand");
		final InvokerInterface commandFactory = new CommandFactory();
		assertNotNull(commandFactory);
		final String actionName = "ConditionalCommand";
		final ResultInterface result = commandFactory.execute(actionName);
		assertNotNull(result);
		LOG.info(result.toString());
	}

}
