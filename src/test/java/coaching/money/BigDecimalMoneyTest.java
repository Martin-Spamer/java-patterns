
package coaching.money;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;
import org.slf4j.*;

/**
 * Money Locale Test Class.
 */
public class BigDecimalMoneyTest {

	private static final Logger LOG = LoggerFactory.getLogger(BigDecimalMoneyTest.class);

	/**
	 * Test using the default locale.
	 */
	@Test
	public void testDefaultLocale() {
		LOG.info("testDefaultLocale");
		final Locale defaultLocale = Locale.getDefault();
		assertNotNull("Value cannot be null", defaultLocale);
		LOG.info("defaultLocale = {}", defaultLocale);
		LOG.info("defaultLocale = {}", defaultLocale.getDisplayName());
		final Currency currency = Currency.getInstance(defaultLocale);
		assertNotNull("Value cannot be null", new BigDecimalMoney(currency));
	}

	/**
	 * Test French locale.
	 */
	@Test
	public void testFrenchLocale() {
		LOG.info("testFrenchLocale");
		final Locale frenchLocale = Locale.FRANCE;
		assertNotNull("Value cannot be null", frenchLocale);
		LOG.info("frenchLocale = {}", frenchLocale);
		LOG.info("frenchLocale = {}", frenchLocale.getDisplayName());
		final Currency currency = Currency.getInstance(frenchLocale);
		assertNotNull("Value cannot be null", new BigDecimalMoney(currency));
	}

	/**
	 * Test UK locale.
	 */
	@Test
	public void testUkLocale() {
		LOG.info("testUkLocale");
		final Locale ukLocale = Locale.UK;
		assertNotNull("Value cannot be null", ukLocale);
		LOG.info("ukLocale = {}", ukLocale);
		LOG.info("ukLocale = {}", ukLocale.getDisplayName());
		final Currency currency = Currency.getInstance(ukLocale);
		assertNotNull("Value cannot be null", new BigDecimalMoney(currency));
	}

	/**
	 * Test BigDecimalMoney.
	 */
	@Test
	public void testBigDecimalMoney() {
		LOG.info("testMoney");
		final BigDecimalMoney money = new BigDecimalMoney();
		assertNotNull("Value cannot be null", money);
		final Currency currency = money.getCurrency();
		assertNotNull("Value cannot be null", currency);
		assertEquals("£0.00", money.toString());
		LOG.info("{}", money);

		final BigDecimalMoney money0 = new BigDecimalMoney();
		assertNotNull("Value cannot be null", money);
		assertEquals("£0.00", money0.toString());
		LOG.info("{}", money0);

		final BigDecimalMoney money1 = new BigDecimalMoney("1.00");
		assertNotNull("Value cannot be null", money);
		assertEquals("£1.00", money1.toString());
		LOG.info("{}", money1);

		final BigDecimalMoney moneyStr99 = new BigDecimalMoney("99.99");
		assertNotNull("Value cannot be null", money);
		assertEquals("£99.99", moneyStr99.toString());
		LOG.info("{}", moneyStr99);

		final BigDecimalMoney moneyStr100 = new BigDecimalMoney("100.00");
		assertNotNull("Value cannot be null", money);
		assertEquals("£100.00", moneyStr100.toString());
		LOG.info("{}", moneyStr100);
	}

	/**
	 * Test addition.
	 */
	@Test
	public void testAddition() {
		LOG.info("testAddition");
		final BigDecimalMoney total = new BigDecimalMoney(0);
		assertNotNull("Value cannot be null", total);
		LOG.info("{}", "money=" + total.toString());

		final BigDecimalMoney number1 = new BigDecimalMoney(1);
		assertNotNull("Value cannot be null", number1);
		LOG.info("{}", "number1 = " + number1.toString());
		total.add(number1);
		LOG.info("{}", "total + number1 = " + total.toString());

		final BigDecimalMoney number2 = new BigDecimalMoney("2");
		assertNotNull("Value cannot be null", number2);
		LOG.info("{}", "number2 = " + number2.toString());
		total.add(number2);
		LOG.info("{}", "total + number2=" + total.toString());

		final BigDecimalMoney number3 = new BigDecimalMoney(3);
		assertNotNull("Value cannot be null", number3);
		LOG.info("{}", "number3 = " + number3.toString());
		total.add(number3);
		LOG.info("{}", "total+number3 = " + total.toString());

		final BigDecimalMoney number4 = new BigDecimalMoney("4.0");
		assertNotNull("Value cannot be null", number4);
		LOG.info("{}", "number4 = " + number4.toString());
		total.add(number4);
		LOG.info("{}", "total+number4 = " + total.toString());

		BigDecimalMoney balance = new BigDecimalMoney("1234567.89");
		assertNotNull("Value cannot be null", balance);

		BigDecimalMoney transaction = new BigDecimalMoney("9876543.21");
		assertNotNull("Value cannot be null", transaction);

		BigDecimalMoney newBalance = balance.add(transaction);
		assertNotNull("Value cannot be null", newBalance);
		LOG.info(newBalance.toString());

		balance = new BigDecimalMoney("1115.37");
		transaction = new BigDecimalMoney("115.37");
		newBalance = balance.subtract(transaction);

		LOG.info(newBalance.toString());
	}

}
