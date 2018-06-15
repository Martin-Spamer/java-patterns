
package coaching.collections;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * class TableTest.
 */
public class TableTest {

    /** The Constant LOG. */
    private static final Logger LOG = LoggerFactory.getLogger(TableTest.class);

    /**
     * Unit Test to typical usage.
     */
    @Test
    public void testTypicalUsage() {
        final Table table = new Table();
        assertNotNull(table);

        table.addCols("ColOne", "ColTwo");
        table.addRow("ValueOne", "ValueTwo");

        LOG.info("{}", table.toCsvString());
    }

    /**
     * Unit Test to table.
     */
    @Test
    public void testTable() {
        final Table table = new Table();
        assertNotNull(table);
        LOG.info("{}", table.toString());
    }

    /**
     * Unit Test to table string.
     */
    @Test
    public void testTableString() {
        final Table table = new Table("TableName");
        assertNotNull(table);
        LOG.info("{}", table.toString());
    }

    /**
     * Unit Test to table rows.
     */
    @Test
    public void testTableRows() {
        final Table table = new Table();
        assertNotNull(table);
        final TableRow tableRow = new TableRow();
        assertNotNull(tableRow);
        table.add(tableRow);
        LOG.info("{}", table.toString());
    }

}
