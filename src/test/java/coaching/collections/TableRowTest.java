
package coaching.collections;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test class for GenericTableRow.
 */
@Slf4j
public class TableRowTest {

    /**
     * Unit test to table row.
     */
    @Test
    public void testTableRow() {
        final TableRow tableRow = new TableRow();
        assertNotNull(tableRow);
        log.info("{}", tableRow);
    }

    /**
     * Unit test to table row.
     */
    @Test
    public void testTableRowString() {
        final TableRow tableRow = new TableRow("value");
        assertNotNull(tableRow);
        log.info("{}", tableRow);
    }

    /**
     * Unit test to table row.
     */
    @Test
    public void testTableRowStringString() {
        final TableRow tableRow = new TableRow("one,two");
        assertNotNull(tableRow);
        tableRow.addCells("three,four");
        assertEquals(4, tableRow.length());
        log.info("{}", tableRow);
    }

}
