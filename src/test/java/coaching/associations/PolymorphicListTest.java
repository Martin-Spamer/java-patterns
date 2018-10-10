
package coaching.associations;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * class PolymorphicListTest.
 */
public final class PolymorphicListTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(PolymorphicListTest.class);

    /**
     * Unit Test to polymorphic list.
     */
    @Test
    public void testPolymorphicList() {
        LOG.info("testPolymorphicList");
        final AggregatePolymorphicList polymorphicList = new AggregatePolymorphicList();
        assertNotNull(polymorphicList);
        polymorphicList.execute();
        LOG.info(polymorphicList.toString());
    }

    /**
     * Unit Test to add.
     */
    @Test
    public void testAdd() {
        LOG.info("testAdd");
        final AggregatePolymorphicList polymorphicList = new AggregatePolymorphicList();
        assertNotNull(polymorphicList);
        assertEquals(polymorphicList, polymorphicList.add(new Alice()));
        assertEquals(polymorphicList, polymorphicList.add(new Bob()));
        assertEquals(polymorphicList, polymorphicList.add(new Charlie()));
        assertEquals(polymorphicList, polymorphicList.execute());
        LOG.info(polymorphicList.toString());
    }

}
