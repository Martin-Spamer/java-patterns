
package coaching.generics;

import java.util.ArrayList;

/**
 * A Table composed of TableRows class.
 */
@SuppressWarnings("serial")
public class Table extends ArrayList<TableRow> {

    /**
     * Instantiates a new table.
     */
    public Table() {
        super();
    }

    public Table newRow(final String row) {
        add(new TableRow(row));
        return this;
    }

}
