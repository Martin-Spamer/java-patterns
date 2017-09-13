package coaching.idioms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Fluent Wait Test Class.
 */
public class FluentWaitTest {

	private static final Logger LOG = LoggerFactory.getLogger(FluentWaitTest.class);

	public class PassCondition extends Condition {
		public PassCondition() {
			super(true);
		}
	}

	public class FailCondition extends Condition {
		public FailCondition() {
			super(false);
		}
	}

	/**
	 * Unit Test to fluent wait.
	 */
	@Test
	public void testFluentWaitDefault() {
		LOG.info("testFluentWaitDefault = {}", System.currentTimeMillis());
		final FluentWait wait = new FluentWait();
		final Condition pass = new PassCondition();
		assertTrue(wait.until(pass));
		LOG.info("end = {}", System.currentTimeMillis());
	}

	/**
	 * Unit Test to fluent wait.
	 */
	@Test
	public void testFluentWaitWithOverrides() {
		LOG.info("testFluentWaitDefault = {}", System.currentTimeMillis());
		final FluentWait wait = new FluentWait();

		assertEquals(wait, wait.timeOut(1000));
		assertEquals(1000, wait.timeOut());

		assertEquals(wait, wait.interval(100));
		assertEquals(1000, wait.timeOut());

		final Condition pass = new PassCondition();
		assertTrue(wait.until(pass));
		LOG.info("end = {}", System.currentTimeMillis());
	}

	/**
	 * Unit Test to wait until condition true.
	 */
	@Test
	public void testWaitUntilConditionTrue() {
		LOG.info("testFluentWaitDefault = {}", System.currentTimeMillis());
		final FluentWait wait = new FluentWait();
		assertTrue(wait.until(Condition.isTrue()));
		LOG.info("end = {}", System.currentTimeMillis());
	}

	/**
	 * Unit Test to wait until condition false.
	 */
	@Test
	public void testWaitUntilConditionFalse() {
		LOG.info("testFluentWaitDefault = {}", System.currentTimeMillis());
		final FluentWait wait = new FluentWait();
		// wait.until(new Condition(false));
		assertFalse(wait.until(Condition.isFalse()));
		LOG.info("end = {}", System.currentTimeMillis());
	}

}