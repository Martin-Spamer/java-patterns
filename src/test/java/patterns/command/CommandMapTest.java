package patterns.command;

import static org.junit.Assert.assertNotNull;

import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import patterns.mvc.controller.ResultInterface;

public class CommandMapTest {

	private static final Logger LOG = LoggerFactory.getLogger(CommandFactoryTest.class);
	private final CommandMap commandMap = new CommandMap();

	@Before
	public void beforeTests() throws Exception {
		final Properties properties = new Properties();
		final InputStream inputStream = inputStream("commands.properties");
		properties.load(inputStream);

		for (final Map.Entry<Object, Object> entry : properties.entrySet()) {
			final String key = (String) entry.getKey();
			final String className = (String) entry.getValue();
			LOG.info("{} = {}", key, className);
			final AbstractCommand instance = (AbstractCommand) Class.forName(className).newInstance();
			commandMap.put(key, instance);
		}
	}

	private InputStream inputStream(final String resourceName) {
		final ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		final InputStream resourceAsStream = classloader.getResourceAsStream(resourceName);
		return resourceAsStream;
	}

	@Test
	public void testExecuteMissingCommand() {
		assertNotNull(commandMap);
		final String actionName = "MissingCommand";
		final ResultInterface result = commandMap.execute(actionName);
		assertNotNull(result);
		LOG.info(result.toString());
	}

	@Test
	public void testExecuteMissingClass() {
		assertNotNull(commandMap);
		final String actionName = "MissingClass";
		final ResultInterface result = commandMap.execute(actionName);
		assertNotNull(result);
		LOG.info(result.toString());
	}

	@Test
	public void testExecuteExampleCommand() {
		assertNotNull(commandMap);
		final String actionName = "ExampleCommand";
		final ResultInterface result = commandMap.execute(actionName);
		assertNotNull(result);
		LOG.info(result.toString());
	}

	@Test
	public void testExecuteSequenceCommand() {
		assertNotNull(commandMap);
		final String actionName = "SequenceCommand";
		final ResultInterface result = commandMap.execute(actionName);
		assertNotNull(result);
		LOG.info(result.toString());
	}

	@Test
	public void testExecuteCompoundCommand() {
		assertNotNull(commandMap);
		final String actionName = "CompoundCommand";
		final ResultInterface result = commandMap.execute(actionName);
		assertNotNull(result);
		LOG.info(result.toString());
	}

	@Test
	public void testExecuteConditionalCommand() {
		assertNotNull(commandMap);
		final String actionName = "ConditionalCommand";
		final ResultInterface result = commandMap.execute(actionName);
		assertNotNull(result);
		LOG.info(result.toString());
	}

}
