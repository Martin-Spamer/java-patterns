
package patterns.visitor;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Unit Test for Visitor class.
 *
 * Represent an operation to be performed on elements of an object structure.
 * classes of the
 * elements on which it operates.
 */
public class VisitorTest {

	/**
	 * Unit Test to operation.
	 */
	@Test
	public void testOperation() {
		final Visitor visitor = new Visitor();
		assertNotNull(visitor);
		final Element element = new Element();
		assertNotNull(element);
	}

}
