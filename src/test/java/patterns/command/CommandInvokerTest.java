package patterns.command;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CommandInvokerTest {

    @Test(expected=MissingCommandException.class)
    public void testExecuteExampleCommand() throws MissingCommandException {
        CommandInvoker invoker = new CommandInvoker();
        assertNotNull(invoker);
        String actionName = "ExampleCommand";
        invoker.execute(actionName);
    }

    @Test(expected=MissingCommandException.class)
    public void testExecuteBlank() throws MissingCommandException {
        CommandInvoker invoker = new CommandInvoker();
        assertNotNull(invoker);
        String actionName = "";
        invoker.execute(actionName);
    }

    @Test(expected=MissingCommandException.class)
    public void testExecuteNull() throws MissingCommandException {
        CommandInvoker invoker = new CommandInvoker();
        assertNotNull(invoker);
        invoker.execute(null);
    }

}
