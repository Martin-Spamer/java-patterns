
package coaching.collections;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for the GenericTable class.
 */
public final class TableTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(TableTest.class);

    /**
     * Unit Test to table.
     */
    @Test
    public void testTable() {
        String tableName = "TableName";
        final Table table = new Table();
        assertNotNull(table);
        assertEquals(tableName, table.setName(tableName).getName());
        LOG.debug("{}", table);
    }

    /**
     * Unit Test to table string.
     */
    @Test
    public void testTableString() {
        String tableName = "TableName";
        final Table table = new Table(tableName);
        assertNotNull(table);
        assertEquals(tableName, table.getName());
        LOG.debug("{}", table);
    }

    /**
     * Unit Test to table rows.
     */
    @Test
    public void testAddTableRow() {
        final Table table = new Table();
        assertNotNull(table);
        LOG.debug("{}", table);
        final TableRow tableRow = new TableRow();
        assertNotNull(tableRow);
        table.addRow(tableRow);
        LOG.debug("{}", table);
    }

    /**
     * Unit Test to table rows.
     */
    @Test
    public void testAddTableRows() {
        final Table table = new Table();
        assertNotNull(table);
        LOG.debug("{}", table);
        final TableRow[] tableRows = { new TableRow(), new TableRow() };
        assertNotNull(tableRows);
        table.addRows(tableRows);
        LOG.debug("{}", table);
    }

    /**
     * Unit Test to table rows.
     */
    @Test
    public void testAddColumnName() {
        final Table table = new Table();
        assertNotNull(table);
        LOG.debug("{}", table);

        assertEquals(table, table.addColumnName("ColOne"));
        assertEquals(table, table.addColumnNames("ColTwo", "ColThree"));
        assertEquals(table, table.addColumnNames(new String[] { "ColTwo", "ColThree" }));
    }

    /**
     * Unit Test to table rows.
     */
    @Test
    public void testAddTableColumn() {
        final Table table = new Table();
        assertNotNull(table);
        LOG.debug("{}", table);

        assertEquals(table, table.addColumn("ColOne"));
        assertEquals(table, table.addColumn("ColTwo", "ColThree"));
        assertEquals(table, table.addColumn(new String[] { "ColTwo", "ColThree" }));
    }
}
