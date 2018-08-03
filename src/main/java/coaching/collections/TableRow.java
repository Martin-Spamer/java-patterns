
package coaching.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A TableRow class composed of TableCell classes.
 */
public class TableRow {

    /** provides logging. */
    protected final Logger log = LoggerFactory
        .getLogger(this.getClass().getSimpleName());

    /** the columns in the row */
    private final List<TableCell> cols = new ArrayList<>();

    public TableRow() {
        super();
    }

    /**
     * Instantiates a new table row.
     *
     * @param values
     *            the values
     */
    public TableRow(final String... values) {
        super();
        addCells(values);
    }

    public void addCells(final String... strings) {
        for (String string : strings) {
            addCells(string);
        }
    }

    public void addCells(final String string) {
        String[] tuple = string.split(",");
        for (String value : tuple) {
            TableCell cell = new TableCell(value);
            this.cols.add(cell);
        }
    }

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

    public String debugString() {
        return String
            .format("%s [cols=%s]",
                    this.getClass().getSimpleName(),
                    Collections.singletonList(this.cols));
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
