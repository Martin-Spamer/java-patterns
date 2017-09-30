/*
 * Currency.java
 *
 * Created on 08 February 2005, 16:12
 */

package coaching.money;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.*;

import org.slf4j.*;

/**
 * Big Decimal Money class.
 */
public class BigDecimalMoney implements MoneyInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private Currency currency = Currency.getInstance(Locale.getDefault());
	private BigDecimal amount = new BigDecimal(0);

	/**
	 * Instantiates a new money instance.
	 */
	public BigDecimalMoney() {
		super();
		final Locale locale = Locale.getDefault();
		log.debug("locale = {}", locale);
		final Currency currency = Currency.getInstance(locale);
		log.debug("currency = {}", currency);
		setCurrency(currency);
		amount = new BigDecimal(0);
		log.debug("this.amount = {}", amount);
	}

	/**
	 * Instantiates a new money instance.
	 *
	 * @param amount the amount
	 */
	public BigDecimalMoney(final long amount) {
		super();
		final Locale locale = Locale.getDefault();
		log.debug("locale = {}", locale);
		final Currency currency = Currency.getInstance(locale);
		log.debug("currency = {}", currency);
		setCurrency(currency);
		this.amount = new BigDecimal(amount);
		log.debug("this.amount = {}", this.amount);
	}

	/**
	 * Instantiates a new money instance.
	 *
	 * @param bigDecimal the big decimal
	 */
	public BigDecimalMoney(final BigDecimal bigDecimal) {
		super();
		final Locale locale = Locale.getDefault();
		log.debug("locale = {}", locale);
		final Currency currency = Currency.getInstance(locale);
		log.debug("currency = {}", currency);
		setCurrency(currency);
		amount = bigDecimal;
		log.debug("this.amount = {}", amount);
	}

	/**
	 * Instantiates a new money instance.
	 *
	 * @param amount the amount
	 * @param locale the locale
	 */
	public BigDecimalMoney(final BigDecimal amount, final Locale locale) {
		super();
		log.debug("locale = {}", locale);
		final Currency currency = Currency.getInstance(locale);
		log.debug("currency = {}", currency);
		setCurrency(currency);
		this.amount = amount;
		log.debug("this.amount = {}", this.amount);
	}

	/**
	 * Instantiates a new money instance.
	 *
	 * @param amount the amount
	 * @param currency the currency
	 */
	public BigDecimalMoney(final BigDecimal amount, final Currency currency) {
		super();
		log.debug("currency = {}", currency);
		setCurrency(currency);
		this.amount = amount;
		log.debug("this.amount = {}", this.amount);
	}

	/**
	 * Instantiates a new money instance.
	 *
	 * @param currency the currency
	 */
	public BigDecimalMoney(final Currency currency) {
		super();
		log.debug("currency = {}", currency);
		setCurrency(currency);
		amount = new BigDecimal(0);
		log.debug("this.amount = {}", amount);
	}

	/**
	 * Instantiates a new money instance.
	 *
	 * @param currency the currency
	 * @param amount the amount
	 */
	public BigDecimalMoney(final Currency currency, final BigDecimal amount) {
		super();
		log.debug("currency = {}", currency);
		setCurrency(currency);
		this.amount = amount;
		log.debug("this.amount = {}", this.amount);
	}

	/**
	 * Instantiates a new money instance.
	 *
	 * @param amount the amount
	 */
	public BigDecimalMoney(final String amount) {
		setCurrency(Currency.getInstance(Locale.getDefault()));
		this.amount = new BigDecimal(amount);
	}

	/**
	 * set the currency.
	 *
	 * @param currency the currency
	 * @return the big decimal money
	 */
	@Override
	public MoneyInterface setCurrency(final Currency currency) {
		this.currency = currency;
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see coaching.money.MoneyInterface#setAmount(long)
	 */
	@Override
	public MoneyInterface setAmount(final long amount) {
		this.amount = new BigDecimal(amount);
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see coaching.money.MoneyInterface#setAmount(coaching.money.Money)
	 */
	@Override
	public MoneyInterface setAmount(final MoneyInterface amount) {
		this.amount = new BigDecimal(amount.getAmount());
		return this;
	}

	/**
	 * Adds a long amount.
	 *
	 * @param amount the amount
	 * @return the big decimal money
	 */
	@Override
	public BigDecimalMoney add(final long amount) {
		this.amount = this.amount.add(new BigDecimal(amount));
		return this;
	}

	/**
	 * Adds a BigDecimal amount.
	 *
	 * @param amount the amount
	 * @return the big decimal money
	 */
	public BigDecimalMoney add(final BigDecimal amount) {
		this.amount = this.amount.add(amount);
		return this;
	}

	/**
	 * Adds a BigDecimalMoney amount.
	 *
	 * @param amount the amount
	 * @return the big decimal money
	 */
	public BigDecimalMoney add(final BigDecimalMoney amount) {
		this.amount = this.amount.add(amount.asBigDecimal());
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see coaching.money.MoneyInterface#subtract(long)
	 */
	@Override
	public MoneyInterface subtract(final long amount) {
		this.amount = this.amount.subtract(new BigDecimal(amount));
		return this;
	}

	/**
	 * Subtract an BigDecimal amount.
	 *
	 * @param amount the amount
	 * @return the big decimal money
	 */
	public BigDecimalMoney subtract(final BigDecimal amount) {
		this.amount = this.amount.subtract(amount);
		return this;
	}

	/**
	 * Subtract an BigDecimalMoney amount.
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
	 * @return the currency
	 */
	@Override
	public Currency getCurrency() {
		return currency;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see coaching.money.MoneyInterface#getAmount()
	 */
	@Override
	public Long getAmount() {
		return amount.longValue();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see coaching.money.MoneyInterface#getCurrencyCode()
	 */
	@Override
	public String getCurrencyCode() {
		return currency.getCurrencyCode();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see coaching.money.MoneyInterface#getSymbol()
	 */
	@Override
	public String getSymbol() {
		return currency.getSymbol();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see coaching.money.MoneyInterface#getDisplayName()
	 */
	@Override
	public String getDisplayName() {
		return currency.getDisplayName();
	}

	/**
	 * As big decimal.
	 *
	 * @return the big decimal
	 */
	private BigDecimal asBigDecimal() {
		return amount;
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

	/*
	 * (non-Javadoc)
	 *
	 * @see coaching.money.MoneyInterface#isMoreThan(long)
	 */
	@Override
	public boolean isMoreThan(final long amount) {
		return this.amount.longValue() > amount;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see coaching.money.MoneyInterface#isEqualTo(long)
	 */
	@Override
	public boolean isEqualTo(final long amount) {
		return this.amount.longValue() == amount;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see coaching.money.MoneyInterface#isLessThan(long)
	 */
	@Override
	public boolean isLessThan(final long amount) {
		return this.amount.longValue() < amount;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see coaching.money.MoneyInterface#add(coaching.money.MoneyInterface)
	 */
	@Override
	public MoneyInterface add(final MoneyInterface amount) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * coaching.money.MoneyInterface#subtract(coaching.money.MoneyInterface)
	 */
	@Override
	public MoneyInterface subtract(final MoneyInterface amount) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * coaching.money.MoneyInterface#isMoreThan(coaching.money.MoneyInterface)
	 */
	@Override
	public boolean isMoreThan(final MoneyInterface money) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * coaching.money.MoneyInterface#isEqualTo(coaching.money.MoneyInterface)
	 */
	@Override
	public boolean isEqualTo(final MoneyInterface money) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * coaching.money.MoneyInterface#isLessThan(coaching.money.MoneyInterface)
	 */
	@Override
	public boolean isLessThan(final MoneyInterface money) {
		// TODO Auto-generated method stub
		return false;
	}

}
