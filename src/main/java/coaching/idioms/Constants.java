
package coaching.idioms;

import lombok.extern.slf4j.Slf4j;

/**
 * Place an organisational Constants class in the organisations root namespace.
 * e.g The files might exist in uk.co.company
 */


@Slf4j
public final class Constants {

    /** COUNTRY_CODE Constant. */
    public static final String COUNTRY_CODE = "uk";

    /** COUNTRY_NAME Constant. */
    public static final String COUNTRY_NAME = "United Kingdom";

    /** LANGUAGE_CODE Constant. */
    public static final String LANGUAGE_CODE = "en";

    /** LANGUAGE_NAME Constant. */
    public static final String LANGUAGE_NAME = "English";

    /** CURRENCY_CODE Constant. */
    public static final String CURRENCY_CODE = "GPB";

    /** CURRENCY_GLYPH Constant. */
    public static final String CURRENCY_GLYPH = "&#163";

    /** CURRENCY_NAME Constant. */
    public static final String CURRENCY_NAME = "pound";

    /**
     * Prevent wild instantiation.
     */
    private Constants() {
        throw new UnsupportedOperationException("Do not instantiate this class, use statically.");
    }

}
