
package coaching.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

/**
 * A GenericTableRow class composed of GenericTableCell classes.
 *
 * @param <T> the generic type
 */


@Slf4j
public class GenericTableRow<T> {

    /** the columns in the row. */
    private final List<GenericTableCell<T>> cols = new ArrayList<>();

    /**
     * Instantiates a new table row.
     */
    public GenericTableRow() {
        super();
    }

    /**
     * Instantiates a new table row.
     *
     * @param values the values
     */
    public GenericTableRow(final String values) {
        super();
        addCells(values.split(","));
    }

    /**
     * Instantiates a new table row.
     *
     * @param values the values
     */
    @SafeVarargs
    public GenericTableRow(final T... values) {
        super();
        addCells(values);
    }

    /**
     * Adds the cells.
     *
     * @param values the values
     * @return the generic table row
     */
    public GenericTableRow<T> addCells(final String values) {
        return addCells(values.split(","));
    }

    /**
     * Adds the cells.
     *
     * @param values the values
     * @return the generic table row
     */
    public GenericTableRow<T> addCells(final String[] values) {
        for (final String value : values) {
            final GenericTableCell<T> cell = new GenericTableCell<T>().setValue((T) value);
            this.cols.add(cell);
        }
        return this;
    }

    /**
     * Adds the cells.
     *
     * @param values the strings
     * @return the table row
     */
    public GenericTableRow<T> addCells(final T... values) {
        for (final T value : values) {
            addCell(value);
        }
        return this;
    }

    /**
     * Adds the cell.
     *
     * @param value the value
     * @return the generic table row
     */
    public GenericTableRow<T> addCell(final T value) {
        final GenericTableCell<T> cell = new GenericTableCell<T>().setValue(value);
        this.cols.add(cell);
        return this;
    }

    /**
     * Length.
     *
     * @return the int
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
        final Iterator<GenericTableCell<T>> tableRow = this.cols.iterator();
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
