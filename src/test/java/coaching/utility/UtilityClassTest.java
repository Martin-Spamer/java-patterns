
package coaching.utility;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.fail;

public class UtilityClassTest {

    private static final Logger LOG = LoggerFactory
        .getLogger(UtilityClassTest.class);

    public class UtilityClass {
        private UtilityClass() {
            fail("The UtilityClass methods should be accessed statically");
        }
    }

    public class UtilityClassTwo {
        private UtilityClassTwo() {
            Error
                .fail("The UtilityClass methods should be accessed statically");
        }
    }

    public class UtilityClassThree {
        private UtilityClassThree() {
            assert false : "The UtilityClass methods should be accessed statically";
        }
    }

    @Test(expected = AssertionError.class)
    public void testUtilityClass() {
        new UtilityClass();
    }

    @Test(expected = AssertionError.class)
    public void testUtilityClassTwo() {
        new UtilityClassTwo();
    }

    @Test(expected = AssertionError.class)
    public void testUtilityClassThree() {
        new UtilityClassThree();
    }

}
