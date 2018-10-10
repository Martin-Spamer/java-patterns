
package coaching.automation;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit test class for Verify.
 */
public class VerifyTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(VerifyTest.class);

    /**
     * Unit test to verify that.
     */
    @Test
    public void testVerifyThatBoolean() {
        Verify.that(true).isTrue();
        Verify.that(false).isFalse();
        Verify.that(new Boolean(true)).isTrue();
        Verify.that(new Boolean(false)).isFalse();
    }

    /**
     * Unit test to verify that.
     */
    @Test
    public void testVerifyThatInt() {
        Verify.that(1).equalTo(1);
        Verify.that(1).equalTo(0);
        Verify.that(new Integer(1)).equalTo(1);
        Verify.that(new Integer(0)).equalTo(0);
    }

    /**
     * Unit test to verify that.
     */
    @Test
    public void testVerifyThatLong() {
        Verify.that(1L).equalTo(1);
        Verify.that(1L).equalTo(0);
        Verify.that(new Long(1L)).equalTo(1);
        Verify.that(new Long(1L)).equalTo(0);
    }

    /**
     * Unit test to verify that.
     */
    @Test
    public void testVerifyThatChar() {
        Verify.that(1).equalTo(1);
        Verify.that(1).equalTo(0);
        Verify.that(1L).equalTo(1);
        Verify.that(1L).equalTo(0);
    }

    /**
     * Unit test to verify that byte.
     */
    @Test
    public void testVerifyThatByte() {
        final byte zero = 0x0;
        final byte one = 0x1;
        Verify.that(zero).equalTo(0);
        Verify.that(one).equalTo(1);
        Verify.that(new Byte(zero)).equalTo(0);
        Verify.that(new Byte(one)).equalTo(1);
    }

    // @Test
    // public void testVerifyThatMoney() {
    // Verify.that(new Money()).equalTo(new Money());
    // Verify.that(new Money()).equalTo(new Money());
    // }

    // @Test
    // public void testVerifyThatPounds() {
    // Verify.that(new Pounds()).equalTo(new Pounds());
    // Verify.that(new Pounds()).equalTo(new Pounds());
    // }

    // @Test
    // public void testVerifyThatB() {
    // Verify.that(new BigDecimalMoney()).equalTo(new BigDecimalMoney());
    // Verify.that(new BigDecimalMoney()).equalTo(new BigDecimalMoney());
    // }

}
