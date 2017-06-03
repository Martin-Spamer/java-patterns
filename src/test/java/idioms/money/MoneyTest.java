package idioms.money;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Currency;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoneyTest {

	private static final Logger LOG = LoggerFactory.getLogger(MoneyTest.class);

	public class Pounds extends Money {
	}

	@Test
	public void testMoney() {
		final Money money = new Money(10L);
		assertNotNull(money);
		LOG.info("new Money(10L) = {}", money.toString());

		money.add(1L);
		LOG.info("new Money(10L).add(1L) = {}", money.toString());

		money.add(new Money(1L));
		LOG.info("new Money(10L).add(1L) = {}", money.toString());

		money.subtract(2L);
		LOG.info("new Money(10L).add(1L).subtract(2L) = {}", money.toString());

		money.subtract(new Money(2L));
		LOG.info("new Money(10L).add(1L).subtract(2L) = {}", money.toString());

		assertTrue(money.isMoreThan(7L));
		assertTrue(money.isMoreThan(new Money(7L)));
		LOG.info("{}", money.toString());

		assertTrue(money.isEqualTo(8L));
		assertTrue(money.isEqualTo(new Money(8L)));
		LOG.info("{}", money.toString());

		assertTrue(money.isLessThan(9L));
		assertTrue(money.isLessThan(new Money(9L)));
		LOG.info("{}", money.toString());
	}

	@Test
	public void testMoneyCurrency() {
		final Money money = new Money();
		assertNotNull(money);
		assertTrue(money.isEqualTo(0));
	}

	@Test
	public void testMoneyLong() {
		final Money money = new Money();
		assertNotNull(money);
		assertTrue(money.isEqualTo(0));
	}

	@Test
	public void testMoneyCurrencyLong() {
		final Money money = new Money();
		assertNotNull(money);
		assertTrue(money.isEqualTo(0L));
	}

	@Test
	public void testMinValue() {
		final Money money = new Money(Long.MIN_VALUE);
		assertNotNull(money);
		LOG.info("{}", money.toString());
		assertTrue(money.isEqualTo(Long.MIN_VALUE));
	}

	@Test
	public void testMaxValue() {
		final Money money = new Money(Long.MAX_VALUE);
		assertNotNull(money);
		LOG.info("{}", money.toString());
		assertTrue(money.isEqualTo(Long.MAX_VALUE));
	}

	@Test
	public void testMaxPounds() {
		final Currency gbp = Currency.getInstance("GBP");
		LOG.info("Currency = {}", gbp.getDisplayName());
		final Money money = new Money(gbp, Long.MAX_VALUE);
		LOG.info("{}", money.toString());
		assertNotNull(money);
		final String actual = money.toString();
		assertEquals("£ 9,223,372,036,854,775,807", actual);
	}

	@Test
	public void testMaxEuro() {
		final Currency eur = Currency.getInstance("EUR");
		LOG.info("Currency = {}", eur.getDisplayName());
		final Money money = new Money(eur, Long.MAX_VALUE);
		assertNotNull(money);
		LOG.info("{}", money.toString());
		final String actual = money.toString();
		assertEquals("€ 9,223,372,036,854,775,807", actual);
	}

	@Test
	public void testMaxDollar() {
		final Currency usd = Currency.getInstance("USD");
		LOG.info("Currency = {}", usd.getDisplayName());
		final Money money = new Money(usd, Long.MAX_VALUE);
		assertNotNull(money);
		LOG.info("{}", money.toString());
		final String actual = money.toString();
		assertEquals("USD 9,223,372,036,854,775,807", actual);
	}

}
