/**
 *  @title       SingleResponsibilityPrinciple.java
 *  @description TODO
 *  @author      martin.spamer.
 *  @version     0.1 - first release.
 *	Created      13-Jan-2005
 *
 **/

package coaching.solid;

import static org.junit.Assert.assertNotNull;

import org.slf4j.*;

/**
 * Demonstrate the Single Responsibility Principle.
 * A class should have a responsibility pieces of functionality.
 * @author martin.spamer
 * @version 0.1 - 12:05:35
 */
public class SingleResponsibilityPrinciple {

	private static final Logger LOG = LoggerFactory.getLogger(SingleResponsibilityPrinciple.class);

	/**
	 * Foo bar.
	 */
	public void fooBar() {
		LOG.info("fooBar");
		foo();
		bar();
	}

	/**
	 * Foo.
	 */
	private void foo() {
		LOG.info("foo");
	}

	/**
	 * Bar.
	 */
	private void bar() {
		LOG.info("bar");
	}

	/**
	 * main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {
		final SingleResponsibilityPrinciple srp = new SingleResponsibilityPrinciple();
		assertNotNull("Value cannot be null",srp);
		srp.fooBar();
	}

}
