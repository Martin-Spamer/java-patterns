
package coaching.collections;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test class for GenericTableCell.
 */


/** The Constant 			log. */
@Slf4j
public class TableCellTest {

    /**
     * Unit test to table cell.
     */
    @Test
    public void testTableCell() {
        final TableCell tableCell = new TableCell();
        assertNotNull(tableCell);
        log.info("{}", tableCell);
    }

    /**
     * Unit test to table cell.
     */
    @Test
    public void testTableCellString() {
        final TableCell tableCell = new TableCell("value");
        assertNotNull(tableCell);
        log.info("{}", tableCell);
        String newValue = "newValue";
        assertEquals(newValue, tableCell.setValue(newValue).getValue());
        log.info("{}", tableCell);
    }
}
