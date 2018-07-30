
package patterns.command;

import java.io.InputStream;

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

    /**
     * Before tests.
     *
     * @throws Exception
     *             the exception
     */
    @Before
    public void beforeTests() {
        LOG.info("beforeTests");
    }

    /**
     * Input stream.
     *
     * @param resourceName
     *            the resource name
     * @return the input stream
     */
    private InputStream inputStream(final String resourceName) {
        final ClassLoader classloader = Thread
                .currentThread()
                .getContextClassLoader();
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
        CommandMap commandMap = new CommandMap();
        assertNotNull(commandMap);
        final String actionName = "MissingCommand";
        //        commandMap.execute(actionName);
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
        CommandMap commandMap = new CommandMap();
        assertNotNull(commandMap);
        final String actionName = "MissingCommand";
        //        commandMap.execute(actionName);
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
        CommandMap commandMap = new CommandMap();
        assertNotNull(commandMap);
        final String actionName = "ExampleCommand";
        //        final ResultInterface result = commandMap.execute(actionName);
        //        assertNotNull(result);
        //        LOG.debug(result.toString());
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
        CommandMap commandMap = new CommandMap();
        assertNotNull(commandMap);
        final String actionName = "SequenceCommand";
        //        final ResultInterface result = commandMap.execute(actionName);
        //        assertNotNull(result);
        //        LOG.debug(result.toString());
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
        CommandMap commandMap = new CommandMap();
        assertNotNull(commandMap);
        final String actionName = "CompoundCommand";
        //        final ResultInterface result = commandMap.execute(actionName);
        //        assertNotNull(result);
        //        LOG.debug(result.toString());
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
        CommandMap commandMap = new CommandMap();
        assertNotNull(commandMap);
        final String actionName = "ConditionalCommand";
        //        final ResultInterface result = commandMap.execute(actionName);
        //        assertNotNull(result);
        //        LOG.debug(result.toString());
    }

}
