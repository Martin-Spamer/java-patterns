
package coaching.money;

import java.text.DecimalFormat;
import java.util.*;

import org.slf4j.*;

/**
 * An Abstract Money class.
 */
public class AbstractMoney implements MoneyInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private Currency currency = Currency.getInstance(Locale.getDefault());
	private Long amount = 0L;

	/**
	 * Instantiates a new abstract money.
	 */
	public AbstractMoney() {
		super();
	}

	/**
	 * Instantiates a new abstract money.
	 *
	 * @param currency the currency
	 */
	public AbstractMoney(final Currency currency) {
		super();
		setCurrency(currency);
	}

	/**
	 * Instantiates a new abstract money.
	 *
	 * @param amount the amount
	 */
	public AbstractMoney(final long amount) {
		setCurrency(Currency.getInstance(Locale.getDefault()));
		setAmount(amount);
	}

	/**
	 * Instantiates a new abstract money.
	 *
	 * @param currency the currency
	 * @param amount the amount
	 */
	public AbstractMoney(final Currency currency, final Long amount) {
		super();
		setCurrency(currency);
		setAmount(amount);
	}

	/* (non-Javadoc)
	 * @see coaching.money.MoneyInterface#setCurrency(java.util.Currency)
	 */
	@Override
	public AbstractMoney setCurrency(final Currency currency) {
		this.currency = currency;
		return this;
	}

	/* (non-Javadoc)
	 * @see coaching.money.MoneyInterface#setAmount(long)
	 */
	@Override
	public AbstractMoney setAmount(final long amount) {
		this.amount = amount;
		return this;
	}

	/* (non-Javadoc)
	 * @see coaching.money.MoneyInterface#setAmount(coaching.money.Money)
	 */
	@Override
	public AbstractMoney setAmount(final Money amount) {
		this.amount = amount.getAmount();
		return this;
	}

	/* (non-Javadoc)
	 * @see coaching.money.MoneyInterface#getCurrency()
	 */
	@Override
	public Currency getCurrency() {
		return currency;
	}

	/* (non-Javadoc)
	 * @see coaching.money.MoneyInterface#getCurrencyCode()
	 */
	@Override
	public String getCurrencyCode() {
		return currency.getCurrencyCode();
	}

	/* (non-Javadoc)
	 * @see coaching.money.MoneyInterface#getAmount()
	 */
	@Override
	public Long getAmount() {
		return amount;
	}

	/* (non-Javadoc)
	 * @see coaching.money.MoneyInterface#getSymbol()
	 */
	@Override
	public String getSymbol() {
		return currency.getSymbol();
	}

	/* (non-Javadoc)
	 * @see coaching.money.MoneyInterface#getDisplayName()
	 */
	@Override
	public String getDisplayName() {
		return currency.getDisplayName();
	}

	/* (non-Javadoc)
	 * @see coaching.money.MoneyInterface#add(long)
	 */
	@Override
	public AbstractMoney add(final long amount) {
		this.amount += amount;
		return this;
	}

	/* (non-Javadoc)
	 * @see coaching.money.MoneyInterface#add(coaching.money.Money)
	 */
	@Override
	public AbstractMoney add(final Money amount) {
		this.amount += amount.getAmount();
		return this;
	}

	/* (non-Javadoc)
	 * @see coaching.money.MoneyInterface#subtract(long)
	 */
	@Override
	public AbstractMoney subtract(final long amount) {
		this.amount -= amount;
		return this;
	}

	/* (non-Javadoc)
	 * @see coaching.money.MoneyInterface#subtract(coaching.money.Money)
	 */
	@Override
	public AbstractMoney subtract(final Money amount) {
		this.amount -= amount.getAmount();
		return this;
	}

	/* (non-Javadoc)
	 * @see coaching.money.MoneyInterface#isMoreThan(long)
	 */
	@Override
	public boolean isMoreThan(final long amount) {
		return this.amount > amount;
	}

	/* (non-Javadoc)
	 * @see coaching.money.MoneyInterface#isMoreThan(coaching.money.Money)
	 */
	@Override
	public boolean isMoreThan(final Money money) {
		return amount > money.getAmount();
	}

	/* (non-Javadoc)
	 * @see coaching.money.MoneyInterface#isEqualTo(long)
	 */
	@Override
	public boolean isEqualTo(final long amount) {
		return this.amount == amount;
	}

	/* (non-Javadoc)
	 * @see coaching.money.MoneyInterface#isEqualTo(coaching.money.Money)
	 */
	@Override
	public boolean isEqualTo(final Money money) {
		return amount == money.getAmount();
	}

	/* (non-Javadoc)
	 * @see coaching.money.MoneyInterface#isLessThan(long)
	 */
	@Override
	public boolean isLessThan(final long amount) {
		return this.amount < amount;
	}

	/* (non-Javadoc)
	 * @see coaching.money.MoneyInterface#isLessThan(coaching.money.Money)
	 */
	@Override
	public boolean isLessThan(final Money money) {
		return amount < money.getAmount();
	}

	/**
	 * To log.
	 */
	public void toLog() {
		final String debug = String.format("Money [currency=%s, amount=%s]", currency, amount);
		log.info("{}", debug);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final String symbol = currency.getSymbol();
		final String pattern = String.format("%s ###,###.##", symbol);
		final DecimalFormat formatter = new DecimalFormat(pattern);
		final String output = formatter.format(amount);
		return output;
	}

}