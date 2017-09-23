
package coaching.money;

import java.util.Currency;

/**
 * Money Interface.
 */
public interface MoneyInterface {

	/**
	 * set the currency.
	 *
	 * @param currency the currency
	 * @return the money
	 */
	public MoneyInterface setCurrency(Currency currency);

	/**
	 * set the amount using long.
	 *
	 * @param amount the amount
	 * @return the money
	 */
	public MoneyInterface setAmount(long amount);

	/**
	 * set the amount using Money instance.
	 *
	 * @param amount the amount
	 * @return the money
	 */
	public MoneyInterface setAmount(Money amount);

	/**
	 * get the currency.
	 *
	 * @return the currency
	 */
	public Currency getCurrency();

	/**
	 * get the amount.
	 *
	 * @return the amount
	 */
	public Long getAmount();

	/**
	 * get the currency code.
	 *
	 * @return the currency code
	 */
	public String getCurrencyCode();

	/**
	 * get the symbol.
	 *
	 * @return the symbol
	 */
	public String getSymbol();

	/**
	 * get the display name.
	 *
	 * @return the display name
	 */
	public String getDisplayName();

	/**
	 * Add an amount.
	 *
	 * @param amount the amount
	 * @return the money
	 */
	public MoneyInterface add(long amount);

	/**
	 * Add an amount.
	 *
	 * @param amount the amount
	 * @return the money
	 */
	public MoneyInterface add(Money amount);

	/**
	 * Subtract an amount.
	 *
	 * @param amount the amount
	 * @return the money
	 */
	public MoneyInterface subtract(long amount);

	/**
	 * Subtract an amount.
	 *
	 * @param amount the amount
	 * @return the money
	 */
	public MoneyInterface subtract(Money amount);

	/**
	 * Checks if more than amount.
	 *
	 * @param amount the amount
	 * @return true, if is
	 * 			more than
	 */
	public boolean isMoreThan(long amount);

	/**
	 * Checks if more than amount.
	 *
	 * @param money the money
	 * @return true, if is
	 * 			more than
	 */
	public boolean isMoreThan(Money money);

	/**
	 * Checks if equal to amount.
	 *
	 * @param amount the amount
	 * @return true, if is
	 * 			equal to
	 */
	public boolean isEqualTo(long amount);

	/**
	 * Checks if equal to amount.
	 *
	 * @param money the money
	 * @return true, if is
	 * 			equal to
	 */
	public boolean isEqualTo(Money money);

	/**
	 * Checks if less than amount.
	 *
	 * @param amount the amount
	 * @return true, if is
	 * 			less than
	 */
	public boolean isLessThan(long amount);

	/**
	 * Checks if less than amount.
	 *
	 * @param money the money
	 * @return true, if is
	 * 			less than
	 */
	public boolean isLessThan(Money money);

}
