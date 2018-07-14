
package coaching.money;

import java.util.Currency;
import java.util.Locale;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import static org.junit.Assume.assumeTrue;

/**
 * Unit test for the Money class.
 */
public final class MoneyTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(MoneyTest.class);

    /**
     * Unit Test for typical usage of Money class.
     */
    @Test
    public void testMoneyUsage() {
        LOG.info("testMoneyUsage");

        final Money money = new Money(10L);
        assertNotNull(money);
        LOG.info("new Money(10L) = {}", money.toString());

        money.add(1L);
        LOG.info(".add(1L) = {}", money.toString());

        money.add(new Money(1L));
        LOG.info(".add(1L) = {}", money.toString());

        money.subtract(2L);
        LOG.info(".subtract(2L) = {}", money.toString());

        money.subtract(new Money(2L));
        LOG.info(".subtract(2L) = {}", money.toString());

        assertTrue(money.isMoreThan(7L));
        assertTrue(money.isMoreThan(new Money(7L)));
        LOG.info("money = {}", money.toString());

        assertTrue(money.isEqualTo(8L));
        assertTrue(money.isEqualTo(new Money(8L)));
        LOG.info("money = {}", money.toString());

        assertTrue(money.isLessThan(9L));
        assertTrue(money.isLessThan(new Money(9L)));
        LOG.info("money = {}", money.toString());
    }

    /**
     * Unit Test to money currency.
     */
    @Test
    public void testMoneyCurrency() {
        LOG.info("testMoneyCurrency");
        final Locale locale = Locale.getDefault();
        final Currency currency = Currency.getInstance(locale);
        final MoneyInterface money = new Money(currency);
        assertNotNull(money);
        assertTrue(money.isEqualTo(0));
        final Currency actualCurrency = money.getCurrency();
        assertNotNull(actualCurrency);
    }

    /**
     * Unit Test to money long.
     */
    @Test
    public void testMoneyLong() {
        LOG.info("testMoneyLong");
        final MoneyInterface money = new Money();
        assertNotNull(money);
        assertTrue(money.isEqualTo(0));
    }

    /**
     * Unit Test to money currency long.
     */
    @Test
    public void testMoneyCurrencyLong() {
        LOG.info("testMoneyCurrencyLong");
        final MoneyInterface money = new Money();
        assertNotNull(money);
        assertTrue(money.isEqualTo(0L));
    }

    /**
     * Unit Test to min value.
     */
    @Test
    public void testMoneyWithMinValueOfLong() {
        LOG.info("testMoneyWithMinValueOfLong");
        final MoneyInterface money = new Money(Long.MIN_VALUE);
        assertNotNull(money);
        LOG.info(money.toString());
        assertTrue(money.isEqualTo(Long.MIN_VALUE));
    }

    /**
     * Unit Test to max value.
     */
    @Test
    public void testMoneyWithMaxValueOfLong() {
        LOG.info("testMoneyWithMaxValueOfLong");
        final MoneyInterface money = new Money(Long.MAX_VALUE);
        assertNotNull(money);
        LOG.info(money.toString());
        assertTrue(money.isEqualTo(Long.MAX_VALUE));
    }

    /**
     * Unit Test to max pounds.
     */
    @Test
    public void testMaxPounds() {
        LOG.info("testMaxPounds");
        final Currency gbp = Currency.getInstance("GBP");
        LOG.info("Currency = {}", gbp.getDisplayName());
        assumeTrue(gbp.getSymbol().equals("£"));

        final MoneyInterface money = new Money(gbp, Long.MAX_VALUE);
        LOG.info(money.toString());
        assertNotNull(money);
        final String actual = money.toString();
        String expected = "£ 9,223,372,036,854,775,807";
        assertEquals(expected, actual);
    }

    /**
     * Unit Test to max euro.
     */
    @Test
    public void testMaxEuro() {
        LOG.info("testMaxEuro");
        final Currency eur = Currency.getInstance("EUR");
        LOG.info("Currency = {}", eur.getDisplayName());
        assumeTrue(eur.getSymbol().equals("€"));

        final MoneyInterface money = new Money(eur, Long.MAX_VALUE);
        assertNotNull(money);
        LOG.info(money.toString());
        final String actual = money.toString();
        String expected = "€ 9,223,372,036,854,775,807";
        assertEquals(expected, actual);
    }

    /**
     * Unit Test to max dollar.
     */
    @Test
    public void testMaxDollar() {
        LOG.info("testMaxDollar");
        final Currency usd = Currency.getInstance(Locale.US);
        LOG.info("usd.getSymbol = {}", usd.getSymbol());
        LOG.info("usd.getDisplayName = {}", usd.getDisplayName());
        LOG.info("usd.getCurrencyCode = {}", usd.getCurrencyCode());
        assumeTrue(usd.getSymbol().equals("$"));

        final MoneyInterface money = new Money(usd, Long.MAX_VALUE);
        assertNotNull(money);
        LOG.info(money.toString());
        final String actual = money.toString();
        String expected = "$ 9,223,372,036,854,775,807";
        assertEquals(expected, actual);
    }

}
