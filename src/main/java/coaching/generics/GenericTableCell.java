
package coaching.generics;

import lombok.extern.slf4j.Slf4j;

/**
 * Generic GenericTable Cell class.
 *
 * @param <T> the generic type
 */


@Slf4j
public class GenericTableCell<T> {

    /** The value. */
    private T value;

    /**
     * Instantiates a new table cell.
     */
    public GenericTableCell() {
        super();
    }

    /**
     * Instantiates a new table cell.
     *
     * @param value the value
     */
    public GenericTableCell(final T value) {
        super();
        this.value = value;
    }

    /**
     * Gets the value.
     *
     * @return the value
     */
    public T getValue() {
        return this.value;
    }

    /**
     * Sets the value.
     *
     * @param value the value to set
     * @return the table cell
     */
    public GenericTableCell<T> setValue(final T value) {
        this.value = value;
        return this;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s", this.value);
    }

}
