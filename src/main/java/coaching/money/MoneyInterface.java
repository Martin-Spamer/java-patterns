
package coaching.money;

import java.util.Currency;

/**
 * Money Interface.
 */
public interface MoneyInterface {

    /**
     * set the currency.
     *
     * @param currency
     *            the currency
     * @return this as fluent interface.
     */
    public MoneyInterface setCurrency(final Currency currency);

    /**
     * set the amount using long.
     *
     * @param amount
     *            the amount
     * @return this as fluent interface.
     */
    public MoneyInterface setAmount(final long amount);

    /**
     * set the amount using Money instance.
     *
     * @param amount
     *            the amount
     * @return this as fluent interface.
     */
    public MoneyInterface setAmount(final MoneyInterface amount);

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
     * @param amount
     *            the amount
     * @return this as fluent interface.
     */
    public MoneyInterface add(final long amount);

    /**
     * Adds an amount.
     *
     * @param amount
     *            the amount
     * @return this as fluent interface.
     */
    public MoneyInterface add(final MoneyInterface amount);

    /**
     * Subtract.
     *
     * @param amount
     *            the amount
     * @return this as fluent interface.
     */
    public MoneyInterface subtract(final long amount);

    /**
     * Subtract.
     *
     * @param amount
     *            the amount
     * @return this as fluent interface.
     */
    public MoneyInterface subtract(final MoneyInterface amount);

    /**
     * Checks if more than amount.
     *
     * @param amount
     *            the amount
     * @return true, if is more than
     */
    public boolean isMoreThan(final long amount);

    /**
     * Checks if is more than.
     *
     * @param money
     *            the money
     * @return true, if successful, otherwise false., otherwise false. more than
     */
    public boolean isMoreThan(final MoneyInterface money);

    /**
     * Checks if equal to amount.
     *
     * @param amount
     *            the amount
     * @return true, if is equal to
     */
    public boolean isEqualTo(final long amount);

    /**
     * Checks if is equal to.
     *
     * @param money
     *            the money
     * @return true, if successful, otherwise false., otherwise false. equal to
     */
    public boolean isEqualTo(final MoneyInterface money);

    /**
     * Checks if less than amount.
     *
     * @param amount
     *            the amount
     * @return true, if is less than
     */
    public boolean isLessThan(final long amount);

    /**
     * Checks if is less than.
     *
     * @param money
     *            the money
     * @return true, if successful, otherwise false., otherwise false. less than
     */
    public boolean isLessThan(final MoneyInterface money);

}
