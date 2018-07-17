
package coaching.jdbc;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

public class EntityMetaDataTest {

    private static final Logger LOG = LoggerFactory
        .getLogger(EntityMetaDataTest.class);

    @Test
    public void testEntityMetaData() {
        final EntityMetaData entityMetaData = new EntityMetaData();
        assertNotNull(entityMetaData);
        entityMetaData.process();
        LOG.info("{}", entityMetaData);
    }

}
