
package coaching.money;

import java.util.Currency;
import java.util.Locale;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import static org.junit.Assume.assumeTrue;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests for the BigDecimalMoney class.
 */


@Slf4j
public final class BigDecimalMoneyTest {

    /**
     * Report the details of the default locale.
     */
    @Test
    public void testReportDefaultLocale() {
        log.info("testReportDefaultLocale");

        final Locale locale = Locale.getDefault();
        assertNotNull(locale);
        log.info("\tLocale = {}", locale);
        log.info("\tLocale.getDisplayName() = {}", locale.getDisplayName());

        final Currency currency = Currency.getInstance(locale);
        assertNotNull(currency);
        log.info("\tcurrency  = {}", currency.toString());
        log.info("\tcurrency.getSymbol()  = {}", currency.getSymbol());
        log.info("\tcurrency.getDisplayName() = {}", currency.getDisplayName());
        log.info("\tcurrency.getCurrencyCode() = {}", currency.getCurrencyCode());

        final BigDecimalMoney bigDecimalMoney = new BigDecimalMoney(currency);
        assertNotNull(bigDecimalMoney);
        log.info("\tbigDecimalMoney = {}", bigDecimalMoney);
    }

    /**
     * Test Report on French locale.
     */
    @Test
    public void testFrenchLocale() {
        log.info("testFrenchLocale");

        final Locale locale = Locale.FRANCE;
        assertNotNull(locale);

        log.info("\tLocale = {}", locale);
        log.info("Locale.getDisplayName() = {}", locale.getDisplayName());

        final Currency currency = Currency.getInstance(locale);
        assertNotNull(currency);
        log.info("\tcurrency  = {}", currency.toString());
        log.info("\tcurrency.getSymbol()  = {}", currency.getSymbol());
        log.info("\tcurrency.getDisplayName() = {}", currency.getDisplayName());
        log.info("\tcurrency.getCurrencyCode() = {}", currency.getCurrencyCode());

        final BigDecimalMoney bigDecimalMoney = new BigDecimalMoney(currency);
        assertNotNull(bigDecimalMoney);
        log.info("\tbigDecimalMoney = {}", bigDecimalMoney);
    }

    /**
     * Test Report on UK locale.
     */
    @Test
    public void testUkLocale() {
        log.info("testUkLocale");

        final Locale locale = Locale.UK;
        assertNotNull(locale);
        log.info("\tLocale = {}", locale);
        log.info("\tLocale.getDisplayName = {}", locale.getDisplayName());

        final Currency currency = Currency.getInstance(locale);
        log.info("\tcurrency  = {}", currency.toString());
        log.info("\tcurrency.getSymbol()  = {}", currency.getSymbol());
        log.info("\tcurrency.getDisplayName() = {}", currency.getDisplayName());
        log.info("\tcurrency.getCurrencyCode() = {}", currency.getCurrencyCode());

        final BigDecimalMoney bigDecimalMoney = new BigDecimalMoney(currency);
        assertNotNull(bigDecimalMoney);
        log.info("\tbigDecimalMoney = {}", bigDecimalMoney);
    }

    /**
     * Test Report on US locale.
     */
    @Test
    public void testUsLocale() {
        log.info("testUsLocale");

        final Locale locale = Locale.US;
        assertNotNull(locale);
        log.info("\tLocale = {}", locale);
        log.info("\tLocale.getDisplayName = {}", locale.getDisplayName());

        final Currency currency = Currency.getInstance(locale);
        log.info("\tcurrency  = {}", currency.toString());
        log.info("\tcurrency.getSymbol()  = {}", currency.getSymbol());
        log.info("\tcurrency.getDisplayName() = {}", currency.getDisplayName());
        log.info("\tcurrency.getCurrencyCode() = {}", currency.getCurrencyCode());

        final BigDecimalMoney bigDecimalMoney = new BigDecimalMoney(currency);
        assertNotNull(bigDecimalMoney);
        log.info("\tbigDecimalMoney = {}", bigDecimalMoney);
    }

    /**
     * Test Report on Japan locale.
     */
    @Test
    public void testJapanLocale() {
        log.info("testJapanLocale");

        final Locale locale = Locale.JAPAN;
        assertNotNull(locale);
        log.info("\tLocale = {}", locale);
        log.info("\tLocale.getDisplayName = {}", locale.getDisplayName());

        final Currency currency = Currency.getInstance(locale);
        log.info("\tcurrency  = {}", currency.toString());
        log.info("\tcurrency.getSymbol()  = {}", currency.getSymbol());
        log.info("\tcurrency.getDisplayName() = {}", currency.getDisplayName());
        log.info("\tcurrency.getCurrencyCode() = {}", currency.getCurrencyCode());

        final BigDecimalMoney bigDecimalMoney = new BigDecimalMoney(currency);
        assertNotNull(bigDecimalMoney);
        log.info("\tbigDecimalMoney = {}", bigDecimalMoney);
    }

    /**
     * Test Report on English locale.
     */
    @Test
    public void testCanadaLocale() {
        log.info("testCanadaLocale");

        final Locale locale = Locale.CANADA;
        assertNotNull(locale);
        log.info("\tLocale = {}", locale);
        log.info("\tLocale.getDisplayName = {}", locale.getDisplayName());

        final Currency currency = Currency.getInstance(locale);
        log.info("\tcurrency  = {}", currency.toString());
        log.info("\tcurrency.getSymbol()  = {}", currency.getSymbol());
        log.info("\tcurrency.getDisplayName() = {}", currency.getDisplayName());
        log.info("\tcurrency.getCurrencyCode() = {}", currency.getCurrencyCode());

        final BigDecimalMoney bigDecimalMoney = new BigDecimalMoney(currency);
        assertNotNull(bigDecimalMoney);
        log.info("\tbigDecimalMoney = {}", bigDecimalMoney);
    }

    /**
     * Test BigDecimalMoney.
     */
    @Test
    public void testBigDecimalMoney() {
        log.info("testBigDecimalMoney");
        final Locale defaultLocale = Locale.getDefault();
        final Currency defaultCurrency = Currency.getInstance(defaultLocale);
        final String currencySymbol = defaultCurrency.getSymbol();
        assumeTrue(currencySymbol.equals("£"));

        final BigDecimalMoney money = new BigDecimalMoney();
        assertNotNull(money);
        final Currency currency = money.getCurrency();
        assertNotNull(currency);
        assertEquals(currencySymbol + "0.00", money.toString());
        log.info("\tmoney = {}", money);

        final BigDecimalMoney money0 = new BigDecimalMoney();
        assertNotNull(money);
        assertEquals(currencySymbol + "0.00", money0.toString());
        log.info("\tmoney = {}", money0);

        final BigDecimalMoney money1 = new BigDecimalMoney("1.00");
        assertNotNull(money);
        assertEquals(currencySymbol + "1.00", money1.toString());
        log.info("\tmoney = {}", money1);

        final BigDecimalMoney moneyStr99 = new BigDecimalMoney("99.99");
        assertNotNull(money);
        assertEquals(currencySymbol + "99.99", moneyStr99.toString());
        log.info("\tmoney = {}", moneyStr99);

        final BigDecimalMoney moneyStr100 = new BigDecimalMoney("100.00");
        assertNotNull(money);
        assertEquals(currencySymbol + "100.00", moneyStr100.toString());
        log.info("\tmoney = {}", moneyStr100);
    }

    /**
     * Test addition.
     */
    @Test
    public void testAddition() {
        log.info("testAddition");
        final BigDecimalMoney total = new BigDecimalMoney(0);
        assertNotNull(total);
        log.info("\tmoney = {}", total.toString());

        final BigDecimalMoney number1 = new BigDecimalMoney(1);
        assertNotNull(number1);
        log.info("\tnumber1 = {}", number1.toString());
        total.add(number1);
        log.info("\ttotal + number1 = {}", total.toString());

        final BigDecimalMoney number2 = new BigDecimalMoney("2");
        assertNotNull(number2);
        log.info("\tnumber2 = {}", number2.toString());
        total.add(number2);
        log.info("\ttotal + number2 = {}", total.toString());

        final BigDecimalMoney number3 = new BigDecimalMoney(3);
        assertNotNull(number3);
        log.info("\tnumber3 = {}", number3.toString());
        total.add(number3);
        log.info("\ttotal + number3 = {}", total.toString());

        final BigDecimalMoney number4 = new BigDecimalMoney("4.0");
        assertNotNull(number4);
        log.info("\tnumber4 = {}", number4.toString());
        total.add(number4);
        log.info("\ttotal+number4 = {}", total.toString());

        BigDecimalMoney balance = new BigDecimalMoney("1234567.89");
        assertNotNull(balance);

        BigDecimalMoney transaction = new BigDecimalMoney("9876543.21");
        assertNotNull(transaction);

        BigDecimalMoney newBalance = balance.add(transaction);
        assertNotNull(newBalance);
        log.info(newBalance.toString());

        balance = new BigDecimalMoney("1115.37");
        transaction = new BigDecimalMoney("115.37");
        newBalance = balance.subtract(transaction);

        log.info(newBalance.toString());
    }

}
