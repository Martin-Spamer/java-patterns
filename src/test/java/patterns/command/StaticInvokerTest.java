package patterns.command;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import patterns.mvc.controller.ResultInterface;

public class StaticInvokerTest {

	private static final Logger LOG = LoggerFactory.getLogger(StaticInvokerTest.class);

	@Test
	public void testExampleCommandInvoker() throws Exception {
		final ResultInterface result = new StaticInvoker().execute("ExampleCommand");
		assertNotNull(result);
		LOG.info(result.toString());
	}

	@Test
	public void testCommandSequenceInvoker() throws Exception {
		final ResultInterface result = new StaticInvoker().execute("CommandSequence");
		assertNotNull(result);
		LOG.info(result.toString());
	}

	@Test
	public void testCompoundCommandInvoker() throws Exception {
		final ResultInterface result = new StaticInvoker().execute("CompoundCommand");
		assertNotNull(result);
		LOG.info(result.toString());
	}

	@Test
	public void testConditionalCommandInvoker() throws Exception {
		final ResultInterface result = new StaticInvoker().execute("ConditionalCommand");
		assertNotNull(result);
		LOG.info(result.toString());
	}

}
