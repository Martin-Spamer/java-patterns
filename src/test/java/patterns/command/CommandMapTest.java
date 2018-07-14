
package patterns.command;

import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test example class for mapping Command classes.
 */
public final class CommandMapTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(CommandFactoryTest.class);

    /** The command map. */
    private final CommandMap commandMap = new CommandMap();

    /**
     * Before tests.
     *
     * @throws Exception
     *             the exception
     */
    @Before
    public void beforeTests() throws Exception {
        LOG.info("beforeTests");
        final Properties properties = new Properties();
        final InputStream inputStream = inputStream("commands.properties");
        properties.load(inputStream);

        for (final Map.Entry<Object, Object> entry : properties.entrySet()) {
            final String key = (String) entry.getKey();
            final String className = (String) entry.getValue();
            LOG.trace("\t{} = {}", key, className);
            try {
                final AbstractCommand instance = (AbstractCommand) Class.forName(className).newInstance();
                commandMap.put(key, instance);
            } catch (final ClassNotFoundException e) {
                LOG.error("Class not found for command {}", key);
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
        return classloader.getResourceAsStream(resourceName);
    }

    /**
     * Unit Test to execute missing command.
     *
     * @throws Exception
     *             the exception
     */
    @Test(expected = MissingCommandException.class)
    public void testExecuteMissingCommand() throws Exception {
        LOG.info("testExecuteMissingCommand");
        assertNotNull(commandMap);
        final String actionName = "MissingCommand";
        commandMap.execute(actionName);
        LOG.debug(commandMap.toString());
    }

    /**
     * Unit Test to execute missing class.
     *
     * @throws Exception
     *             the exception
     */
    @Test(expected = MissingCommandException.class)
    public void testExecuteMissingClass() throws Exception {
        LOG.info("testExecuteMissingClass");
        assertNotNull(commandMap);
        final String actionName = "MissingCommand";
        commandMap.execute(actionName);
        LOG.debug(commandMap.toString());
    }

    /**
     * Unit Test to execute example command.
     *
     * @throws Exception
     *             the exception
     */
    @Test
    public void testExecuteExampleCommand() throws Exception {
        LOG.info("testExecuteExampleCommand");
        assertNotNull(commandMap);
        final String actionName = "ExampleCommand";
        final ResultInterface result = commandMap.execute(actionName);
        assertNotNull(result);
        LOG.debug(result.toString());
    }

    /**
     * Unit Test to execute sequence command.
     *
     * @throws Exception
     *             the exception
     */
    @Test
    public void testExecuteSequenceCommand() throws Exception {
        LOG.info("testExecuteSequenceCommand");
        assertNotNull(commandMap);
        final String actionName = "SequenceCommand";
        final ResultInterface result = commandMap.execute(actionName);
        assertNotNull(result);
        LOG.debug(result.toString());
    }

    /**
     * Unit Test to execute compound command.
     *
     * @throws Exception
     *             the exception
     */
    @Test
    public void testExecuteCompoundCommand() throws Exception {
        LOG.info("testExecuteCompoundCommand");
        assertNotNull(commandMap);
        final String actionName = "CompoundCommand";
        final ResultInterface result = commandMap.execute(actionName);
        assertNotNull(result);
        LOG.debug(result.toString());
    }

    /**
     * Unit Test to execute conditional command.
     *
     * @throws Exception
     *             the exception
     */
    @Test
    public void testExecuteConditionalCommand() throws Exception {
        LOG.info("testExecuteConditionalCommand");
        assertNotNull(commandMap);
        final String actionName = "ConditionalCommand";
        final ResultInterface result = commandMap.execute(actionName);
        assertNotNull(result);
        LOG.debug(result.toString());
    }

}
