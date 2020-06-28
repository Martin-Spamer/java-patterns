
package coaching.collections;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;



@Slf4j
public class TableColumnTest {

    /**
     * Unit test to table row.
     */
    @Test
    public void testTableColumn() {
        final TableColumn tableColumn = new TableColumn();
        assertNotNull(tableColumn);
        log.info("{}", tableColumn.toString());
    }

    /**
     * Unit test to table row.
     */
    @Test
    public void testTableColumnString() {
        final TableColumn tableColumn = new TableColumn("one");
        assertNotNull(tableColumn);
        tableColumn.addCell("two");
        log.info("{}", tableColumn.toString());
    }

    /**
     * Unit test to table row.
     */
    @Test
    public void testTableColumnStringString() {
        final TableColumn tableColumn = new TableColumn("one,two");
        assertNotNull(tableColumn);
        tableColumn.addCells("three,four");
        assertEquals(4, tableColumn.length());
        log.info("{}", tableColumn.toRowString());
    }

    /**
     * test TableColumn object.
     */
    @Test
    public void testTableColumnArray() {
        String[] data = { "one", "two" };
        final TableColumn tableColumn = new TableColumn(data);
        assertNotNull(tableColumn);
        String[] moreData = { "three", "four" };
        tableColumn.addCells(moreData);
        assertEquals(4, tableColumn.length());
        log.info("{}", tableColumn.toRowString());
    }

}
