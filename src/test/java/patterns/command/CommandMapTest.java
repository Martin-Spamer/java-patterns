
package patterns.command;

import static org.junit.Assert.assertNotNull;

import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The CommandMapTest Class.
 */
public class CommandMapTest {

	private static final Logger LOG = LoggerFactory.getLogger(CommandFactoryTest.class);
	private final CommandMap commandMap = new CommandMap();

	/**
	 * Before tests.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Before
	public void beforeTests() throws Exception {
		LOG.debug("beforeTests");
		final Properties properties = new Properties();
		final InputStream inputStream = inputStream("commands.properties");
		properties.load(inputStream);

		for (final Map.Entry<Object, Object> entry : properties.entrySet()) {
			final String key = (String) entry.getKey();
			final String className = (String) entry.getValue();
			LOG.info("\t{} = {}", key, className);
			try {
				final AbstractCommand instance = (AbstractCommand) Class.forName(className).newInstance();
				this.commandMap.put(key, instance);
			} catch (final ClassNotFoundException e) {
				LOG.warn("Class not found for command {}", key);
			}
		}
	}

	/**
	 * Input stream.
	 *
	 * @param resourceName
	 *            the resource name
	 * @return the input stream
	 */
	private InputStream inputStream(final String resourceName) {
		final ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		final InputStream resourceAsStream = classloader.getResourceAsStream(resourceName);
		return resourceAsStream;
	}

	/**
	 * Unit Test to execute missing command.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Test(expected = MissingCommandException.class)
	public void testExecuteMissingCommand() throws Exception {
		LOG.debug("testExecuteMissingCommand");
		assertNotNull("Value cannot be null", this.commandMap);
		final String actionName = "MissingCommand";
		this.commandMap.execute(actionName);
	}

	/**
	 * Unit Test to execute missing class.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Test(expected = MissingCommandException.class)
	public void testExecuteMissingClass() throws Exception {
		LOG.debug("testExecuteMissingClass");
		assertNotNull("Value cannot be null", this.commandMap);
		final String actionName = "MissingCommand";
		this.commandMap.execute(actionName);
	}

	/**
	 * Unit Test to execute example command.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Test
	public void testExecuteExampleCommand() throws Exception {
		LOG.debug("testExecuteExampleCommand");
		assertNotNull("Value cannot be null", this.commandMap);
		final String actionName = "ExampleCommand";
		final ResultInterface result = this.commandMap.execute(actionName);
		assertNotNull("Value cannot be null", result);
		LOG.info(result.toString());
	}

	/**
	 * Unit Test to execute sequence command.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Test
	public void testExecuteSequenceCommand() throws Exception {
		LOG.debug("testExecuteSequenceCommand");
		assertNotNull("Value cannot be null", this.commandMap);
		final String actionName = "SequenceCommand";
		final ResultInterface result = this.commandMap.execute(actionName);
		assertNotNull("Value cannot be null", result);
		LOG.info(result.toString());
	}

	/**
	 * Unit Test to execute compound command.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Test
	public void testExecuteCompoundCommand() throws Exception {
		LOG.debug("testExecuteCompoundCommand");
		assertNotNull("Value cannot be null", this.commandMap);
		final String actionName = "CompoundCommand";
		final ResultInterface result = this.commandMap.execute(actionName);
		assertNotNull("Value cannot be null", result);
		LOG.info(result.toString());
	}

	/**
	 * Unit Test to execute conditional command.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Test
	public void testExecuteConditionalCommand() throws Exception {
		LOG.debug("testExecuteConditionalCommand");
		assertNotNull("Value cannot be null", this.commandMap);
		final String actionName = "ConditionalCommand";
		final ResultInterface result = this.commandMap.execute(actionName);
		assertNotNull("Value cannot be null", result);
		LOG.info(result.toString());
	}

}
