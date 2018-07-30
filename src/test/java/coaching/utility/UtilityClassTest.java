
package coaching.utility;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.fail;

/**
 * Unit test class for UtilityClass.
 */
public class UtilityClassTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(UtilityClassTest.class);

    /**
     * The Class UtilityClass.
     */
    public class UtilityClass {

        /**
         * Instantiates a new utility class.
         */
        private UtilityClass() {
            fail("The UtilityClass methods should be accessed statically");
        }
    }

    /**
     * The Class UtilityClassTwo.
     */
    public class UtilityClassTwo {

        /**
         * Instantiates a new utility class two.
         */
        private UtilityClassTwo() {
            Error
                .fail("The UtilityClass methods should be accessed statically");
        }
    }

    /**
     * The Class UtilityClassThree.
     */
    public class UtilityClassThree {

        /**
         * Instantiates a new utility class three.
         */
        private UtilityClassThree() {
            assert false : "The UtilityClass methods should be accessed statically";
        }
    }

    /**
     * Unit test to utility class.
     */
    @Test(expected = AssertionError.class)
    public void testUtilityClass() {
        new UtilityClass();
    }

    /**
     * Unit test to utility class two.
     */
    @Test(expected = AssertionError.class)
    public void testUtilityClassTwo() {
        new UtilityClassTwo();
    }

    /**
     * Unit test to utility class three.
     */
    @Test(expected = AssertionError.class)
    public void testUtilityClassThree() {
        new UtilityClassThree();
    }

}
