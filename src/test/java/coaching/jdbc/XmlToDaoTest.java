
package coaching.jdbc;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test for XmlDAO class.
 */
@Ignore("Requires PointBase DB availability work-in-progress low-priority")


@Slf4j
public final class XmlToDaoTest {

    /**
     * Unit Test to xml DAO.
     */
    @Test
    public void testXmlDao() {
        final XmlToDao dao = new XmlToDao();
        assertNotNull(dao);
        log.info("dao : {}", dao.toString());
    }

}
