/*
 * Currency.java
 *
 * Created on 08 February 2005, 16:12
 */

package javamentor.money;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/**
 * BigDecimalMoney Class.
 */
public class BigDecimalMoney {

	private Currency currency = Currency.getInstance(Locale.getDefault());
	private BigDecimal amount = new BigDecimal(0);

	/**
	 * Instantiates a new money.
	 */
	public BigDecimalMoney() {
		setCurrency(Currency.getInstance(Locale.getDefault()));
		amount = new BigDecimal(0);
	}

	/**
	 * Instantiates a new money.
	 *
	 * amount
	 *
	 * @param amount the amount
	 */
	public BigDecimalMoney(final int amount) {
		setCurrency(Currency.getInstance(Locale.getDefault()));
		this.amount = new BigDecimal(amount);
	}

	/**
	 * Instantiates a new money.
	 *
	 * amount
	 *
	 * @param amount the amount
	 */
	public BigDecimalMoney(final long amount) {
		setCurrency(Currency.getInstance(Locale.getDefault()));
		this.amount = new BigDecimal(amount);
	}

	/**
	 * Instantiates a new money.
	 *
	 * big decimal
	 *
	 * @param bigDecimal the big decimal
	 */
	public BigDecimalMoney(final BigDecimal bigDecimal) {
		setCurrency(Currency.getInstance(Locale.getDefault()));
		amount = bigDecimal;
	}

	/**
	 * Instantiates a new money.
	 *
	 * amount
	 * currency
	 *
	 * @param amount the amount
	 * @param currency the currency
	 */
	public BigDecimalMoney(final BigDecimal amount, final Currency currency) {
		setCurrency(currency);
		this.amount = amount;
	}

	/**
	 * Instantiates a new money.
	 *
	 * currency
	 *
	 * @param currency the currency
	 */
	public BigDecimalMoney(final Currency currency) {
		setCurrency(currency);
		amount = new BigDecimal(0);
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
	public BigDecimalMoney(final Currency currency, final BigDecimal amount) {
		super();
		setCurrency(currency);
		this.amount = amount;
	}

	/**
	 * Instantiates a new money.
	 *
	 * amount
	 *
	 * @param amount the amount
	 */
	public BigDecimalMoney(final String amount) {
		setCurrency(Currency.getInstance(Locale.getDefault()));
		this.amount = new BigDecimal(amount);
	}

	/**
	 * Adds the.
	 *
	 * amount
	 * money
	 *
	 * @param amount the amount
	 * @return the big decimal money
	 */
	public BigDecimalMoney add(final int amount) {
		this.amount = this.amount.add(new BigDecimal(amount));
		return this;
	}

	/**
	 * Adds the.
	 *
	 * amount
	 * money
	 *
	 * @param amount the amount
	 * @return the big decimal money
	 */
	public BigDecimalMoney add(final long amount) {
		this.amount = this.amount.add(new BigDecimal(amount));
		return this;
	}

	/**
	 * Adds the.
	 *
	 * amount
	 * money
	 *
	 * @param amount the amount
	 * @return the big decimal money
	 */
	public BigDecimalMoney add(final BigDecimal amount) {
		this.amount = this.amount.add(amount);
		return this;
	}

	/**
	 * Adds the.
	 *
	 * amount
	 * money
	 *
	 * @param amount the amount
	 * @return the big decimal money
	 */
	public BigDecimalMoney add(final BigDecimalMoney amount) {
		this.amount = this.amount.add(amount.asBigDecimal());
		return this;
	}

	/**
	 * As big decimal.
	 *
	 * big decimal
	 *
	 * @return the big decimal
	 */
	private BigDecimal asBigDecimal() {
		return amount;
	}

	/**
	 * Subtract.
	 *
	 * amount
	 * money
	 *
	 * @param amount the amount
	 * @return the big decimal money
	 */
	public BigDecimalMoney subtract(final int amount) {
		this.amount = this.amount.subtract(new BigDecimal(amount));
		return this;
	}

	/**
	 * Subtract.
	 *
	 * amount
	 * money
	 *
	 * @param amount the amount
	 * @return the big decimal money
	 */
	public BigDecimalMoney subtract(final BigDecimal amount) {
		this.amount = this.amount.subtract(amount);
		return this;
	}

	/**
	 * Subtract.
	 *
	 * amount
	 * money
	 *
	 * @param amount the amount
	 * @return the big decimal money
	 */
	public BigDecimalMoney subtract(final BigDecimalMoney amount) {
		this.amount = this.amount.subtract(amount.asBigDecimal());
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
	 * currency.
	 *
	 * currency
	 * money
	 *
	 * @param currency the currency
	 * @return the big decimal money
	 */
	public BigDecimalMoney setCurrency(final Currency currency) {
		this.currency = currency;
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
		final String currencyString = numberFormat.format(amount);
		return String.format("%s", currencyString);
	}

}
