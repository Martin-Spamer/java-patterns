package patterns.command;

import static org.junit.Assert.assertNotNull;

import java.util.Properties;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import patterns.mvc.controller.ResultInterface;

public class CommandFactoryTest {

	private static final Logger LOG = LoggerFactory.getLogger(CommandFactoryTest.class);

	@Test
	public void testCommandFactory() throws Exception {
		final InvokerInterface instance = new CommandFactory();
		assertNotNull(instance);
		LOG.info(instance.toString());
	}

	@Test
	public void testCommandFactoryFile() throws Exception {
		final InvokerInterface instance = new CommandFactory("commands.properties");
		assertNotNull(instance);
		LOG.info(instance.toString());
	}

	@Test
	public void testCommandFactoryProperties() throws Exception {
		final Properties properties = new Properties();
		final InvokerInterface instance = new CommandFactory(properties);
		assertNotNull(instance);
		LOG.info(instance.toString());
	}

	@Test
	public void testMissingCommandExecute() throws Exception {
		final InvokerInterface instance = new CommandFactory();
		assertNotNull(instance);
		final String actionName = "MissingCommand";
		final ResultInterface result = instance.execute(actionName);
		LOG.info(result.toString());
	}

	@Test
	public void testExecuteMissingCommand() throws Exception {
		final InvokerInterface instance = new CommandFactory();
		assertNotNull(instance);
		final String actionName = "MissingCommand";
		final ResultInterface result = instance.execute(actionName);
		assertNotNull(result);
		LOG.info(result.toString());
	}

	@Test
	public void testExecuteMissingClass() throws Exception {
		final InvokerInterface instance = new CommandFactory();
		assertNotNull(instance);
		final String actionName = "MissingClass";
		final ResultInterface result = instance.execute(actionName);
		assertNotNull(result);
		LOG.info(result.toString());
	}

	@Test
	public void testExecuteExampleCommand() throws Exception {
		final InvokerInterface instance = new CommandFactory();
		assertNotNull(instance);
		final String actionName = "ExampleCommand";
		final ResultInterface result = instance.execute(actionName);
		assertNotNull(result);
		LOG.info(result.toString());
	}

	@Test
	public void testExecuteSequenceCommand() throws Exception {
		final InvokerInterface commandFactory = new CommandFactory();
		assertNotNull(commandFactory);
		final String actionName = "SequenceCommand";
		final ResultInterface result = commandFactory.execute(actionName);
		assertNotNull(result);
		LOG.info(result.toString());
	}

	@Test
	public void testExecuteCompoundCommand() throws Exception {
		final InvokerInterface commandFactory = new CommandFactory();
		assertNotNull(commandFactory);
		final String actionName = "CompoundCommand";
		final ResultInterface result = commandFactory.execute(actionName);
		assertNotNull(result);
		LOG.info(result.toString());
	}

	@Test
	public void testExecuteConditionalCommand() throws Exception {
		final InvokerInterface commandFactory = new CommandFactory();
		assertNotNull(commandFactory);
		final String actionName = "ConditionalCommand";
		final ResultInterface result = commandFactory.execute(actionName);
		assertNotNull(result);
		LOG.info(result.toString());
	}

}
