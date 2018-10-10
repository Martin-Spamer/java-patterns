
package coaching.generics;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test class for Table.
 */
public class TableTest {

    /**  provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(TableTest.class);

    /**
     * Unit test to table.
     */
    @Test
    public void testTable() {
        Table table = new Table();
        assertNotNull(table);
        LOG.info("{}", table);
    }

    /**
     * Unit test to table row.
     */
    @Test
    public void testTableRow() {
        TableRow row = new TableRow();
        assertNotNull(row);
        LOG.info("{}", row);
    }

    /**
     * Unit test to table cell.
     */
    @Test
    public void testTableCell() {
        TableCell cell = new TableCell();
        assertNotNull(cell);
        LOG.info("{}", cell);
    }
}
