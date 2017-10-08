


package patterns.command;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.*;

/**
 * InvokerExampleTest Class.
 */
public class InvokerExampleTest {

	private static final Logger LOG = LoggerFactory.getLogger(InvokerExampleTest.class);

	/**
	 * Unit Test to example command.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testExampleCommand() throws Exception {
		LOG.debug("testExampleCommand");
		final ResultInterface result = new ExampleCommand().execute();
		assertNotNull("Value cannot be null", result);
		LOG.info(result.toString());
	}

	/**
	 * Unit Test to invoker example command.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testInvokerExampleCommand() throws Exception {
		LOG.debug("testInvokerExampleCommand");
		final InvokerExample invokerExample = new InvokerExample();
		final ResultInterface result = invokerExample.execute("ExampleCommand");
		assertNotNull("Value cannot be null", result);
		LOG.info(result.toString());
	}

	/**
	 * Unit Test to sequence command.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testSequenceCommand() throws Exception {
		LOG.debug("testSequenceCommand");
		final ResultInterface result = new SequenceCommand().execute();
		assertNotNull("Value cannot be null", result);
		LOG.info(result.toString());
	}

	/**
	 * Unit Test to invoker sequence command.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testInvokerSequenceCommand() throws Exception {
		LOG.debug("testInvokerSequenceCommand");
		final InvokerExample invokerExample = new InvokerExample();
		final ResultInterface result = invokerExample.execute("SequenceCommand");
		assertNotNull("Value cannot be null", result);
		LOG.info(result.toString());
	}

	/**
	 * Unit Test to compound command.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testCompoundCommand() throws Exception {
		LOG.debug("testCompoundCommand");
		final ResultInterface result = new CompoundCommand().execute();
		assertNotNull("Value cannot be null", result);
		LOG.info(result.toString());
	}

	/**
	 * Unit Test to invoker compound command.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testInvokerCompoundCommand() throws Exception {
		LOG.debug("testInvokerCompoundCommand");
		final InvokerExample invokerExample = new InvokerExample();
		final ResultInterface result = invokerExample.execute("CompoundCommand");
		assertNotNull("Value cannot be null", result);
		LOG.info(result.toString());
	}

	/**
	 * Unit Test to conditional command.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testConditionalCommand() throws Exception {
		LOG.debug("testConditionalCommand");
		final ResultInterface result = new ConditionalCommand().execute();
		assertNotNull("Value cannot be null", result);
		LOG.info(result.toString());
	}

	/**
	 * Unit Test to invoker conditional command.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testInvokerConditionalCommand() throws Exception {
		LOG.debug("testInvokerConditionalCommand");
		final InvokerExample invokerExample = new InvokerExample();
		final ResultInterface result = invokerExample.execute("ConditionalCommand");
		assertNotNull("Value cannot be null", result);
		LOG.info(result.toString());
	}

}
