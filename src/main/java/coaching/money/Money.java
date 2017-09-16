
package coaching.money;

import java.text.DecimalFormat;
import java.util.*;

import org.slf4j.*;

/**
 * Money Class.
 */
public class Money {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private Currency currency = Currency.getInstance(Locale.getDefault());
	private Long amount = 0L;

	/**
	 * Instantiates a new money.
	 */
	public Money() {
		super();
	}

	/**
	 * Instantiates a new money.
	 *
	 * currency
	 *
	 * @param currency the currency
	 */
	public Money(Currency currency) {
		super();
		setCurrency(currency);
	}

	/**
	 * Instantiates a new money.
	 *
	 * amount
	 *
	 * @param amount the amount
	 */
	public Money(long amount) {
		super();
		setCurrency(Currency.getInstance(Locale.getDefault()));
		setAmount(amount);
	}

	/**
	 * Instantiates a new money.
	 *
	 * currency
	 * amount
	 *
	 * @param currency the currency
	 * @param amount the amount
	 */
	public Money(Currency currency, long amount) {
		super();
		setCurrency(currency);
		setAmount(amount);
	}

	/**
	 * currency.
	 *
	 * currency
	 * money
	 *
	 * @param currency the currency
	 * @return the money
	 */
	public Money setCurrency(Currency currency) {
		this.currency = currency;
		return this;
	}

	/**
	 * amount.
	 *
	 * amount
	 * money
	 *
	 * @param amount the amount
	 * @return the money
	 */
	public Money setAmount(long amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * amount.
	 *
	 * amount
	 * money
	 *
	 * @param amount the amount
	 * @return the money
	 */
	public Money setAmount(Money amount) {
		this.amount = amount.getAmount();
		return this;
	}

	/**
	 * currency.
	 *
	 * currency
	 *
	 * @return the currency
	 */
	public Currency getCurrency() {
		return currency;
	}

	/**
	 * amount.
	 *
	 * amount
	 *
	 * @return the amount
	 */
	public Long getAmount() {
		return amount;
	}

	/**
	 * currency code.
	 *
	 * currency code
	 *
	 * @return the currency code
	 */
	public String getCurrencyCode() {
		return currency.getCurrencyCode();
	}

	/**
	 * symbol.
	 *
	 * symbol
	 *
	 * @return the symbol
	 */
	public String getSymbol() {
		return currency.getSymbol();
	}

	/**
	 * display name.
	 *
	 * display name
	 *
	 * @return the display name
	 */
	public String getDisplayName() {
		return currency.getDisplayName();
	}

	/**
	 * Adds an.
	 *
	 * amount
	 * money
	 *
	 * @param amount the amount
	 * @return the money
	 */
	public Money add(long amount) {
		this.amount += amount;
		return this;
	}

	/**
	 * Adds an.
	 *
	 * amount
	 * money
	 *
	 * @param amount the amount
	 * @return the money
	 */
	public Money add(Money amount) {
		this.amount += amount.getAmount();
		return this;
	}

	/**
	 * Subtract.
	 *
	 * amount
	 * money
	 *
	 * @param amount the amount
	 * @return the money
	 */
	public Money subtract(long amount) {
		this.amount -= amount;
		return this;
	}

	/**
	 * Subtract.
	 *
	 * amount
	 * money
	 *
	 * @param amount the amount
	 * @return the money
	 */
	public Money subtract(Money amount) {
		this.amount -= amount.getAmount();
		return this;
	}

	/**
	 * Checks if is more than.
	 *
	 * amount
	 *
	 * @param amount the amount
	 * @return true, if is
	 * 			more than
	 */
	public boolean isMoreThan(long amount) {
		return this.amount > amount;
	}

	/**
	 * Checks if is more than.
	 *
	 * money
	 *
	 * @param money the money
	 * @return true, if is
	 * 			more than
	 */
	public boolean isMoreThan(Money money) {
		return amount > money.amount.longValue();
	}

	/**
	 * Checks if is equal to.
	 *
	 * amount
	 *
	 * @param amount the amount
	 * @return true, if is
	 * 			equal to
	 */
	public boolean isEqualTo(long amount) {
		return this.amount == amount;
	}

	/**
	 * Checks if is equal to.
	 *
	 * money
	 *
	 * @param money the money
	 * @return true, if is
	 * 			equal to
	 */
	public boolean isEqualTo(Money money) {
		return amount == money.amount.longValue();
	}

	/**
	 * Checks if is less than.
	 *
	 * amount
	 *
	 * @param amount the amount
	 * @return true, if is
	 * 			less than
	 */
	public boolean isLessThan(long amount) {
		return this.amount < amount;
	}

	/**
	 * Checks if is less than.
	 *
	 * money
	 *
	 * @param money the money
	 * @return true, if is
	 * 			less than
	 */
	public boolean isLessThan(Money money) {
		return amount < money.amount.longValue();
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
