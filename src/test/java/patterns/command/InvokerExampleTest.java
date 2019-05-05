
package patterns.command;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test example of an Invoker class.
 *
 * Each command is statically constructed and invoked.
 */


@Slf4j
public final class InvokerExampleTest {

    /**
     * Unit Test for example command.
     */
    @Test
    public void testExampleCommand() {
        log.info("testExampleCommand");
        final ResultInterface result = new ExampleCommand().execute();
        assertNotNull(result);
        log.debug(result.toString());
    }

    /**
     * Unit Test of invoker with the example command.
     */
    @Test
    public void testInvokerExampleCommand() {
        log.info("testInvokerExampleCommand");
        final InvokerExample invokerExample = new InvokerExample();
        final ResultInterface result = invokerExample.execute("ExampleCommand");
        assertNotNull(result);
        log.debug(result.toString());
    }

    /**
     * Unit Test for the sequence command.
     */
    @Test
    public void testSequenceCommand() {
        log.info("testSequenceCommand");
        final ResultInterface result = new CommandSequence().execute();
        assertNotNull(result);
        log.debug(result.toString());
    }

    /**
     * Unit Test of invoker with the sequence command.
     */
    @Test
    public void testInvokerSequenceCommand() {
        log.info("testInvokerSequenceCommand");
        final InvokerExample invokerExample = new InvokerExample();
        final ResultInterface result = invokerExample.execute("SequenceCommand");
        assertNotNull(result);
        log.debug(result.toString());
    }

    /**
     * Unit Test for the compound command.
     */
    @Test
    public void testCompoundCommand() {
        log.info("testCompoundCommand");
        final ResultInterface result = new CompoundCommand().execute();
        assertNotNull(result);
        log.debug(result.toString());
    }

    /**
     * Unit Test of invoker with the compound command.
     */
    @Test
    public void testInvokerCompoundCommand() {
        log.info("testInvokerCompoundCommand");
        final InvokerExample invokerExample = new InvokerExample();
        final ResultInterface result = invokerExample.execute("CompoundCommand");
        assertNotNull(result);
        log.debug(result.toString());
    }

    /**
     * Unit Test for the conditional command.
     */
    @Test
    public void testConditionalCommand() {
        log.info("testConditionalCommand");
        final ResultInterface result = new ConditionalCommand().execute();
        assertNotNull(result);
        log.debug(result.toString());
    }

    /**
     * Unit Test of invoker with the conditional command.
     */
    @Test
    public void testInvokerConditionalCommand() {
        log.info("testInvokerConditionalCommand");
        final InvokerExample invokerExample = new InvokerExample();
        final ResultInterface result = invokerExample.execute("ConditionalCommand");
        assertNotNull(result);
        log.debug(result.toString());
    }

}
