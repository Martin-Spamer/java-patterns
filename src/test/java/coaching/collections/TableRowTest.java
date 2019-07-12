
package coaching.collections;

import org.junit.Test;

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
        log.info("{}", tableRow.toString());
    }

    /**
     * Unit test to table row.
     */
    @Test
    public void testTableRowString() {
        final TableRow tableRow = new TableRow("one");
        assertNotNull(tableRow);
        tableRow.addCell("two");
        log.info("{}", tableRow.toString());
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
        log.info("{}", tableRow.toRowString());
    }

    /**
     * test TableRow object.
     */
    @Test
    public void testTableRowArray() {
        String[] data = { "one", "two" };
        final TableRow tableRow = new TableRow(data);
        assertNotNull(tableRow);
        String[] moreData = { "three", "four" };
        tableRow.addCells(moreData);
        assertEquals(4, tableRow.length());
        log.info("{}", tableRow.toRowString());
    }

}
