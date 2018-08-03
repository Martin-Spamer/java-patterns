
package patterns.command;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CommandInvokerTest {

    @Test(expected = MissingCommandException.class)
    public void testExecuteExampleCommand() throws MissingCommandException {
        final CommandInvoker invoker = new CommandInvoker();
        assertNotNull(invoker);
        final String actionName = "ExampleCommand";
        invoker.execute(actionName);
    }

    @Test(expected = MissingCommandException.class)
    public void testExecuteBlank() throws MissingCommandException {
        final CommandInvoker invoker = new CommandInvoker();
        assertNotNull(invoker);
        final String actionName = "";
        invoker.execute(actionName);
    }

    @Test(expected = MissingCommandException.class)
    public void testExecuteNull() throws MissingCommandException {
        final CommandInvoker invoker = new CommandInvoker();
        assertNotNull(invoker);
        invoker.execute(null);
    }

}
