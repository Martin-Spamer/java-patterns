
package coaching.generics;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test class for TableCell.
 */
public class TableCellTest {

    /** provides logging */
    private static final Logger LOG = LoggerFactory
        .getLogger(TableCellTest.class);

    @Test
    public void testTableCell() {
        final TableCell tableCell = new TableCell();
        assertNotNull(tableCell);
        LOG.info("{}", tableCell.toString());
    }

    /**
     * Unit test to table cell.
     */
    @Test
    public void testTableCellString() {
        final TableCell tableCell = new TableCell("value");
        assertNotNull(tableCell);
        LOG.info("{}", tableCell.toString());
    }

}
