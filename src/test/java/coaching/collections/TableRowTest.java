
package coaching.collections;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit test class for GenericTableRow.
 */
public class TableRowTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(TableRowTest.class);

    /**
     * Unit test to table row.
     */
    @Test
    public void testTableRow() {
        final TableRow tableRow = new TableRow();
        assertNotNull(tableRow);
        LOG.info("{}", tableRow);
    }

    /**
     * Unit test to table row.
     */
    @Test
    public void testTableRowString() {
        final TableRow tableRow = new TableRow("value");
        assertNotNull(tableRow);
        LOG.info("{}", tableRow);
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
        LOG.info("{}", tableRow);
    }

}
