
package coaching.idioms;

import java.util.regex.Pattern;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test showing Regular Expression class.
 */


@Slf4j
public final class RegularExpressionTest {

    /** The Constant PATTERN_STRING. */
    private static final String PATTERN_STRING = "^XYZ$";

    /** The pattern. */
    private final Pattern PATTERN = Pattern.compile(PATTERN_STRING);

    /**
     * Unit Test to regular expression.
     */
    @Test
    public void testRegularExpression() {
        final RegularExpression regularExpression = new RegularExpression();
        assertNotNull(regularExpression);
    }

    /**
     * Unit Test to regular expression string.
     */
    @Test
    public void testRegularExpressionString() {
        final RegularExpression regularExpression = new RegularExpression(PATTERN_STRING);
        assertNotNull(regularExpression);
    }

    /**
     * Unit Test to regular expression pattern.
     */
    @Test
    public void testRegularExpressionPattern() {
        final RegularExpression regularExpression = new RegularExpression(PATTERN);
        assertNotNull(regularExpression);
    }

    /**
     * Unit Test to verify.
     */
    @Test
    public void testVerify() {
        final RegularExpression regularExpression = new RegularExpression();
        assertNotNull(regularExpression);
        assertTrue(regularExpression.verify("ABC"));
    }

    /**
     * Unit Test to find.
     */
    @Test
    public void testFind() {
        final RegularExpression regularExpression = new RegularExpression();
        assertNotNull(regularExpression);
        regularExpression.find("ABC");
    }

    /**
     * Unit Test to replace.
     */
    @Test
    public void testReplace() {
        final RegularExpression regularExpression = new RegularExpression();
        assertNotNull(regularExpression);
        regularExpression.replace("ABC", "ZYZ");
    }

    /**
     * Unit test to quoted.
     */
    @Test
    public void testQuoted() {
        final RegularExpression regularExpression = new RegularExpression();
        assertNotNull(regularExpression);
        final String original = "\"Some Stuff\"";
        log.info("{}", original);
        final String quoted = regularExpression.getQuoted(original);
        log.info("{}", quoted);
        assertTrue(quoted.equals("Some Stuff"));
    }

}
