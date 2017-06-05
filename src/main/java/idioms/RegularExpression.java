
package idioms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * RegularExpression Class.
 */
public class RegularExpression {

	private static final String PATTERN_STRING = "^XYZ$";
	private final Pattern PATTERN = Pattern.compile(PATTERN_STRING);
	private Pattern pattern = this.PATTERN;

	/**
	 * Instantiates a new regular expression.
	 */
	public RegularExpression() {
		super();
	}

	/**
	 * Instantiates a new regular expression.
	 *
	 * @param patternString the pattern string
	 */
	public RegularExpression(String patternString) {
		super();
		this.pattern = Pattern.compile(patternString);
	}

	/**
	 * Instantiates a new regular expression.
	 *
	 * @param pattern the pattern
	 */
	public RegularExpression(Pattern pattern) {
		super();
		this.pattern = pattern;
	}

	/**
	 * Verify that.
	 *
	 * @param code the code
	 * @return true, if successful
	 */
	public boolean verify(final String code) {
		final Matcher matcher = this.PATTERN.matcher(code);
		return matcher.find();
	}

	/**
	 * Find.
	 *
	 * @param original the original
	 */
	public void find(final String original) {
		final Matcher matcher = this.PATTERN.matcher(original);
		while (matcher.find()) {
			final String string = String.format("Test %s starting at index %s and ending at index %s", matcher.group(),
			        matcher.start(), matcher.end());
			System.out.println(string);
		}
	}

	/**
	 * Replace.
	 *
	 * @param original the original
	 * @param newSubString the new sub string
	 * @return the string
	 */
	public String replace(final String original, String newSubString) {
		final Matcher matcher = this.PATTERN.matcher(original);
		return this.pattern.matcher(original).replaceAll(newSubString);
	}

}
