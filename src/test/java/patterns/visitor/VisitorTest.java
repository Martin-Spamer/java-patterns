
package patterns.visitor;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Unit Test for Visitor class.
 *
 * Represent an operation to be performed on elements of an object structure.
 * Visitor lets you define a new operation without changing the classes of the
 * elements on which it operates.
 */
public class VisitorTest {

	@Test
	public void testOperation() {
		final Visitor visitor = new Visitor();
		assertNotNull(visitor);
		final Element element = new Element();
		assertNotNull(element);
	}

}
