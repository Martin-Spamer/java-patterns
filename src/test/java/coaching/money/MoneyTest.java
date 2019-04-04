
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

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test for the Money class.
 */
@Slf4j
public final class MoneyTest {

    /**
     * Unit Test for typical usage of Money class.
     */
    @Test
    public void testMoneyUsage() {
        log.info("testMoneyUsage");

        final Money money = new Money(10L);
        assertNotNull(money);
        log.info("new Money(10L) = {}", money.toString());

        money.add(1L);
        log.info("\t.add(1L) = {}", money.toString());

        money.add(new Money(1L));
        log.info("\t.add(1L) = {}", money.toString());

        money.subtract(2L);
        log.info("\t.subtract(2L) = {}", money.toString());

        money.subtract(new Money(2L));
        log.info("\t.subtract(2L) = {}", money.toString());

        log.info("money = {}", money.toString());

        assertTrue(money.isMoreThan(7L));
        assertTrue(money.isMoreThan(new Money(7L)));

        assertTrue(money.isEqualTo(8L));
        assertTrue(money.isEqualTo(new Money(8L)));

        assertTrue(money.isLessThan(9L));
        assertTrue(money.isLessThan(new Money(9L)));
    }

    /**
     * Unit Test to money currency.
     */
    @Test
    public void testMoneyCurrency() {
        log.info("testMoneyCurrency");
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
        log.info("testMoneyLong");
        final MoneyInterface money = new Money();
        assertNotNull(money);
        assertTrue(money.isEqualTo(0));
    }

    /**
     * Unit Test to money currency long.
     */
    @Test
    public void testMoneyCurrencyLong() {
        log.info("testMoneyCurrencyLong");
        final MoneyInterface money = new Money();
        assertNotNull(money);
        assertTrue(money.isEqualTo(0L));
    }

    /**
     * Unit Test to min value.
     */
    @Test
    public void testMoneyWithMinValueOfLong() {
        log.info("testMoneyWithMinValueOfLong");
        final MoneyInterface money = new Money(Long.MIN_VALUE);
        assertNotNull(money);
        log.info(money.toString());
        assertTrue(money.isEqualTo(Long.MIN_VALUE));
    }

    /**
     * Unit Test to max value.
     */
    @Test
    public void testMoneyWithMaxValueOfLong() {
        log.info("testMoneyWithMaxValueOfLong");
        final MoneyInterface money = new Money(Long.MAX_VALUE);
        assertNotNull(money);
        log.info(money.toString());
        assertTrue(money.isEqualTo(Long.MAX_VALUE));
    }

    /**
     * Unit Test to max pounds.
     */
    @Test
    public void testMaxPounds() {
        log.info("testMaxPounds");
        final Currency gbp = Currency.getInstance("GBP");
        log.info("Currency = {}", gbp.getDisplayName());
        assumeTrue(gbp.getSymbol().equals("£"));

        final MoneyInterface money = new Money(gbp, Long.MAX_VALUE);
        log.info(money.toString());
        assertNotNull(money);
        final String actual = money.toString();
        final String expected = "£ 9,223,372,036,854,775,807";
        assertEquals(expected, actual);
    }

    /**
     * Unit Test to max euro.
     */
    @Test
    public void testMaxEuro() {
        log.info("testMaxEuro");
        final Currency eur = Currency.getInstance("EUR");
        log.info("Currency = {}", eur.getDisplayName());
        assumeTrue(eur.getSymbol().equals("€"));

        final MoneyInterface money = new Money(eur, Long.MAX_VALUE);
        assertNotNull(money);
        log.info(money.toString());
        final String actual = money.toString();
        final String expected = "€ 9,223,372,036,854,775,807";
        assertEquals(expected, actual);
    }

    /**
     * Unit Test to max dollar.
     */
    @Test
    public void testMaxDollar() {
        log.info("testMaxDollar");
        final Currency usd = Currency.getInstance(Locale.US);
        log.info("\tusd.getSymbol = {}", usd.getSymbol());
        log.info("\tusd.getDisplayName = {}", usd.getDisplayName());
        log.info("\tusd.getCurrencyCode = {}", usd.getCurrencyCode());
        assumeTrue(usd.getSymbol().equals("$"));

        final MoneyInterface money = new Money(usd, Long.MAX_VALUE);
        assertNotNull(money);
        log.info(money.toString());
        final String actual = money.toString();
        final String expected = "$ 9,223,372,036,854,775,807";
        assertEquals(expected, actual);
    }

}
