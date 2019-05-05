
package patterns.command;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test class for CommandInvoker.
 */
public class CommandInvokerTest {

    /**
     * Unit test to execute example command.
     *
     * @throws MissingCommandException the missing command exception
     */
    @Test(expected = MissingCommandException.class)
    public void testExecuteExampleCommand() throws MissingCommandException {
        final CommandInvoker invoker = new CommandInvoker();
        assertNotNull(invoker);
        final String actionName = "ExampleCommand";
        invoker.execute(actionName);
    }

    /**
     * Unit test to execute blank.
     *
     * @throws MissingCommandException the missing command exception
     */
    @Test(expected = MissingCommandException.class)
    public void testExecuteBlank() throws MissingCommandException {
        final CommandInvoker invoker = new CommandInvoker();
        assertNotNull(invoker);
        final String actionName = "";
        invoker.execute(actionName);
    }

    /**
     * Unit test to execute null.
     *
     * @throws MissingCommandException the missing command exception
     */
    @Test(expected = MissingCommandException.class)
    public void testExecuteNull() throws MissingCommandException {
        final CommandInvoker invoker = new CommandInvoker();
        assertNotNull(invoker);
        invoker.execute(null);
    }

}
