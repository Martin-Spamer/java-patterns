
package coaching.money;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Currency;
import java.util.Locale;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Pounds Test Class.
 */
public class PoundsTest {

    /** The Constant LOG. */
    private static final Logger LOG = LoggerFactory.getLogger(PoundsTest.class);

    /**
     * A Class for Pounds as Money.
     */
    public final class Pounds extends Money {

        /**
         * Instantiates a new pounds.
         */
        public Pounds() {
            super(Currency.getInstance(Locale.UK), 0);
        }

        /**
         * Instantiates a new pounds.
         *
         * @param amount
         *            the amount
         */
        public Pounds(final long amount) {
            super(Currency.getInstance(Locale.UK), amount);
        }
    }

    /**
     * Unit Test to money.
     */
    @Test
    public void testPounds() {
        LOG.info("testPounds");

        final Pounds pounds = new Pounds(10L);
        assertNotNull("Value cannot be null", pounds);
        LOG.info("new Money(10L) = {}", pounds.toString());

        pounds.add(1L);
        LOG.info("new Money(10L).add(1L) = {}", pounds.toString());

        pounds.add(new Money(1L));
        LOG.info("new Money(10L).add(1L) = {}", pounds.toString());

        pounds.subtract(2L);
        LOG.info("new Money(10L).add(1L).subtract(2L) = {}", pounds.toString());

        pounds.subtract(new Money(2L));
        LOG.info("new Money(10L).add(1L).subtract(2L) = {}", pounds.toString());

        assertTrue(pounds.isMoreThan(7L));
        assertTrue(pounds.isMoreThan(new Money(7L)));
        LOG.info("{}", pounds.toString());

        assertTrue(pounds.isEqualTo(8L));
        assertTrue(pounds.isEqualTo(new Money(8L)));
        LOG.info("{}", pounds.toString());

        assertTrue(pounds.isLessThan(9L));
        assertTrue(pounds.isLessThan(new Money(9L)));
        LOG.info("{}", pounds.toString());
    }

    /**
     * Unit Test to money currency.
     */
    @Test
    public void testPoundsCurrency() {
        LOG.info("testPoundsCurrency");
        final MoneyInterface pounds = new Pounds();
        assertNotNull("Value cannot be null", pounds);
        assertTrue(pounds.isEqualTo(0));
    }

    /**
     * Unit Test to money long.
     */
    @Test
    public void testPoundsCurrencyLong() {
        LOG.info("testPoundsCurrencyLong");
        final MoneyInterface pounds = new Pounds(0L);
        assertNotNull("Value cannot be null", pounds);
        assertTrue(pounds.isEqualTo(0));
    }

    /**
     * Unit Test to min value.
     */
    @Test
    public void testMinValue() {
        LOG.info("testMinValue");
        final MoneyInterface money = new Money(Long.MIN_VALUE);
        assertNotNull("Value cannot be null", money);
        LOG.info("{}", money.toString());
        assertTrue(money.isEqualTo(Long.MIN_VALUE));
    }

    /**
     * Unit Test to max value.
     */
    @Test
    public void testMaxValue() {
        LOG.info("testMaxValue");
        final MoneyInterface money = new Money(Long.MAX_VALUE);
        assertNotNull("Value cannot be null", money);
        LOG.info("{}", money.toString());
        assertTrue(money.isEqualTo(Long.MAX_VALUE));
    }

    /**
     * Unit Test to max pounds.
     */
    @Test
    public void testMaxPounds() {
        final MoneyInterface pounds = new Pounds(Long.MAX_VALUE);
        LOG.info("{}", pounds.toString());
        assertNotNull("Value cannot be null", pounds);
        final String actual = pounds.toString();
        assertEquals("£ 9,223,372,036,854,775,807", actual);
    }

}
