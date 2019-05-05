
package coaching.idioms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * RegularExpression Class.
 */


@Slf4j
public class RegularExpression {

    /** The Constant PATTERN_STRING. */
    private static final String PATTERN_STRING = "^ABC$";

    /** QUOTED_STRING constant. */
    private static final String QUOTED_STRING = "^\"(.*?)\"$";

    /** The pattern. */
    private Pattern pattern = Pattern.compile(PATTERN_STRING);

    /**
     * Instantiates a new regular expression.
     */
    public RegularExpression() {
        super();
    }

    /**
     * Instantiates a new regular expression.
     *
     * pattern string
     *
     * @param patternString the pattern string
     */
    public RegularExpression(final String patternString) {
        super();
        this.pattern = Pattern.compile(patternString);
    }

    /**
     * Instantiates a new regular expression.
     *
     * pattern
     *
     * @param pattern the pattern
     */
    public RegularExpression(final Pattern pattern) {
        super();
        this.pattern = pattern;
    }

    /**
     * Verify that.
     *
     * code
     *
     * @param code the code
     * @return true, if successful, otherwise false.
     */
    public boolean verify(final String code) {
        final Matcher matcher = this.pattern.matcher(code);
        return matcher.find();
    }

    /**
     * Find.
     *
     * original
     *
     * @param original the original
     */
    public void find(final String original) {
        final Matcher matcher = this.pattern.matcher(original);
        while (matcher.find()) {
            final String message = "Test %s starting at index %s and ending at index %s";
            final String string = String.format(message, matcher.group(), matcher.start(), matcher.end());
            log.info(string);
        }
    }

    /**
     * Gets the quoted string.
     *
     * @param original the original string.
     * @return the quoted part of the original string.
     */
    public String getQuoted(final String original) {
        final Matcher matcher = Pattern.compile(QUOTED_STRING).matcher(original);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    /**
     * Replace.
     *
     * original new sub string string
     *
     * @param original the original
     * @param newSubString the new sub string
     * @return the string
     */
    public String replace(final String original, final String newSubString) {
        return this.pattern.matcher(original).replaceAll(newSubString);
    }

}
