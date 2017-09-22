package coaching.money;

import static org.junit.Assert.*;

import java.util.Currency;

import org.junit.Test;
import org.slf4j.*;

/**
 * Money Test Class.
 */
public class PoundTest {

	private static final Logger LOG = LoggerFactory.getLogger(PoundTest.class);

	/**
	 * Pounds Class.
	 */
	public final class Pounds extends Money {

		public Pounds() {
			super();
		}

		public Pounds(final Currency currency, final long amount) {
			super(currency, amount);
		}

		public Pounds(final Currency currency) {
			super(currency);
		}

		public Pounds(final long amount) {
			super(amount);
		}
	}

	/**
	 * Unit Test to money.
	 */
	@Test
	public void testPounds() {
		LOG.info("testPounds");

		final Pounds pounds = new Pounds(10L);
		assertNotNull(pounds);
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
		assertNotNull(pounds);
		assertTrue(pounds.isEqualTo(0));
	}

	/**
	 * Unit Test to money long.
	 */
	@Test
	public void testPoundsCurrencyLong() {
		LOG.info("testPoundsCurrencyLong");
		final MoneyInterface pounds = new Pounds(0L);
		assertNotNull(pounds);
		assertTrue(pounds.isEqualTo(0));
	}

	/**
	 * Unit Test to min value.
	 */
	@Test
	public void testMinValue() {
		LOG.info("testMinValue");
		final MoneyInterface money = new Money(Long.MIN_VALUE);
		assertNotNull(money);
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
		assertNotNull(money);
		LOG.info("{}", money.toString());
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
		final MoneyInterface pounds = new Pounds(gbp, Long.MAX_VALUE);
		LOG.info("{}", pounds.toString());
		assertNotNull(pounds);
		final String actual = pounds.toString();
		assertEquals("£ 9,223,372,036,854,775,807", actual);
	}

	/**
	 * Unit Test to max euro.
	 */
	@Test
	public void testMaxEuro() {
		LOG.info("testMaxEuro");
		final Currency eur = Currency.getInstance("EUR");
		LOG.info("Currency = {}", eur.getDisplayName());
		final MoneyInterface money = new Money(eur, Long.MAX_VALUE);
		assertNotNull(money);
		LOG.info("{}", money.toString());
		final String actual = money.toString();
		assertEquals("€ 9,223,372,036,854,775,807", actual);
	}

	/**
	 * Unit Test to max dollar.
	 */
	@Test
	public void testMaxDollar() {
		LOG.info("testMaxDollar");
		final Currency usd = Currency.getInstance("USD");
		LOG.info("Currency = {}", usd.getDisplayName());
		final MoneyInterface money = new Money(usd, Long.MAX_VALUE);
		assertNotNull(money);
		LOG.info("{}", money.toString());
		final String actual = money.toString();
		assertEquals("USD 9,223,372,036,854,775,807", actual);
	}

}