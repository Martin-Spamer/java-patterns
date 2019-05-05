
package coaching.text;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import lombok.extern.slf4j.Slf4j;

/**
 * A Unit test class for Text objects.
 */


@Slf4j
public final class TextTest {

    /**
     *  provides logging.
     */

    /**
     * Unit tests for the textFill() method of Text object.
     */
    @Test
    public void testTextFill() {
        final String fill = Text.fill(10);
        log.debug("Text.fill(10) = |{}|", fill);
        assertNotNull(fill);
        assertEquals(10, fill.length());
    }

    /**
     * Unit tests for the textFillStar() method of Text object.
     */
    @Test
    public void testTextFillStar() {
        final String fill = Text.fill(10, '*');
        log.debug("Text.fill(10, '*') = |{}|", fill);
        assertNotNull(fill);
        assertEquals(10, fill.length());
    }

    /**
     * Unit Test for test capitalise.
     */
    @Test
    public void testCapitalise() {
        assertEquals("", Text.capitalise(null));
        assertEquals("", Text.capitalise(""));
        assertEquals("Set", Text.capitalise("Set"));
        assertEquals("Set", Text.capitalise("Set"));
        assertEquals("Set.", Text.capitalise("sET."));
        assertEquals("Set.", Text.capitalise("sET."));
    }

    /**
     * Unit tests for the fillInt() method of Text object.
     */
    @Test
    public void testFillInt() {
        assertEquals("", Text.fill(0));
        assertEquals(" ", Text.fill(1));
        assertEquals("  ", Text.fill(2));
    }

    /**
     * Unit tests for the fillIntChar() method of Text object.
     */
    @Test
    public void testFillIntChar() {
        assertEquals("", Text.fill(0, '*'));
        assertEquals("*", Text.fill(1, '*'));
        assertEquals("**", Text.fill(2, '*'));
    }

    /**
     * Unit Test to pad a string to length with spaces.
     */
    @Test
    public void testPadToLengthStringInt() {
        final String padToLength = Text.padToLength("Stem", 5);
        log.debug("Text.padToLength('Stem', 5) = |{}|", padToLength);
        assertEquals(5, padToLength.length());
        assertEquals("Stem ", padToLength);
    }

    /**
     * Unit Test to pad a string to length with spaces character.
     */
    @Test
    public void testPadToLengthStringIntChar() {
        final String padToLength = Text.padToLength("Stem", 5, '*');
        log.debug("Text.padToLength('Stem', 5, '*') = |{}|", padToLength);
        assertEquals(5, padToLength.length());
        assertEquals("Stem*", padToLength);
    }

    /**
     * Test random char.
     */
    @Test
    public void testRandomChar() {
        assertTrue(Character.isLetter(Text.randomChar()));
    }

    /**
     * Test random string.
     */
    @Test
    public void testRandomString() {
        assertEquals(10, Text.randomString(10).length());
    }

    /**
     * Test random digit.
     */
    @Test
    public void testRandomDigit() {
        assertTrue(Character.isDigit(Text.randomDigit()));
    }

    /**
     * Test random digits.
     */
    @Test
    public void testRandomDigits() {
        assertTrue(Text.randomDigits(10).length() == 10);
    }

    /**
     * test Text object.
     */
    public void testJoin() {
        Text.join(new String[1], "");
        String[] fields = { "A", "B", "C" };
        assertEquals("A,B,C", Text.join(fields, ","));
    }

    /**
     * test Text object.
     */
    public void testRepeat() {
        assertEquals("-----", Text.repeat('-', 5));
        assertEquals("=====", Text.repeat("=", 5));
    }

}
