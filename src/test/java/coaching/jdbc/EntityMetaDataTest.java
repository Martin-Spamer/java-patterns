
package coaching.jdbc;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test class for EntityMetaData.
 */



@Slf4j
public class EntityMetaDataTest {

    /**
     * Unit test to entity meta data.
     */
    @Ignore("wip")
    @Test
    public void testEntityMetaData() {
        final EntityMetaData entityMetaData = new EntityMetaData();
        assertNotNull(entityMetaData);
        entityMetaData.process();
        log.info("\tentityMetaData : {}", entityMetaData);
    }

}
