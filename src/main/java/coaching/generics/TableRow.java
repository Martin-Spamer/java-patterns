
package coaching.generics;

import java.util.ArrayList;

/**
 * A TableRow composed of TableCells class.
 */
@SuppressWarnings("serial")
public class TableRow extends ArrayList<TableCell> {

    /**
     * Instantiates a new table row.
     */
    public TableRow() {
        super();
    }

    /**
     * Instantiates a new table row.
     *
     * @param row the row
     */
    public TableRow(final String row) {
        super();
        addCells(row);
    }

    /**
     * Adds the cells.
     *
     * @param row the row
     */
    private void addCells(final String row) {
        final String[] values = row.split(",");
        for (final String value : values) {
            add(new TableCell(value));
        }
    }
}
