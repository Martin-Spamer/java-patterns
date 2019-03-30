
package coaching.money;

import java.util.Currency;
import java.util.Locale;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import static org.junit.Assume.assumeTrue;

/**
 * Unit tests for the BigDecimalMoney class.
 */
public final class BigDecimalMoneyTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(BigDecimalMoneyTest.class);

    /**
     * Report the details of the default locale.
     */
    @Test
    public void testReportDefaultLocale() {
        LOG.info("testReportDefaultLocale");

        final Locale locale = Locale.getDefault();
        assertNotNull(locale);
        LOG.info("\tLocale = {}", locale);
        LOG.info("\tLocale.getDisplayName() = {}", locale.getDisplayName());

        final Currency currency = Currency.getInstance(locale);
        assertNotNull(currency);
        LOG.info("\tcurrency  = {}", currency.toString());
        LOG.info("\tcurrency.getSymbol()  = {}", currency.getSymbol());
        LOG.info("\tcurrency.getDisplayName() = {}", currency.getDisplayName());
        LOG.info("\tcurrency.getCurrencyCode() = {}", currency.getCurrencyCode());

        final BigDecimalMoney bigDecimalMoney = new BigDecimalMoney(currency);
        assertNotNull(bigDecimalMoney);
        LOG.info("\tbigDecimalMoney = {}", bigDecimalMoney);
    }

    /**
     * Test Report on French locale.
     */
    @Test
    public void testFrenchLocale() {
        LOG.info("testFrenchLocale");

        final Locale locale = Locale.FRANCE;
        assertNotNull(locale);

        LOG.info("\tLocale = {}", locale);
        LOG.info("Locale.getDisplayName() = {}", locale.getDisplayName());

        final Currency currency = Currency.getInstance(locale);
        assertNotNull(currency);
        LOG.info("\tcurrency  = {}", currency.toString());
        LOG.info("\tcurrency.getSymbol()  = {}", currency.getSymbol());
        LOG.info("\tcurrency.getDisplayName() = {}", currency.getDisplayName());
        LOG.info("\tcurrency.getCurrencyCode() = {}", currency.getCurrencyCode());

        final BigDecimalMoney bigDecimalMoney = new BigDecimalMoney(currency);
        assertNotNull(bigDecimalMoney);
        LOG.info("\tbigDecimalMoney = {}", bigDecimalMoney);
    }

    /**
     * Test Report on UK locale.
     */
    @Test
    public void testUkLocale() {
        LOG.info("testUkLocale");

        final Locale locale = Locale.UK;
        assertNotNull(locale);
        LOG.info("\tLocale = {}", locale);
        LOG.info("\tLocale.getDisplayName = {}", locale.getDisplayName());

        final Currency currency = Currency.getInstance(locale);
        LOG.info("\tcurrency  = {}", currency.toString());
        LOG.info("\tcurrency.getSymbol()  = {}", currency.getSymbol());
        LOG.info("\tcurrency.getDisplayName() = {}", currency.getDisplayName());
        LOG.info("\tcurrency.getCurrencyCode() = {}", currency.getCurrencyCode());

        final BigDecimalMoney bigDecimalMoney = new BigDecimalMoney(currency);
        assertNotNull(bigDecimalMoney);
        LOG.info("\tbigDecimalMoney = {}", bigDecimalMoney);
    }

    /**
     * Test Report on US locale.
     */
    @Test
    public void testUsLocale() {
        LOG.info("testUsLocale");

        final Locale locale = Locale.US;
        assertNotNull(locale);
        LOG.info("\tLocale = {}", locale);
        LOG.info("\tLocale.getDisplayName = {}", locale.getDisplayName());

        final Currency currency = Currency.getInstance(locale);
        LOG.info("\tcurrency  = {}", currency.toString());
        LOG.info("\tcurrency.getSymbol()  = {}", currency.getSymbol());
        LOG.info("\tcurrency.getDisplayName() = {}", currency.getDisplayName());
        LOG.info("\tcurrency.getCurrencyCode() = {}", currency.getCurrencyCode());

        final BigDecimalMoney bigDecimalMoney = new BigDecimalMoney(currency);
        assertNotNull(bigDecimalMoney);
        LOG.info("\tbigDecimalMoney = {}", bigDecimalMoney);
    }

    /**
     * Test Report on Japan locale.
     */
    @Test
    public void testJapanLocale() {
        LOG.info("testJapanLocale");

        final Locale locale = Locale.JAPAN;
        assertNotNull(locale);
        LOG.info("\tLocale = {}", locale);
        LOG.info("\tLocale.getDisplayName = {}", locale.getDisplayName());

        final Currency currency = Currency.getInstance(locale);
        LOG.info("\tcurrency  = {}", currency.toString());
        LOG.info("\tcurrency.getSymbol()  = {}", currency.getSymbol());
        LOG.info("\tcurrency.getDisplayName() = {}", currency.getDisplayName());
        LOG.info("\tcurrency.getCurrencyCode() = {}", currency.getCurrencyCode());

        final BigDecimalMoney bigDecimalMoney = new BigDecimalMoney(currency);
        assertNotNull(bigDecimalMoney);
        LOG.info("\tbigDecimalMoney = {}", bigDecimalMoney);
    }

    /**
     * Test Report on English locale.
     */
    @Test
    public void testCanadaLocale() {
        LOG.info("testCanadaLocale");

        final Locale locale = Locale.CANADA;
        assertNotNull(locale);
        LOG.info("\tLocale = {}", locale);
        LOG.info("\tLocale.getDisplayName = {}", locale.getDisplayName());

        final Currency currency = Currency.getInstance(locale);
        LOG.info("\tcurrency  = {}", currency.toString());
        LOG.info("\tcurrency.getSymbol()  = {}", currency.getSymbol());
        LOG.info("\tcurrency.getDisplayName() = {}", currency.getDisplayName());
        LOG.info("\tcurrency.getCurrencyCode() = {}", currency.getCurrencyCode());

        final BigDecimalMoney bigDecimalMoney = new BigDecimalMoney(currency);
        assertNotNull(bigDecimalMoney);
        LOG.info("\tbigDecimalMoney = {}", bigDecimalMoney);
    }

    /**
     * Test BigDecimalMoney.
     */
    @Test
    public void testBigDecimalMoney() {
        LOG.info("testBigDecimalMoney");
        final Locale defaultLocale = Locale.getDefault();
        final Currency defaultCurrency = Currency.getInstance(defaultLocale);
        final String currencySymbol = defaultCurrency.getSymbol();
        assumeTrue(currencySymbol.equals("£"));

        final BigDecimalMoney money = new BigDecimalMoney();
        assertNotNull(money);
        final Currency currency = money.getCurrency();
        assertNotNull(currency);
        assertEquals(currencySymbol + "0.00", money.toString());
        LOG.info("\tmoney = {}", money);

        final BigDecimalMoney money0 = new BigDecimalMoney();
        assertNotNull(money);
        assertEquals(currencySymbol + "0.00", money0.toString());
        LOG.info("\tmoney = {}", money0);

        final BigDecimalMoney money1 = new BigDecimalMoney("1.00");
        assertNotNull(money);
        assertEquals(currencySymbol + "1.00", money1.toString());
        LOG.info("\tmoney = {}", money1);

        final BigDecimalMoney moneyStr99 = new BigDecimalMoney("99.99");
        assertNotNull(money);
        assertEquals(currencySymbol + "99.99", moneyStr99.toString());
        LOG.info("\tmoney = {}", moneyStr99);

        final BigDecimalMoney moneyStr100 = new BigDecimalMoney("100.00");
        assertNotNull(money);
        assertEquals(currencySymbol + "100.00", moneyStr100.toString());
        LOG.info("\tmoney = {}", moneyStr100);
    }

    /**
     * Test addition.
     */
    @Test
    public void testAddition() {
        LOG.info("testAddition");
        final BigDecimalMoney total = new BigDecimalMoney(0);
        assertNotNull(total);
        LOG.info("\tmoney = {}", total.toString());

        final BigDecimalMoney number1 = new BigDecimalMoney(1);
        assertNotNull(number1);
        LOG.info("\tnumber1 = {}", number1.toString());
        total.add(number1);
        LOG.info("\ttotal + number1 = {}", total.toString());

        final BigDecimalMoney number2 = new BigDecimalMoney("2");
        assertNotNull(number2);
        LOG.info("\tnumber2 = {}", number2.toString());
        total.add(number2);
        LOG.info("\ttotal + number2 = {}", total.toString());

        final BigDecimalMoney number3 = new BigDecimalMoney(3);
        assertNotNull(number3);
        LOG.info("\tnumber3 = {}", number3.toString());
        total.add(number3);
        LOG.info("\ttotal + number3 = {}", total.toString());

        final BigDecimalMoney number4 = new BigDecimalMoney("4.0");
        assertNotNull(number4);
        LOG.info("\tnumber4 = {}", number4.toString());
        total.add(number4);
        LOG.info("\ttotal+number4 = {}", total.toString());

        BigDecimalMoney balance = new BigDecimalMoney("1234567.89");
        assertNotNull(balance);

        BigDecimalMoney transaction = new BigDecimalMoney("9876543.21");
        assertNotNull(transaction);

        BigDecimalMoney newBalance = balance.add(transaction);
        assertNotNull(newBalance);
        LOG.info(newBalance.toString());

        balance = new BigDecimalMoney("1115.37");
        transaction = new BigDecimalMoney("115.37");
        newBalance = balance.subtract(transaction);

        LOG.info(newBalance.toString());
    }

}
