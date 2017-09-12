package coaching;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Examples of a selection programming instructions.
 * SelectionTest class.
 */
public class SelectionTest {
	private static final Logger LOG = LoggerFactory.getLogger(SelectionTest.class);

	/**
	 * Unit Test to show an if.
	 */
	@Test
	public void testExampleIf() {
		boolean selection;
		selection = false;
		if (selection) {
			LOG.info("true");
		}
		assertTrue(true);
	}

	/**
	 * Unit Test to show an if else.
	 */
	@Test
	public void testExampleIfElse() {
		boolean selection;
		selection = false;
		if (selection) {
			LOG.info("true");
		} else {
			LOG.info("else");
		}
		assertTrue(true);
	}

	/**
	 * Unit Test to show an if else if.
	 */
	@Test
	public void testExampleIfElseIf() {
		boolean selection;
		selection = false;
		if (selection) {
			LOG.info("true");
		} else if (!selection) {
			LOG.info("else if ");
		} else {
			LOG.info("else");
		}
		assertTrue(true);
	}

	/**
	 * Unit Test to show a switch on an integer number.
	 */
	@Test
	public void testExampleSwitchInt() {
		final int selection = 0;
		switch (selection) {
			case 0:
				LOG.info("true");
				break;
			case 1:
				LOG.info("true");
				break;
			default:
				LOG.info("true");
		}
		assertTrue(true);
	}

	/**
	 * Unit Test to show a switch on an string.
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
			default:
				LOG.info("default");
		}
		assertTrue(true);
	}

	/**
	 * The STATEMENT Enum.
	 */
	public enum STATEMENT {
		SEQUENCE, SELECTION, ITERATION
	}

	/**
	 * Unit Test to switch enum.
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
