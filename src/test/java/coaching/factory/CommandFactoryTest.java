
package coaching.factory;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import patterns.command.AbstractCommand;

/**
 * Unit test class for ClassFactory.
 */
public class CommandFactoryTest {

    @Test
    public void testCreate() {
        AbstractCommand command = CommandFactory.create();
        assertNotNull(command);
    }

    @Test
    public void testCreateByClassName() {
        assertNotNull(CommandFactory.create());
    }

    @Test
    public void testCreateByKey() {
        CommandFactory commandFactory = CommandFactory.getInstance();
        AbstractCommand command = commandFactory.createByKey("key");
        assertNotNull(command);
    }

    @Test
    public void testCreateByMissingKey() {
        CommandFactory commandFactory = CommandFactory.getInstance();
        AbstractCommand command = commandFactory.createByKey("missing");
        assertNotNull(command);
    }

}
