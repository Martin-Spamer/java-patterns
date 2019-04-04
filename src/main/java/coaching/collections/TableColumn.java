
package coaching.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

/**
 * A GenericTableRow class composed of GenericTableCell classes.
 */
@Slf4j
public class TableColumn {

    /** the columns in the row. */
    private final List<TableCell> cols = new ArrayList<>();

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
        final String[] tuple = values.split(",");
        for (final String value : tuple) {
            final TableCell cell = new TableCell(value.trim());
            this.cols.add(cell);
        }
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
        this.cols.add(new TableCell(value));
    }

    /**
     * Length, number of columns.
     *
     * @return the number of columns as int.
     */
    public int length() {
        return this.cols.size();
    }

    /**
     * To row string.
     *
     * @return the string
     */
    public String toRowString() {
        final StringBuilder stringBuffer = new StringBuilder();
        final Iterator<TableCell> tableRow = this.cols.iterator();
        if (tableRow.hasNext()) {
            stringBuffer.append(tableRow.next());
            while (tableRow.hasNext()) {
                stringBuffer.append(',');
                stringBuffer.append(tableRow.next());
            }
        }
        stringBuffer.append('\n');
        return stringBuffer.toString();
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
