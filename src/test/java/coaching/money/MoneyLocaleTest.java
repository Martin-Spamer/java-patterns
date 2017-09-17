package coaching.money;

import static org.junit.Assert.*;

import java.util.Locale;

import org.junit.Test;
import org.slf4j.*;

/**
 * Money Locale Test Class.
 */
public class MoneyLocaleTest {

	private static final Logger LOG = LoggerFactory.getLogger(MoneyLocaleTest.class);

	/**
	 * Test default locale.
	 */
	@Test
	public void testDefaultLocale() {
		LOG.info("testDefaultLocale");
		// Get default locale
		final Locale defaultLocale = Locale.getDefault();
		assertNotNull(defaultLocale);
		LOG.info("{}", defaultLocale.getDisplayName());
	}

	/**
	 * Test french locale.
	 */
	@Test
	public void testFrenchLocale() {
		LOG.info("testFrenchLocale");
		// * default locale to pre-defined FRENCH locale.
		final Locale frenchLocale = Locale.FRENCH;
		assertNotNull(frenchLocale);
		LOG.info("frenchLocale = {}", frenchLocale);
		LOG.info("frenchLocale = {}", frenchLocale.getDisplayName());
	}

	/**
	 * Test uk locale.
	 */
	@Test
	public void testUkLocale() {
		LOG.info("testUkLocale");
		// * default locale to pre-defined UK locale.
		final Locale ukLocale = Locale.UK;
		assertNotNull(ukLocale);
		LOG.info("ukLocale = {}", ukLocale);
		LOG.info("ukLocale = {}", ukLocale.getDisplayName());
	}

	/**
	 * Test money.
	 */
	@Test
	public void testMoney() {
		LOG.info("testMoney");
		final BigDecimalMoney instance = new BigDecimalMoney();
		assertEquals("£0.00", instance.toString());
		LOG.info("{}", instance);

		final BigDecimalMoney money0 = new BigDecimalMoney();
		assertEquals("£0.00", money0.toString());
		LOG.info("{}", money0);

		final BigDecimalMoney money1 = new BigDecimalMoney("1.00");
		assertEquals("£1.00", money1.toString());
		LOG.info("{}", money1);

		final BigDecimalMoney moneyStr99 = new BigDecimalMoney("99.99");
		assertEquals("£99.99", moneyStr99.toString());
		LOG.info("{}", moneyStr99);

		final BigDecimalMoney moneyStr100 = new BigDecimalMoney("100.00");
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
		LOG.info("{}", "total=" + total.toString());

		final BigDecimalMoney number1 = new BigDecimalMoney(1);
		LOG.info("{}", "number1 = " + number1.toString());
		total.add(number1);
		LOG.info("{}", "total + number1 = " + total.toString());

		final BigDecimalMoney number2 = new BigDecimalMoney("2");
		LOG.info("{}", "number2 = " + number2.toString());
		total.add(number2);
		LOG.info("{}", "total+number2=" + total.toString());

		final BigDecimalMoney number3 = new BigDecimalMoney(3);
		LOG.info("{}", "number3 = " + number3.toString());
		total.add(number3);
		LOG.info("{}", "total+number3 = " + total.toString());

		final BigDecimalMoney number4 = new BigDecimalMoney("4.0");
		LOG.info("{}", "number4 = " + number4.toString());
		total.add(number4);
		LOG.info("{}", "total+number4 = " + total.toString());

		BigDecimalMoney balance = new BigDecimalMoney("1234567.89");
		BigDecimalMoney transaction = new BigDecimalMoney("9876543.21");
		BigDecimalMoney newBalance = balance.add(transaction);
		LOG.info(newBalance.toString());

		balance = new BigDecimalMoney("1115.37");
		transaction = new BigDecimalMoney("115.37");
		newBalance = balance.subtract(transaction);
		LOG.info(newBalance.toString());
	}

}
