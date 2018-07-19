
package coaching.generics;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test class for TableCell.
 */
public class TableCellTest {

    /**
     * Unit test to table cell.
     */
    @Test
    public void testTableCell() {
        final TableCell tableCell = new TableCell("value");
        assertNotNull(tableCell);
    }

}
