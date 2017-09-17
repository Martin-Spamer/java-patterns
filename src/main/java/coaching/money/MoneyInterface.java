package coaching.money;

import java.util.Currency;

public interface MoneyInterface {

	/**
	 * currency.
	 *
	 * @param currency the currency
	 * @return the money
	 */
	public MoneyInterface setCurrency(Currency currency);

	/**
	 * amount.
	 *
	 * @param amount the amount
	 * @return the money
	 */
	public MoneyInterface setAmount(long amount);

	/**
	 * amount.
	 *
	 * @param amount the amount
	 * @return the money
	 */
	public MoneyInterface setAmount(Money amount);

	/**
	 * currency.
	 *
	 * @return the currency
	 */
	public Currency getCurrency();

	/**
	 * amount.
	 *
	 * @return the amount
	 */
	public Long getAmount();

	/**
	 * currency code.
	 *
	 * @return the currency code
	 */
	public String getCurrencyCode();

	/**
	 * symbol.
	 *
	 * @return the symbol
	 */
	public String getSymbol();

	/**
	 * display name.
	 *
	 * @return the display name
	 */
	public String getDisplayName();

	/**
	 * Adds an.
	 *
	 * @param amount the amount
	 * @return the money
	 */
	public MoneyInterface add(long amount);

	/**
	 * Adds an.
	 *
	 * @param amount the amount
	 * @return the money
	 */
	public MoneyInterface add(Money amount);

	/**
	 * Subtract.
	 *
	 * @param amount the amount
	 * @return the money
	 */
	public MoneyInterface subtract(long amount);

	/**
	 * Subtract.
	 *
	 * @param amount the amount
	 * @return the money
	 */
	public MoneyInterface subtract(Money amount);

	/**
	 * Checks if is more than.
	 *
	 * @param amount the amount
	 * @return true, if is
	 * 			more than
	 */
	public boolean isMoreThan(long amount);

	/**
	 * Checks if is more than.
	 *
	 * @param money the money
	 * @return true, if is
	 * 			more than
	 */
	public boolean isMoreThan(Money money);

	/**
	 * Checks if is equal to.
	 *
	 * @param amount the amount
	 * @return true, if is
	 * 			equal to
	 */
	public boolean isEqualTo(long amount);

	/**
	 * Checks if is equal to.
	 *
	 * @param money the money
	 * @return true, if is
	 * 			equal to
	 */
	public boolean isEqualTo(Money money);

	/**
	 * Checks if is less than.
	 *
	 * @param amount the amount
	 * @return true, if is
	 * 			less than
	 */
	public boolean isLessThan(long amount);

	/**
	 * Checks if is less than.
	 *
	 * @param money the money
	 * @return true, if is
	 * 			less than
	 */
	public boolean isLessThan(Money money);

}
