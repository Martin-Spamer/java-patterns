
package coaching.jdbc;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for PointbaseDao class.
 */
@Ignore("Requires PointBase DB availability")
public final class SqLiteDaoTest {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(SqLiteDaoTest.class);

    /** SQL to DROP the table. */
    static final String DROP_SQL = "DROP TABLE IF EXISTS customer";

    /** SQL to create the table. */
    static final String CREATE_SQL = "CREATE TABLE customer (id INTEGER, name STRING, details STRING)";

    /** SQL to count the number of rows in the table. */
    static final String COUNT_SQL = "SELECT (*) FROM customer";

    /** SQL to select all rows in the table. */
    static final String SELECT_SQL = "SELECT * FROM customer";

    /** SQL to insert a row in the table. */
    static final String INSERT_SQL = "INSERT INTO customer (ID, NAME, DATA) VALUES (999,'...','...')";

    /** SQL to update rows in the table. */
    static final String UPDATE_SQL = "UPDATE customer SET FIELD = 'Value' WHERE ID=999";

    /** SQL to delete rows in the table. */
    static final String DELETE_SQL = "DELETE FROM customer WHERE ID=999";

    @Test
    public void testSqLiteDao() throws ClassNotFoundException {
        final DaoInterface dao = new SqLiteDao();
        assertNotNull(dao);
        LOG.info(dao.toString());
    }

    @Test
    public void testTypical() throws Exception {
        SqLiteDao dao = new SqLiteDao();
        assertNotNull(dao);

        assertEquals(dao, dao.create(INSERT_SQL));
        assertEquals(dao, dao.read(SELECT_SQL));
        assertEquals(dao, dao.update(UPDATE_SQL));
        assertEquals(dao, dao.delete(DELETE_SQL));
    }
}
