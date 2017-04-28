package patterns.command;

import static org.junit.Assert.assertNotNull;

import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
			final String value = (String) entry.getValue();
			LOG.info("{} = {}", key, value);
		}
	}

	private InputStream inputStream(final String resourceName) {
		final ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		final InputStream resourceAsStream = classloader.getResourceAsStream(resourceName);
		return resourceAsStream;
	}

	@Test
	public void testExecuteMissingCommand() {
		assertNotNull(this.commandMap);
		final String actionName = "MissingCommand";
		final CommandInterface result = this.commandMap.execute(actionName);
		assertNotNull(result);
	}

	@Test
	public void testExecuteMissingClass() {
		assertNotNull(this.commandMap);
		final String actionName = "MissingClass";
		final CommandInterface result = this.commandMap.execute(actionName);
		assertNotNull(result);
	}

	@Test
	public void testExecuteExampleCommand() {
		assertNotNull(this.commandMap);
		final String actionName = "ExampleCommand";
		final CommandInterface result = this.commandMap.execute(actionName);
		assertNotNull(result);
	}

	@Test
	public void testExecuteSequenceCommand() {
		assertNotNull(this.commandMap);
		final String actionName = "SequenceCommand";
		final CommandInterface result = this.commandMap.execute(actionName);
		assertNotNull(result);
	}

	@Test
	public void testExecuteCompoundCommand() {
		assertNotNull(this.commandMap);
		final String actionName = "CompoundCommand";
		final CommandInterface result = this.commandMap.execute(actionName);
		assertNotNull(result);
	}

	@Test
	public void testExecuteConditionalCommand() {
		assertNotNull(this.commandMap);
		final String actionName = "ConditionalCommand";
		final CommandInterface result = this.commandMap.execute(actionName);
		assertNotNull(result);
	}

}
