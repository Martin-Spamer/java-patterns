
package coaching.idioms;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

/**
 * Unit test to show enum example.
 */
public final class EnumTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(EnumTest.class);

    /**
     * The Enum TestEnum.
     */
    public enum TestEnum {

        /** The undefined. */
        UNDEFINED(0),

        /** The a. */
        A(1),

        /** The b. */
        B(2);

        /** The number. */
        private final int number;

        /**
         * Instantiates a new test enum.
         *
         * co value
         *
         * @param coValue the co value
         */
        private TestEnum(final int coValue) {
            number = coValue;
        }

        /**
         * From value.
         *
         * co value test enum
         *
         * @param coValue the co value
         * @return the unit test to enum
         */
        public static TestEnum fromValue(final int coValue) {
            for (final TestEnum value : values()) {
                if (value.number == coValue) {
                    return value;
                }
            }
            // return null; or
            return UNDEFINED;
        }
    }

    /**
     * Test missing.
     */
    @Test
    public void testMissing() {
        assertEquals(TestEnum.UNDEFINED, TestEnum.fromValue(Integer.MIN_VALUE));
        assertEquals(TestEnum.UNDEFINED, TestEnum.fromValue(Integer.MAX_VALUE));
        assertEquals(TestEnum.UNDEFINED, TestEnum.fromValue(0));
        assertEquals(TestEnum.A, TestEnum.fromValue(1));
        assertEquals(TestEnum.B, TestEnum.fromValue(2));
    }
}
