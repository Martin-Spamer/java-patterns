
package coaching.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A GenericTableRow class composed of GenericTableCell classes.
 */
public class TableColumn {

    /** the columns in the row. */
    private final List<TableCell> row = new ArrayList<>();

    /**
     * Instantiates a new table row.
     */
    public TableColumn() {
        super();
    }

    /**
     * Instantiates a new table row.
     *
     * @param values the values
     */
    public TableColumn(final String values) {
        super();
        addCells(values);
    }

    /**
     * Instantiates a new table row.
     *
     * @param values the values
     */
    public TableColumn(final String... values) {
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
            addCell(value.trim());
        }
    }

    /**
     * Adds the cell.
     *
     * @param value the value
     */
    public void addCell(final String value) {
        this.row.add(new TableCell(value));
    }

    /**
     * To row string.
     *
     * @return the string
     */
    public String toRowString() {
        return this.row.toString();
    }

    /**
     * Length, number of columns.
     *
     * @return the number of columns as int.
     */
    public int length() {
        return this.row.size();
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Collections.singletonList(this.row).toString();
    }

}
