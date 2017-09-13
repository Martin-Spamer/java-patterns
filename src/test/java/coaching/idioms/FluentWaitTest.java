package coaching.idioms;

import org.junit.Test;

/**
 * FluentWaitTest Class.
 */
public class FluentWaitTest {

	/**
	 * Unit Test to fluent wait.
	 */
	@Test
	public void testFluentWait() {
		final FluentWait wait = new FluentWait();
		wait.timeOut(1000);
		wait.interval(100);
	}

	/**
	 * Unit Test to wait until condition true.
	 */
	@Test
	public void testWaitUntilConditionTrue() {
		final FluentWait wait = new FluentWait();
		// wait.until(new Condition(true));
		wait.until(Condition.isTrue());
	}

	/**
	 * Unit Test to wait until condition false.
	 */
	@Test
	public void testWaitUntilConditionFalse() {
		final FluentWait wait = new FluentWait();
		// wait.until(new Condition(false));
		wait.until(Condition.isFalse());
	}

}
