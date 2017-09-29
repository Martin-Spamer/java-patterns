
package patterns.interpreter;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * class DisjunctionTest.
 */
public class DisjunctionTest {

	/**
	 * class Mock.
	 */
	public final class Mock extends AbstractExpression {
		public Mock(final boolean result) {
			super(result);
		}
	}

	/**
	 * class Pass.
	 */
	public final class Pass extends AbstractExpression {
		public Pass() {
			super(true);
		}
	}

	/**
	 * class Fail.
	 */
	public final class Fail extends AbstractExpression {
		public Fail() {
			super(false);
		}
	}

	/**
	 * Unit Test to disjunction.
	 */
	@Test
	public void testDisjunction() {
		final Disjunction disjunction = new Disjunction(new Mock(true), new Mock(true));
		assertNotNull("Value cannot be null",disjunction);
	}

	/**
	 * Unit Test to interpret pass.
	 */
	@Test
	public void testInterpretPass() {
		final Disjunction conjunction = new Disjunction(new Pass(), new Pass());
		assertNotNull("Value cannot be null",conjunction);
		final boolean interpret = conjunction.interpret(new Context());
		assertTrue(interpret);
	}

	/**
	 * Unit Test to interpret fail.
	 */
	@Test
	public void testInterpretFail() {
		final Context context = new Context();
		assertNotNull("Value cannot be null",context);
		assertFalse(new Conjunction(new Pass(), new Fail()).interpret(context));
		assertFalse(new Conjunction(new Fail(), new Pass()).interpret(context));
		assertFalse(new Conjunction(new Fail(), new Fail()).interpret(context));
	}

}
