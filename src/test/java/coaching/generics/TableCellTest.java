
package coaching.generics;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class TableCellTest {

    @Test
    public void testTableCell() {
        final TableCell tableCell = new TableCell("value");
        assertNotNull(tableCell);
    }

}
