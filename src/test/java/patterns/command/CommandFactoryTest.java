
package patterns.command;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import coaching.factory.CommandFactory;

/**
 * Unit test the CommandFactory class.
 */
public final class CommandFactoryTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory
            .getLogger(CommandFactoryTest.class);

    /**
     * Unit Test to command factory.
     *
     */
    @Test
    public void testCommandFactory() {
        LOG.info("testCommandFactory");
        CommandFactory commandFactory = CommandFactory.getInstance();
        assertNotNull(commandFactory);
        LOG.debug(commandFactory.toString());
    }

    /**
     * Unit Test to command factory file.
     *
     */
    @Test
    public void testCommandFactoryFile() {
        LOG.info("testCommandFactoryFile");
        CommandFactory commandFactory = CommandFactory.getInstance("commands.properties");
        commandFactory.load("commands.properties");
        assertNotNull(commandFactory);
        LOG.debug(commandFactory.toString());
    }

    @Test
    public void testCommandFactoryMissingFile() {
        LOG.info("testCommandFactoryFile");
        CommandFactory commandFactory = CommandFactory.getInstance("missing.properties");
        commandFactory.load("missing.properties");
        assertNotNull(commandFactory);
        LOG.debug(commandFactory.toString());
    }


    //    /**
    //     * Unit Test to missing command execute.
    //     *
    //     * @throws Exception
    //     *             the exception
    //     */
    //    @Test(expected = MissingCommandException.class)
    //    public void testMissingCommandExecute() throws Exception {
    //        LOG.info("testMissingCommandExecute");
    //        CommandFactory commandFactory = CommandFactory.getInstance();
    //        assertNotNull(commandFactory);
    //        final String actionName = "MissingCommand";
    //        commandFactory.execute(actionName);
    //        LOG.debug(commandFactory.toString());
    //    }
    //
    //    /**
    //     * Unit Test to execute missing command.
    //     *
    //     * @throws Exception
    //     *             the exception
    //     */
    //    @Test(expected = MissingCommandException.class)
    //    public void testExecuteMissingCommand() throws Exception {
    //        LOG.info("testExecuteMissingCommand");
    //        CommandFactory commandFactory = CommandFactory.getInstance();
    //        assertNotNull(commandFactory);
    //        final String actionName = "MissingCommand";
    //        commandFactory.execute(actionName);
    //        LOG.debug(commandFactory.toString());
    //    }
    //
    //    /**
    //     * Unit Test to execute missing class.
    //     *
    //     * @throws Exception
    //     *             the exception
    //     */
    //    @Test(expected = MissingCommandException.class)
    //    public void testExecuteMissingClass() throws Exception {
    //        LOG.info("testExecuteMissingClass");
    //        CommandFactory commandFactory = CommandFactory.getInstance();
    //        assertNotNull(commandFactory);
    //        final String actionName = "MissingCommand";
    //        commandFactory.execute(actionName);
    //        LOG.debug(commandFactory.toString());
    //    }
    //
    //    /**
    //     * Unit Test to execute example command.
    //     *
    //     * @throws Exception
    //     *             the exception
    //     */
    //    @Test
    //    public void testExecuteExampleCommand() throws Exception {
    //        LOG.info("testExecuteExampleCommand");
    //        CommandFactory commandFactory = CommandFactory.getInstance();
    //        assertNotNull(commandFactory);
    //        final String actionName = "ExampleCommand";
    //        final ResultInterface result = commandFactory.execute(actionName);
    //        assertNotNull(result);
    //        LOG.debug(result.toString());
    //    }
    //
    //    /**
    //     * Unit Test to execute sequence command.
    //     *
    //     * @throws Exception
    //     *             the exception
    //     */
    //    @Test
    //    public void testExecuteSequenceCommand() throws Exception {
    //        LOG.info("testExecuteSequenceCommand");
    //        CommandFactory commandFactory = CommandFactory.getInstance();
    //        assertNotNull(commandFactory);
    //        final String actionName = "SequenceCommand";
    //        final ResultInterface result = commandFactory.execute(actionName);
    //        assertNotNull(result);
    //        LOG.debug(result.toString());
    //    }
    //
    //    /**
    //     * Unit Test to execute compound command.
    //     *
    //     * @throws Exception
    //     *             the exception
    //     */
    //    @Test
    //    public void testExecuteCompoundCommand() throws Exception {
    //        LOG.info("testExecuteCompoundCommand");
    //        CommandFactory commandFactory = CommandFactory.getInstance();
    //        assertNotNull(commandFactory);
    //        final String actionName = "CompoundCommand";
    //        final ResultInterface result = commandFactory.execute(actionName);
    //        assertNotNull(result);
    //        LOG.debug(result.toString());
    //    }
    //
    //    /**
    //     * Unit Test to execute conditional command.
    //     *
    //     * @throws Exception
    //     *             the exception
    //     */
    //    @Test
    //    public void testExecuteConditionalCommand() throws Exception {
    //        LOG.info("testExecuteConditionalCommand");
    //        CommandFactory commandFactory = CommandFactory.getInstance();
    //        assertNotNull(commandFactory);
    //        final String actionName = "ConditionalCommand";
    //        final ResultInterface result = commandFactory.execute(actionName);
    //        assertNotNull(result);
    //        LOG.debug(result.toString());
    //    }

}
