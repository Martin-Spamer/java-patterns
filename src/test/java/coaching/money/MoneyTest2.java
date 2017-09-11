
package coaching.money;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Locale;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MoneyTest Class.
 */
public class MoneyTest2 {

	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(MoneyTest2.class);

	/**
	 * Test default locale.
	 */
	@Test
	public void testDefaultLocale() {
		// Get default locale
		final Locale locale = Locale.getDefault();
		log.info("{}", locale.getDisplayName());
	}

	/**
	 * Test french locale.
	 */
	@Test
	public void testFrenchLocale() {
		// * default locale to pre-defined FRENCH locale.
		final Locale newLocale = Locale.FRENCH;
		log.info("{}", newLocale);
		log.info("{}", newLocale.getDisplayName());
	}

	/**
	 * Test uk locale.
	 */
	@Test
	public void testUkLocale() {
		// * default locale to pre-defined UK locale.
		final Locale newLocale = Locale.UK;
		log.info("{}", newLocale.getDisplayName());
	}

	/**
	 * Test money.
	 */
	@Test
	public void testMoney() {
		final BigDecimalMoney instance = new BigDecimalMoney();
		assertEquals("£0.00", instance.toString());
		log.info("{}", instance);

		final BigDecimalMoney money0 = new BigDecimalMoney();
		assertEquals("£0.00", money0.toString());
		log.info("{}", money0);

		final BigDecimalMoney money1 = new BigDecimalMoney(new BigDecimal(1.00));
		assertEquals("£1.00", money1.toString());
		log.info("{}", money1);

		final BigDecimalMoney moneyStr99 = new BigDecimalMoney("99.99");
		assertEquals("£99.99", moneyStr99.toString());
		log.info("{}", moneyStr99);

		final BigDecimalMoney moneyStr100 = new BigDecimalMoney("100.00");
		assertEquals("£100.00", moneyStr100.toString());
		log.info("{}", moneyStr100);
	}

	/**
	 * Test addition.
	 */
	@Test
	public void testAddition() {
		final BigDecimalMoney total = new BigDecimalMoney(0);
		log.info("{}", "total=" + total.toString());

		final BigDecimalMoney number1 = new BigDecimalMoney(1);
		log.info("{}", "number1 = " + number1.toString());
		total.add(number1);
		log.info("{}", "total + number1 = " + total.toString());

		final BigDecimalMoney number2 = new BigDecimalMoney("2");
		log.info("{}", "number2 = " + number2.toString());
		total.add(number2);
		log.info("{}", "total+number2=" + total.toString());

		final BigDecimalMoney number3 = new BigDecimalMoney(3);
		log.info("{}", "number3 = " + number3.toString());
		total.add(number3);
		log.info("{}", "total+number3 = " + total.toString());

		final BigDecimalMoney number4 = new BigDecimalMoney("4.0");
		log.info("{}", "number4 = " + number4.toString());
		total.add(number4);
		log.info("{}", "total+number4 = " + total.toString());

		BigDecimalMoney balance = new BigDecimalMoney("1234567.89");
		BigDecimalMoney transaction = new BigDecimalMoney("9876543.21");
		BigDecimalMoney newBalance = balance.add(transaction);
		log.info(newBalance.toString());

		balance = new BigDecimalMoney("1115.37");
		transaction = new BigDecimalMoney("115.37");
		newBalance = balance.subtract(transaction);
		log.info(newBalance.toString());

	}

}
