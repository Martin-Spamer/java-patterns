
package coaching.collections;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for Table class.
 */
public final class TableTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(TableTest.class);

    /**
     * Unit Test to typical usage.
     */
    @Test
    public void testTypicalUsage() {
        // Given
        final Table table = new Table();
        assertNotNull(table);

        // When we add columns and rows.
        table.addColNames("ColOne", "ColTwo");
        table.addColNames("ColThree", "ColFour");
        table.addRow("ValueOne", "ValueTwo");

        table.addRow("one,two");

        // Then we can produce a table as csv.
        final String csvString = table.toCsvString();
        LOG.debug(csvString);
    }

    /**
     * Unit Test to table.
     */
    @Test
    public void testTable() {
        final Table table = new Table();
        assertNotNull(table);
        LOG.debug("{}", table);
    }

    /**
     * Unit Test to table string.
     */
    @Test
    public void testTableString() {
        final Table table = new Table("TableName");
        assertNotNull(table);
        LOG.debug("{}", table);
    }

    /**
     * Unit Test to table rows.
     */
    @Test
    public void testTableRows() {
        final Table table = new Table();
        assertNotNull(table);
        LOG.debug("{}", table);

        final TableRow tableRow = new TableRow();
        assertNotNull(tableRow);
        tableRow.addCells("one,two");
        tableRow.addCells("three", "four");
        table.add(tableRow);

        LOG.debug("{}", table);
    }

}
