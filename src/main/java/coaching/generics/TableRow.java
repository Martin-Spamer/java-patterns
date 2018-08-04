
package coaching.generics;

import java.util.ArrayList;

/**
 * A TableRow composed of TableCells class.
 */
@SuppressWarnings("serial")
public class TableRow extends ArrayList<TableCell> {

    public TableRow() {
        super();
    }

    public TableRow(final String row) {
        super();
        addCells(row);
    }

    private void addCells(final String row) {
        final String[] values = row.split(",");
        for (final String value : values) {
            add(new TableCell(value));
        }
    }
}
