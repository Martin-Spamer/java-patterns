
package coaching.generics;

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
        GenericTableCell<String> tableCell = new GenericTableCell<String>();
        assertNotNull(tableCell);
        String cellValue = "";
        assertEquals(cellValue, tableCell.setValue(cellValue).getValue());
        log.info("tableCell : {}", tableCell);
    }

}
