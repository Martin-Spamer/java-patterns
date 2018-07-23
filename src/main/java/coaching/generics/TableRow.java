
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
        String[] values = row.split(",");
        for (String value : values) {
            add(new TableCell(value));
        }
    }
}
