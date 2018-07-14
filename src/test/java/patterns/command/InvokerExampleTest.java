
package patterns.command;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test example of an Invoker class.
 *
 * Each command is statically constructed and invoked.
 */
public final class InvokerExampleTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(InvokerExampleTest.class);

    /**
     * Unit Test for example command.
     */
    @Test
    public void testExampleCommand() {
        LOG.info("testExampleCommand");
        final ResultInterface result = new ExampleCommand().execute();
        assertNotNull(result);
        LOG.debug(result.toString());
    }

    /**
     * Unit Test of invoker with the example command.
     */
    @Test
    public void testInvokerExampleCommand() {
        LOG.info("testInvokerExampleCommand");
        final InvokerExample invokerExample = new InvokerExample();
        final ResultInterface result = invokerExample.execute("ExampleCommand");
        assertNotNull(result);
        LOG.debug(result.toString());
    }

    /**
     * Unit Test for the sequence command.
     */
    @Test
    public void testSequenceCommand() {
        LOG.info("testSequenceCommand");
        final ResultInterface result = new SequenceCommand().execute();
        assertNotNull(result);
        LOG.debug(result.toString());
    }

    /**
     * Unit Test of invoker with the sequence command.
     */
    @Test
    public void testInvokerSequenceCommand() {
        LOG.info("testInvokerSequenceCommand");
        final InvokerExample invokerExample = new InvokerExample();
        final ResultInterface result = invokerExample.execute("SequenceCommand");
        assertNotNull(result);
        LOG.debug(result.toString());
    }

    /**
     * Unit Test for the compound command.
     */
    @Test
    public void testCompoundCommand() {
        LOG.info("testCompoundCommand");
        final ResultInterface result = new CompoundCommand().execute();
        assertNotNull(result);
        LOG.debug(result.toString());
    }

    /**
     * Unit Test of invoker with the compound command.
     */
    @Test
    public void testInvokerCompoundCommand() {
        LOG.info("testInvokerCompoundCommand");
        final InvokerExample invokerExample = new InvokerExample();
        final ResultInterface result = invokerExample.execute("CompoundCommand");
        assertNotNull(result);
        LOG.debug(result.toString());
    }

    /**
     * Unit Test for the conditional command.
     */
    @Test
    public void testConditionalCommand() {
        LOG.info("testConditionalCommand");
        final ResultInterface result = new ConditionalCommand().execute();
        assertNotNull(result);
        LOG.debug(result.toString());
    }

    /**
     * Unit Test of invoker with the conditional command.
     */
    @Test
    public void testInvokerConditionalCommand() {
        LOG.info("testInvokerConditionalCommand");
        final InvokerExample invokerExample = new InvokerExample();
        final ResultInterface result = invokerExample.execute("ConditionalCommand");
        assertNotNull(result);
        LOG.debug(result.toString());
    }

}
