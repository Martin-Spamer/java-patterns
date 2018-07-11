
package automation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnumTest {

    public enum TestEnum {
        UNDEFINED(0),
        A(1),
        B(2);

        /** The number. */
        private final int number;

        /**
         * Instantiates a new test enum.
         *
         * co value
         */
        private TestEnum(final int coValue) {
            number = coValue;
        }

        /**
         * From value.
         *
         * co value
         * test enum
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
        assertEquals(TestEnum.UNDEFINED, TestEnum.fromValue(0));
        assertEquals(TestEnum.A, TestEnum.fromValue(1));
        assertEquals(TestEnum.B, TestEnum.fromValue(2));
        assertEquals(TestEnum.UNDEFINED, TestEnum.fromValue(Integer.MAX_VALUE));
    }
}
