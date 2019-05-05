
package coaching.collections;

/**
 * GenericTable Cell class.
 */
public class TableCell {

    /** The value. */
    private String value = "";

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
    public TableCell(final String value) {
        super();
        this.value = value;
    }

    /**
     * Gets the value of the cell.
     *
     * @return the value
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Sets the value of the cell.
     *
     * @param value the value to set
     * @return the table cell
     */
    public TableCell setValue(final String value) {
        this.value = value;
        return this;
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
