
package coaching.idioms;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * Regular Expression Test Class.
 */
public class RegularExpressionTest {
	private static final String PATTERN_STRING = "^XYZ$";
	private final Pattern PATTERN = Pattern.compile(PATTERN_STRING);

	/**
	 * Unit Test to regular expression.
	 */
	@Test
	public void testRegularExpression() {
		final RegularExpression regularExpression = new RegularExpression();
		assertNotNull("Value cannot be null",regularExpression);
	}

	/**
	 * Unit Test to regular expression string.
	 */
	@Test
	public void testRegularExpressionString() {
		final RegularExpression regularExpression = new RegularExpression(PATTERN_STRING);
		assertNotNull("Value cannot be null",regularExpression);
	}

	/**
	 * Unit Test to regular expression pattern.
	 */
	@Test
	public void testRegularExpressionPattern() {
		final RegularExpression regularExpression = new RegularExpression(PATTERN);
		assertNotNull("Value cannot be null",regularExpression);
	}

	/**
	 * Unit Test to verify.
	 */
	@Test
	public void testVerify() {
		final RegularExpression regularExpression = new RegularExpression();
		assertNotNull("Value cannot be null",regularExpression);
		assertTrue(regularExpression.verify("ABC"));
	}

	/**
	 * Unit Test to find.
	 */
	@Test
	public void testFind() {
		final RegularExpression regularExpression = new RegularExpression();
		assertNotNull("Value cannot be null",regularExpression);
		regularExpression.find("ABC");
	}

	/**
	 * Unit Test to replace.
	 */
	@Test
	public void testReplace() {
		final RegularExpression regularExpression = new RegularExpression();
		assertNotNull("Value cannot be null",regularExpression);
		regularExpression.replace("ABC", "ZYZ");
	}

}
