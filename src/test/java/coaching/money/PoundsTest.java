
package coaching.money;

import java.util.Currency;
import java.util.Locale;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import static org.junit.Assume.assumeTrue;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests for the Pounds class.
 */
@Slf4j
public final class PoundsTest {

    /**
     * Before test.
     */
    @Before
    public void beforeTest() {
        log.info("beforeTest");
        final Locale defaultLocale = Locale.getDefault();
        final Currency defaultCurrency = Currency.getInstance(defaultLocale);
        assumeTrue(defaultCurrency.getSymbol().equals("£"));
    }

    /**
     * Unit Test to money.
     */
    @Test
    public void testPounds() {
        log.info("testPounds");
        final Locale defaultLocale = Locale.getDefault();
        final Currency defaultCurrency = Currency.getInstance(defaultLocale);
        assumeTrue(defaultCurrency.getSymbol().equals("£"));

        final Pounds pounds = new Pounds(10L);
        assertNotNull(pounds);
        log.info("new Money(10L) = {}", pounds.toString());

        pounds.add(1L);
        log.info("new Money(10L).add(1L) = {}", pounds.toString());

        pounds.add(new Money(1L));
        log.info("new Money(10L).add(1L) = {}", pounds.toString());

        pounds.subtract(2L);
        log.info("new Money(10L).add(1L).subtract(2L) = {}", pounds.toString());

        pounds.subtract(new Money(2L));
        log.info("new Money(10L).add(1L).subtract(2L) = {}", pounds.toString());

        assertTrue(pounds.isMoreThan(7L));
        assertTrue(pounds.isMoreThan(new Money(7L)));
        log.info(pounds.toString());

        assertTrue(pounds.isEqualTo(8L));
        assertTrue(pounds.isEqualTo(new Money(8L)));
        log.info(pounds.toString());

        assertTrue(pounds.isLessThan(9L));
        assertTrue(pounds.isLessThan(new Money(9L)));
        log.info(pounds.toString());
    }

    /**
     * Unit Test to money currency.
     */
    @Test
    public void testPoundsCurrency() {
        log.info("testPoundsCurrency");
        final MoneyInterface pounds = new Pounds();
        assertNotNull(pounds);
        assertTrue(pounds.isEqualTo(0));
        log.info("pounds = {}", pounds.toString());
    }

    /**
     * Unit Test to money long.
     */
    @Test
    public void testPoundsCurrencyLong() {
        log.info("testPoundsCurrencyLong");
        final MoneyInterface pounds = new Pounds(0L);
        assertNotNull(pounds);
        assertTrue(pounds.isEqualTo(0));
        log.info("pounds = {}", pounds.toString());
    }

    /**
     * Unit Test to min value.
     */
    @Test
    public void testMinValue() {
        log.info("testMinValue");
        final MoneyInterface money = new Money(Long.MIN_VALUE);
        assertNotNull(money);
        log.info("money = {}", money.toString());
        assertTrue(money.isEqualTo(Long.MIN_VALUE));
    }

    /**
     * Unit Test to max value.
     */
    @Test
    public void testMaxValue() {
        log.info("testMaxValue");
        final MoneyInterface money = new Money(Long.MAX_VALUE);
        assertNotNull(money);
        log.info("money = {}", money.toString());
        assertTrue(money.isEqualTo(Long.MAX_VALUE));
    }

    /**
     * Unit Test to max pounds.
     */
    @Test
    public void testMaxPounds() {
        log.info("testMaxPounds");
        final MoneyInterface pounds = new Pounds(Long.MAX_VALUE);
        assertNotNull(pounds);
        log.info("pounds = {}", pounds.toString());
        final String actual = pounds.toString();
        assertEquals("£ 9,223,372,036,854,775,807", actual);
    }

}
