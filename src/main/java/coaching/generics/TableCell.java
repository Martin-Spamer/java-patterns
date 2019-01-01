
package coaching.generics;

/**
 * Table Cell class.
 */
public class TableCell {

    /** The value. */
    private final String value;

    /**
     * Instantiates a new table cell.
     */
    public TableCell() {
        this.value = "";
    }

    /**
     * Instantiates a new table cell.
     *
     * @param value the value
     */
    public TableCell(final String value) {
        this.value = value;
    }

    /**
     * Debug string.
     *
     * @return the string
     */
    public String debugString() {
        return String.format("%a [value=%s]", this.getClass().getSimpleName(), this.value);
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return this.value;
    }

}
