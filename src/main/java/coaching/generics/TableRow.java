
package coaching.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A TableRow class composed of TableCell classes.
 *
 * @param <T> the generic type
 */
public class TableRow<T> {

    /** provides logging. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /** the columns in the row. */
    private final List<TableCell<T>> cols = new ArrayList<>();

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
        // addCells(values);
    }

    /**
     * Instantiates a new table row.
     *
     * @param values the values
     */
    @SafeVarargs
    public TableRow(final T... values) {
        super();
        // addCells(values);
    }

    /**
     * Adds the cells.
     *
     * @param values the string
     * @return the table row
     */
    public TableRow<T> addCells(final String values) {
        final String[] tuple = values.split(",");
        for (final String value : tuple) {
            final TableCell<T> cell = new TableCell<T>().setValue((T) value);
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
    public TableRow<?> addCells(final T... values) {
        for (final T value : values) {
            addCells(value);
        }
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
        final Iterator<TableCell<T>> tableRow = this.cols.iterator();
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
