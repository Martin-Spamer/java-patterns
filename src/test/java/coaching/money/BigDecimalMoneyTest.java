
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
 * Money Locale Test class.
 */
public class BigDecimalMoneyTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(BigDecimalMoneyTest.class);

    /**
     * Test using the default locale.
     */
    @Test
    public void testDefaultLocale() {
        LOG.info("testDefaultLocale");

        final Locale defaultLocale = Locale.getDefault();
        assertNotNull(defaultLocale);
        LOG.info("defaultLocale = {}", defaultLocale);
        LOG.info("defaultLocale = {}", defaultLocale.getDisplayName());

        final Currency currency = Currency.getInstance(defaultLocale);
        assertNotNull(currency);
        LOG.info("currency  = {}", currency);
        LOG.info("currency  = {}", currency.getDisplayName());
        LOG.info("currency  = {}", currency.getCurrencyCode());
        LOG.info("currency  = {}", currency.getSymbol());

        BigDecimalMoney bigDecimalMoney = new BigDecimalMoney(currency);
        assertNotNull(bigDecimalMoney);
        LOG.info("bigDecimalMoney = {}", bigDecimalMoney);
    }

    /**
     * Test French locale.
     */
    @Test
    public void testFrenchLocale() {
        LOG.info("testFrenchLocale");

        final Locale frenchLocale = Locale.FRANCE;
        assertNotNull(frenchLocale);
        LOG.info("frenchLocale = {}", frenchLocale);
        LOG.info("frenchLocale = {}", frenchLocale.getDisplayName());

        final Currency currency = Currency.getInstance(frenchLocale);
        assertNotNull(currency);
        LOG.info("currency  = {}", currency);
        LOG.info("currency  = {}", currency.getDisplayName());
        LOG.info("currency  = {}", currency.getCurrencyCode());
        LOG.info("currency  = {}", currency.getSymbol());

        BigDecimalMoney bigDecimalMoney = new BigDecimalMoney(currency);
        assertNotNull(bigDecimalMoney);
        LOG.info("bigDecimalMoney = {}", bigDecimalMoney);
    }

    /**
     * Test UK locale.
     */
    @Test
    public void testUkLocale() {
        LOG.info("testUkLocale");

        final Locale ukLocale = Locale.UK;
        assertNotNull(ukLocale);
        LOG.info("ukLocale = {}", ukLocale);
        LOG.info("ukLocale.getDisplayName = {}", ukLocale.getDisplayName());

        final Currency currency = Currency.getInstance(ukLocale);
        LOG.info("currency  = {}", currency);
        LOG.info("currency  = {}", currency.getDisplayName());
        LOG.info("currency  = {}", currency.getCurrencyCode());
        LOG.info("currency  = {}", currency.getSymbol());

        BigDecimalMoney bigDecimalMoney = new BigDecimalMoney(currency);
        assertNotNull(bigDecimalMoney);
        LOG.info("bigDecimalMoney = {}", bigDecimalMoney);
    }

    /**
     * Test BigDecimalMoney.
     */
    @Test
    public void testBigDecimalMoney() {
        LOG.info("testBigDecimalMoney");
        Locale defaultLocale = Locale.getDefault();
        Currency defaultCurrency = Currency.getInstance(defaultLocale);
        String currencySymbol = defaultCurrency.getSymbol();
        assumeTrue(currencySymbol.equals("£"));

        final BigDecimalMoney money = new BigDecimalMoney();
        assertNotNull(money);
        final Currency currency = money.getCurrency();
        assertNotNull(currency);
        assertEquals(currencySymbol + "0.00", money.toString());
        LOG.info("money = {}", money);

        final BigDecimalMoney money0 = new BigDecimalMoney();
        assertNotNull(money);
        assertEquals(currencySymbol + "0.00", money0.toString());
        LOG.info("money = {}", money0);

        final BigDecimalMoney money1 = new BigDecimalMoney("1.00");
        assertNotNull(money);
        assertEquals(currencySymbol + "1.00", money1.toString());
        LOG.info("money = {}", money1);

        final BigDecimalMoney moneyStr99 = new BigDecimalMoney("99.99");
        assertNotNull(money);
        assertEquals(currencySymbol + "99.99", moneyStr99.toString());
        LOG.info("money = {}", moneyStr99);

        final BigDecimalMoney moneyStr100 = new BigDecimalMoney("100.00");
        assertNotNull(money);
        assertEquals(currencySymbol + "100.00", moneyStr100.toString());
        LOG.info("money = {}", moneyStr100);
    }

    /**
     * Test addition.
     */
    @Test
    public void testAddition() {
        LOG.info("testAddition");
        final BigDecimalMoney total = new BigDecimalMoney(0);
        assertNotNull(total);
        LOG.info("money = {}", total.toString());

        final BigDecimalMoney number1 = new BigDecimalMoney(1);
        assertNotNull(number1);
        LOG.info("number1 = {}", number1.toString());
        total.add(number1);
        LOG.info("total + number1 = {}", total.toString());

        final BigDecimalMoney number2 = new BigDecimalMoney("2");
        assertNotNull(number2);
        LOG.info("number2 = {}", number2.toString());
        total.add(number2);
        LOG.info("total + number2 = {}", total.toString());

        final BigDecimalMoney number3 = new BigDecimalMoney(3);
        assertNotNull(number3);
        LOG.info("number3 = {}", number3.toString());
        total.add(number3);
        LOG.info("total + number3 = {}", total.toString());

        final BigDecimalMoney number4 = new BigDecimalMoney("4.0");
        assertNotNull(number4);
        LOG.info("number4 = {}", number4.toString());
        total.add(number4);
        LOG.info("total+number4 = {}", total.toString());

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
