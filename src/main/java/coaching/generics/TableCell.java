
package coaching.generics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Generic Table Cell class.
 */
public class TableCell<T> {

    /** provides logging. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /** The value. */
    private T value;

    /**
     * Instantiates a new table cell.
     */
    public TableCell() {
        super();
    }

    /**
     * Instantiates a new table cell.
     *
     * @param value the value
     */
    public TableCell(final T value) {
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
    public TableCell<T> setValue(final T value) {
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
