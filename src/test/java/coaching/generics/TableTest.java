
package coaching.generics;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit test class for Table.
 */
public class TableTest {

    /** provides logging */
    private static final Logger LOG = LoggerFactory.getLogger(TableTest.class);

    /**
     * Unit test to table.
     */
    @Test
    public void testTable() {
        final Table table = new Table();
        assertNotNull(table);
        LOG.info("{}", table);
        assertEquals(table, table.newRow("one,two"));
    }

}
