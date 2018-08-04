
package coaching.generics;

/**
 * Table Cell class.
 */
public class TableCell {

    /** The value. */
    private final String value;

    public TableCell() {
        this.value = "";
    }

    /**
     * Instantiates a new table cell.
     *
     * @param value
     *            the value
     */
    public TableCell(final String value) {
        this.value = value;
    }

    public String debugString() {
        return String
            .format("%a [value=%s]",
                    this.getClass().getSimpleName(),
                    this.value);
    }

    @Override
    public String toString() {
        return this.value;
    }

}
