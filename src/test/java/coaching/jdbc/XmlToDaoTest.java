
package coaching.jdbc;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test for XmlDAO class.
 */
@Ignore("Requires PointBase DB availability work-in-progress low-priority")
public final class XmlToDaoTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(XmlToDaoTest.class);

    /**
     * Unit Test to xml DAO.
     */
    @Test
    public void testXmlDao() {
        final XmlToDao dao = new XmlToDao();
        assertNotNull(dao);
        LOG.info("dao : {}", dao.toString());
    }

}
