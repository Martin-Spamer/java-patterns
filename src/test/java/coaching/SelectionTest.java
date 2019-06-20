
package coaching;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import lombok.extern.slf4j.Slf4j;

/**
 * Examples of selection programming instructions.
 */


/** The Constant 			log. */
@Slf4j
public final class SelectionTest {

    /**
     * The <code>if</code> statement is an example of selection.
     */
    @Test
    public void testExampleIfTrue() {
        boolean selection;
        selection = true;
        if (selection) {
            log.info("testExampleIfTrue");
        }
        assertTrue(selection);
    }

    /**
     * The <code>if</code> statement is an example of selection.
     */
    @Test
    public void testExampleIfFalse() {
        boolean selection;
        selection = false;
        if (selection) {
            log.info("testExampleIfFalse");
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
            log.info("if true");
        } else {
            log.info("else false");
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
            log.info("selection == 0");
        } else if (selection == 1) {
            log.info("selection == 1");
        } else {
            log.info("else");
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
            log.info("case 0");
            break;
        case 1:
            log.info("case 1");
            break;
        default:
            log.info("default");
            break;
        }
        assertEquals(0, selection);
    }

    /**
     * Unit Test to show a switch on an string. The <code>if</code> statement is
     * an example of selection.
     */
    @Test
    public void testExampleSwitchString() {
        final String selection = "TRUE";
        switch (selection) {
        case "TRUE":
            log.info("true case");
            break;
        case "FALSE":
            log.info("false case");
            break;
        default:
            log.info("default");
            break;
        }
        assertEquals("TRUE", selection);
    }

    /**
     * Enumeration for a type of STATEMENT.
     */
    public enum STATEMENT {

        /** The sequence. */
        SEQUENCE,
        /** The selection. */
        SELECTION,
        /** The iteration. */
        ITERATION
    }

    /**
     * Unit Test to show an example of switch on enumeration value. The
     * <code>if</code> statement is an example of selection.
     */
    @Test
    public void testExampleSwitchEnum() {
        final STATEMENT statement = STATEMENT.SELECTION;
        switch (statement) {
        case SEQUENCE:
            log.info("SEQUENCE");
            break;
        case SELECTION:
            log.info("SELECTION");
            break;
        case ITERATION:
            log.info("ITERATION");
            break;
        default:
            log.info("default");
            break;
        }
        assertEquals(STATEMENT.SELECTION, statement);
    }
}
