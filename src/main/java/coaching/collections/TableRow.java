
package coaching.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A GenericTableRow class composed of GenericTableCell classes.
 */
public class TableRow {

    /** the columns in the row. */
    private final List<TableCell> cols = new ArrayList<>();

    /**
     * Instantiates a new table row.
     */
    public TableRow() {
        super();
    }

    /**
     * Instantiates a new table row.
     *
     * @param values the values
     */
    public TableRow(final String values) {
        super();
        addCells(values);
    }

    /**
     * Instantiates a new table row.
     *
     * @param values the values
     */
    public TableRow(final String... values) {
        super();
        addCells(values);
    }

    /**
     * Adds the cells.
     *
     * @param values the string
     */
    public void addCells(final String values) {
        addCells(values.split(","));
    }

    /**
     * Adds the cells.
     *
     * @param values the strings
     */
    public void addCells(final String... values) {
        for (final String value : values) {
            addCell(value);
        }
    }

    /**
     * Adds the cell.
     *
     * @param value the value
     */
    public void addCell(final String value) {
        this.cols.add(new TableCell(value));
    }

    /**
     * To row string.
     *
     * @return the string
     */
    public String toRowString() {
        return this.cols.toString();
    }

    /**
     * Length, number of columns.
     *
     * @return the number of columns as int.
     */
    public int length() {
        return this.cols.size();
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Collections.singletonList(this.cols).toString();
    }

}
