
package patterns.command;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test the CommandFactory class.
 */
public final class CommandFactoryTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory
            .getLogger(CommandFactoryTest.class);

    /**
     * Unit test to create a default command.
     */
    @Test
    public void testCreate() {
        AbstractCommand command = CommandFactory.create();
        assertNotNull(command);
    }

    //  MissingClass=pattern.command.MissingClass
    //  ExampleCommand=patterns.command.ExampleCommand
    //  SequenceCommand=patterns.command.SequenceCommand
    //  CompoundCommand=patterns.command.CompoundCommand
    //  ConditionalCommand=patterns.command.ConditionalCommand

    /**
     * Unit test to create by key.
     */
    @Test
    public void testCreateMissingClass() {
        AbstractCommand command = CommandFactory.create("MissingClass");
        assertNotNull(command);
    }

    /**
     * Unit test to create by key.
     */
    @Test
    public void testExampleCommand() {
        AbstractCommand command = CommandFactory.create("ExampleCommand");
        assertNotNull(command);
    }

    /**
     * Unit test to create by key.
     */
    @Test
    public void testCreateSequenceCommand() {
        AbstractCommand command = CommandFactory.create("SequenceCommand");
        assertNotNull(command);
    }

    /**
     * Unit test to create by key.
     */
    @Test
    public void testCreateCompoundCommand() {
        AbstractCommand command = CommandFactory.create("CompoundCommand");
        assertNotNull(command);
    }

    /**
     * Unit test to create by key.
     */
    @Test
    public void testCreateConditionalCommand() {
        AbstractCommand command = CommandFactory.create("ConditionalCommand");
        assertNotNull(command);
    }

    /**
     * Unit Test to command factory.
     */
    @Test
    public void testCommandFactory() {
        CommandFactory commandFactory = CommandFactory.getInstance();
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
