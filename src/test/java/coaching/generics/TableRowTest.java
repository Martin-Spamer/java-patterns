
package coaching.generics;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test class for TableRow.
 */
public class TableRowTest {

    /** provides logging */
    private static final Logger LOG = LoggerFactory
        .getLogger(TableRowTest.class);

    /**
     * Unit test to table row.
     */
    @Test
    public void testTableRow() {
        TableRow tableRow = new TableRow();
        assertNotNull(tableRow);
        LOG.info("{}", tableRow.toString());
    }

    /**
     * Unit test to table row.
     */
    @Test
    public void testTableRowString() {
        TableRow tableRow = new TableRow("value");
        assertNotNull(tableRow);
        LOG.info("{}", tableRow.toString());
    }

    /**
     * Unit test to table row.
     */
    @Test
    public void testTableRowStringString() {
        TableRow tableRow = new TableRow("one,two");
        assertNotNull(tableRow);
        LOG.info("{}", tableRow.toString());
    }

}
