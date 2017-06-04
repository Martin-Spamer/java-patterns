package javamentor.money;

import java.text.DecimalFormat;
import java.util.Currency;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Money {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private Currency currency = Currency.getInstance(Locale.getDefault());
	private Long amount = 0L;

	public Money() {
		super();
	}

	public Money(Currency currency) {
		super();
		setCurrency(currency);
	}

	public Money(long amount) {
		super();
		setCurrency(Currency.getInstance(Locale.getDefault()));
		setAmount(amount);
	}

	public Money(Currency currency, long amount) {
		super();
		setCurrency(currency);
		setAmount(amount);
	}

	public Money setCurrency(Currency currency) {
		this.currency = currency;
		return this;
	}

	public Money setAmount(long amount) {
		this.amount = amount;
		return this;
	}

	public Money setAmount(Money amount) {
		this.amount = amount.getAmount();
		return this;
	}

	public Currency getCurrency() {
		return this.currency;
	}

	public Long getAmount() {
		return this.amount;
	}

	public String getCurrencyCode() {
		return this.currency.getCurrencyCode();
	}

	public String getSymbol() {
		return this.currency.getSymbol();
	}

	public String getDisplayName() {
		return this.currency.getDisplayName();
	}

	public Money add(long amount) {
		this.amount += amount;
		return this;
	}

	public Money add(Money amount) {
		this.amount += amount.getAmount();
		return this;
	}

	public Money subtract(long amount) {
		this.amount -= amount;
		return this;
	}

	public Money subtract(Money amount) {
		this.amount -= amount.getAmount();
		return this;
	}

	public boolean isMoreThan(long amount) {
		return this.amount > amount;
	}

	public boolean isMoreThan(Money money) {
		return this.amount > money.amount.longValue();
	}

	public boolean isEqualTo(long amount) {
		return this.amount == amount;
	}

	public boolean isEqualTo(Money money) {
		return this.amount == money.amount.longValue();
	}

	public boolean isLessThan(long amount) {
		return this.amount < amount;
	}

	public boolean isLessThan(Money money) {
		return this.amount < money.amount.longValue();
	}

	public void toLog() {
		final String debug = String.format("Money [currency=%s, amount=%s]", this.currency, this.amount);
		this.log.info("{}", debug);
	}

	@Override
	public String toString() {
		final String symbol = this.currency.getSymbol();
		final String pattern = String.format("%s ###,###.##", symbol);
		final DecimalFormat formatter = new DecimalFormat(pattern);
		final String output = formatter.format(this.amount);
		return output;
	}

}
