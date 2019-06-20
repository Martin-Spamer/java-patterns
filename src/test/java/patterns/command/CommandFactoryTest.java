
package patterns.command;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test the CommandFactory class.
 */


/** The Constant 			log. */
@Slf4j
public final class CommandFactoryTest {

    /**
     * Unit test to create a default command.
     */
    @Test
    public void testCreate() {
        final AbstractCommand command = CommandFactory.create();
        assertNotNull(command);
    }

    // MissingClass=pattern.command.MissingClass
    // ExampleCommand=patterns.command.ExampleCommand
    // SequenceCommand=patterns.command.SequenceCommand
    // CompoundCommand=patterns.command.CompoundCommand
    // ConditionalCommand=patterns.command.ConditionalCommand

    /**
     * Unit test to create by key.
     */
    @Test
    public void testCreateMissingClass() {
        final AbstractCommand command = CommandFactory.create("MissingClass");
        assertNotNull(command);
    }

    /**
     * Unit test to create by key.
     */
    @Test
    public void testExampleCommand() {
        final AbstractCommand command = CommandFactory.create("ExampleCommand");
        assertNotNull(command);
    }

    /**
     * Unit test to create by key.
     */
    @Test
    public void testCreateSequenceCommand() {
        final AbstractCommand command = CommandFactory.create("SequenceCommand");
        assertNotNull(command);
    }

    /**
     * Unit test to create by key.
     */
    @Test
    public void testCreateCompoundCommand() {
        final AbstractCommand command = CommandFactory.create("CompoundCommand");
        assertNotNull(command);
    }

    /**
     * Unit test to create by key.
     */
    @Test
    public void testCreateConditionalCommand() {
        final AbstractCommand command = CommandFactory.create("ConditionalCommand");
        assertNotNull(command);
    }

    /**
     * Unit Test to command factory.
     */
    @Test
    public void testCommandFactory() {
        final CommandFactory commandFactory = CommandFactory.getInstance();
        assertNotNull(commandFactory);
        log.debug(commandFactory.toString());
    }

    // /**
    // * Unit Test to missing command execute.
    // *
    // * @throws Exception
    // * the exception
    // */
    // @Test(expected = MissingCommandException.class)
    // public void testMissingCommandExecute() throws Exception {
    // log.info("testMissingCommandExecute");
    // CommandFactory commandFactory = CommandFactory.getInstance();
    // assertNotNull(commandFactory);
    // final String actionName = "MissingCommand";
    // commandFactory.execute(actionName);
    // log.debug(commandFactory.toString());
    // }

    // /**
    // * Unit Test to execute missing command.
    // *
    // * @throws Exception
    // * the exception
    // */
    // @Test(expected = MissingCommandException.class)
    // public void testExecuteMissingCommand() throws Exception {
    // log.info("testExecuteMissingCommand");
    // CommandFactory commandFactory = CommandFactory.getInstance();
    // assertNotNull(commandFactory);
    // final String actionName = "MissingCommand";
    // commandFactory.execute(actionName);
    // log.debug(commandFactory.toString());
    // }

    // /**
    // * Unit Test to execute missing class.
    // *
    // * @throws Exception
    // * the exception
    // */
    // @Test(expected = MissingCommandException.class)
    // public void testExecuteMissingClass() throws Exception {
    // log.info("testExecuteMissingClass");
    // CommandFactory commandFactory = CommandFactory.getInstance();
    // assertNotNull(commandFactory);
    // final String actionName = "MissingCommand";
    // commandFactory.execute(actionName);
    // log.debug(commandFactory.toString());
    // }

    // /**
    // * Unit Test to execute example command.
    // *
    // * @throws Exception
    // * the exception
    // */
    // @Test
    // public void testExecuteExampleCommand() throws Exception {
    // log.info("testExecuteExampleCommand");
    // CommandFactory commandFactory = CommandFactory.getInstance();
    // assertNotNull(commandFactory);
    // final String actionName = "ExampleCommand";
    // final ResultInterface result = commandFactory.execute(actionName);
    // assertNotNull(result);
    // log.debug(result.toString());
    // }

    // /**
    // * Unit Test to execute sequence command.
    // *
    // * @throws Exception
    // * the exception
    // */
    // @Test
    // public void testExecuteSequenceCommand() throws Exception {
    // log.info("testExecuteSequenceCommand");
    // CommandFactory commandFactory = CommandFactory.getInstance();
    // assertNotNull(commandFactory);
    // final String actionName = "SequenceCommand";
    // final ResultInterface result = commandFactory.execute(actionName);
    // assertNotNull(result);
    // log.debug(result.toString());
    // }

    // /**
    // * Unit Test to execute compound command.
    // *
    // * @throws Exception
    // * the exception
    // */
    // @Test
    // public void testExecuteCompoundCommand() throws Exception {
    // log.info("testExecuteCompoundCommand");
    // CommandFactory commandFactory = CommandFactory.getInstance();
    // assertNotNull(commandFactory);
    // final String actionName = "CompoundCommand";
    // final ResultInterface result = commandFactory.execute(actionName);
    // assertNotNull(result);
    // log.debug(result.toString());
    // }

    // /**
    // * Unit Test to execute conditional command.
    // *
    // * @throws Exception
    // * the exception
    // */
    // @Test
    // public void testExecuteConditionalCommand() throws Exception {
    // log.info("testExecuteConditionalCommand");
    // CommandFactory commandFactory = CommandFactory.getInstance();
    // assertNotNull(commandFactory);
    // final String actionName = "ConditionalCommand";
    // final ResultInterface result = commandFactory.execute(actionName);
    // assertNotNull(result);
    // log.debug(result.toString());
    // }

}
