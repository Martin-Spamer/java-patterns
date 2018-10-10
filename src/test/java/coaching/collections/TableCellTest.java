
package coaching.collections;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit test class for TableCell.
 */
public class TableCellTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(TableCellTest.class);

    /**
     * Unit test to table cell.
     */
    @Test
    public void testTableCell() {
        final TableCell tableCell = new TableCell();
        assertNotNull(tableCell);
        LOG.info("{}", tableCell);
    }

    /**
     * Unit test to table cell.
     */
    @Test
    public void testTableCellString() {
        final TableCell tableCell = new TableCell("value");
        assertNotNull(tableCell);
        LOG.info("{}", tableCell);
        assertEquals("new", tableCell.setValue("new").getValue());
        LOG.info("{}", tableCell);
    }

}
