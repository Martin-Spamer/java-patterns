
package patterns.command;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * InvokerExampleTest Class.
 */
public class InvokerExampleTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(InvokerExampleTest.class);

    /**
     * Unit Test to example command.
     *
     */
    @Test
    public void testExampleCommand() {
        LOG.debug("testExampleCommand");
        final ResultInterface result = new ExampleCommand().execute();
        assertNotNull("Value cannot be null", result);
        LOG.info(result.toString());
    }

    /**
     * Unit Test to invoker example command.
     *
     */
    @Test
    public void testInvokerExampleCommand() {
        LOG.debug("testInvokerExampleCommand");
        final InvokerExample invokerExample = new InvokerExample();
        final ResultInterface result = invokerExample.execute("ExampleCommand");
        assertNotNull("Value cannot be null", result);
        LOG.info(result.toString());
    }

    /**
     * Unit Test to sequence command.
     *
     */
    @Test
    public void testSequenceCommand() {
        LOG.debug("testSequenceCommand");
        final ResultInterface result = new SequenceCommand().execute();
        assertNotNull("Value cannot be null", result);
        LOG.info(result.toString());
    }

    /**
     * Unit Test to invoker sequence command.
     *
     */
    @Test
    public void testInvokerSequenceCommand() {
        LOG.debug("testInvokerSequenceCommand");
        final InvokerExample invokerExample = new InvokerExample();
        final ResultInterface result = invokerExample.execute("SequenceCommand");
        assertNotNull("Value cannot be null", result);
        LOG.info(result.toString());
    }

    /**
     * Unit Test to compound command.
     *
     */
    @Test
    public void testCompoundCommand() {
        LOG.debug("testCompoundCommand");
        final ResultInterface result = new CompoundCommand().execute();
        assertNotNull("Value cannot be null", result);
        LOG.info(result.toString());
    }

    /**
     * Unit Test to invoker compound command.
     *
     */
    @Test
    public void testInvokerCompoundCommand() {
        LOG.debug("testInvokerCompoundCommand");
        final InvokerExample invokerExample = new InvokerExample();
        final ResultInterface result = invokerExample.execute("CompoundCommand");
        assertNotNull("Value cannot be null", result);
        LOG.info(result.toString());
    }

    /**
     * Unit Test to conditional command.
     *
     */
    @Test
    public void testConditionalCommand() {
        LOG.debug("testConditionalCommand");
        final ResultInterface result = new ConditionalCommand().execute();
        assertNotNull("Value cannot be null", result);
        LOG.info(result.toString());
    }

    /**
     * Unit Test to invoker conditional command.
     *
     */
    @Test
    public void testInvokerConditionalCommand() {
        LOG.debug("testInvokerConditionalCommand");
        final InvokerExample invokerExample = new InvokerExample();
        final ResultInterface result = invokerExample.execute("ConditionalCommand");
        assertNotNull("Value cannot be null", result);
        LOG.info(result.toString());
    }

}
