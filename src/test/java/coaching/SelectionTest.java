package coaching;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Examples of selection programming instructions.
 */
public class SelectionTest {
	private static final Logger LOG = LoggerFactory.getLogger(SelectionTest.class);

	/**
	 * The <code>if</code> statement is an example of selection.
	 */
	@Test
	public void testExampleIfTrue() {
		boolean selection;
		selection = false;
		if (selection) {
			LOG.info("true");
		}
		assertFalse(selection);
	}

	/**
	 * The <code>if</code> statement is an example of selection.
	 */
	@Test
	public void testExampleIfFalse() {
		boolean selection;
		selection = false;
		if (selection) {
			LOG.info("true");
		}
		assertFalse(selection);
	}

	/**
	 * The <code>if-then-else</code> statement is an example of selection.
	 */
	@Test
	public void testExampleIfElse() {
		boolean selection;
		selection = false;
		if (selection) {
			LOG.info("if true");
		} else {
			LOG.info("else false");
		}
		assertFalse(selection);
	}

	/**
	 * The <code>if-else-if</code> statement is an example of selection.
	 */
	@Test
	public void testExampleElseIfTrue() {
		int selection;
		selection = 1;
		if (selection == 0) {
			LOG.info("selection == 0");
		} else if (selection == 1) {
			LOG.info("selection == 1");
		} else {
			LOG.info("else");
		}
		assertTrue(selection == 1);
	}

	/**
	 * The <code>switch</code> statement is an example of selection.
	 */
	@Test
	public void testExampleSwitchInt() {
		final int selection = 0;
		switch (selection) {
			case 0:
				LOG.info("case 0");
				break;
			case 1:
				LOG.info("case 1");
				break;
			default:
				LOG.info("default");
		}
		assertEquals(0, selection);
	}

	/**
	 * Unit Test to show a switch on an string.
	 * The <code>if</code> statement is an example of selection.
	 */
	@Test
	public void testExampleSwitchString() {
		final String selection = "TRUE";
		switch (selection) {
			case "TRUE":
				LOG.info("true case");
				break;
			case "FALSE":
				LOG.info("false case");
				break;
		}
		assertTrue(selection.equals("TRUE"));
	}

	/**
	 * The STATEMENT Enum.
	 */
	public enum STATEMENT {
		SEQUENCE, SELECTION, ITERATION
	}

	/**
	 * Unit Test to switch enum.
	 * The <code>if</code> statement is an example of selection.
	 */
	@Test
	public void testExampleSwitchEnum() {
		final STATEMENT statement = STATEMENT.SELECTION;
		switch (statement) {
			case SEQUENCE:
				LOG.info("SEQUENCE");
				break;
			case SELECTION:
				LOG.info("SELECTION");
				break;
			case ITERATION:
				LOG.info("ITERATION");
				break;
		}
		assertEquals(STATEMENT.SELECTION, statement);
	}
}
