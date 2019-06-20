
package coaching.collections;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests for the GenericTable class.
 */


/** The Constant 			log. */
@Slf4j
public final class TableTest {

    /**
     * Unit Test to table.
     */
    @Test
    public void testTable() {
        String tableName = "TableName";
        final Table table = new Table();
        assertNotNull(table);
        assertEquals(tableName, table.setName(tableName).getName());
        log.debug("{}", table);
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
        log.debug("{}", table);
    }

    /**
     * Unit Test to table rows.
     */
    @Test
    public void testAddTableRow() {
        final Table table = new Table();
        assertNotNull(table);
        log.debug("{}", table);
        final TableRow tableRow = new TableRow();
        assertNotNull(tableRow);
        table.addRow(tableRow);
        log.debug("{}", table);
    }

    /**
     * test Table object.
     */
    @Test
    public void testAddTableRowString() {
        final Table table = new Table();
        assertNotNull(table);
        log.debug("{}", table);
        final TableRow tableRow = new TableRow("one,two");
        assertNotNull(tableRow);
        table.addRow(tableRow);
        log.debug("{}", table);
    }

    /**
     * test Table object.
     */
    @Test
    public void testAddTableRowArray() {
        final Table table = new Table();
        assertNotNull(table);
        log.debug("{}", table);
        final TableRow tableRow = new TableRow();
        assertNotNull(tableRow);
        table.addRow(new String[] { "one", "two" });
        log.debug("{}", table);
    }

    /**
     * Unit Test to table rows.
     */
    @Test
    public void testAddTableRows() {
        final Table table = new Table();
        assertNotNull(table);
        log.debug("{}", table);
        final TableRow[] tableRows = { new TableRow(), new TableRow() };
        assertNotNull(tableRows);
        table.addRows(tableRows);
        log.debug("{}", table);
    }

    /**
     * Unit Test to table rows.
     */
    @Test
    public void testAddColumnName() {
        final Table table = new Table();
        assertNotNull(table);
        log.debug("{}", table);

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
        log.debug("{}", table);

        assertEquals(table, table.addColumn("ColOne"));
        assertEquals(table, table.addColumn("ColTwo", "ColThree"));
        assertEquals(table, table.addColumn(new String[] { "ColTwo", "ColThree" }));
    }
}
