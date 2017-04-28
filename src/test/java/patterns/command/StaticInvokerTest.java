package patterns.command;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import patterns.mvc.controller.ResultInterface;

public class StaticInvokerTest {

	private static final Logger LOG = LoggerFactory.getLogger(StaticInvokerTest.class);

	@Test
	public void testExampleCommandInvoker() throws Exception {
		final ResultInterface execute = new StaticInvoker().execute("ExampleCommand");
	}

	@Test
	public void testCommandSequenceInvoker() throws Exception {
		new StaticInvoker().execute("CommandSequence");
	}

	@Test
	public void testCompoundCommandInvoker() throws Exception {
		new StaticInvoker().execute("CompoundCommand");
	}

	@Test
	public void testConditionalCommandInvoker() throws Exception {
		new StaticInvoker().execute("ConditionalCommand");
	}

}
