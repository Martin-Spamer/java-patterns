
package coaching.generics;

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
        TableCell<String> tableCell = new TableCell<String>();
        assertNotNull(tableCell);
        String cellValue = "";
        assertEquals(cellValue, tableCell.setValue(cellValue).getValue());
        LOG.info("{}", tableCell);
    }

}
