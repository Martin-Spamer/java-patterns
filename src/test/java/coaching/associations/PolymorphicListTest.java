
package coaching.associations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * class PolymorphicListTest.
 */

/** The Constant 			log. */
@Slf4j
public final class PolymorphicListTest {

    /**
     * Unit Test to polymorphic list.
     */
    @Test
    public void testPolymorphicList() {
        log.info("testPolymorphicList");
        final AggregatePolymorphicList polymorphicList = new AggregatePolymorphicList();
        assertNotNull(polymorphicList);
        polymorphicList.execute();
        log.info(polymorphicList.toString());
    }

    /**
     * Unit Test to add.
     */
    @Test
    public void testAdd() {
        log.info("testAdd");
        final AggregatePolymorphicList polymorphicList = new AggregatePolymorphicList();
        assertNotNull(polymorphicList);
        assertEquals(polymorphicList, polymorphicList.add(new Alice()));
        assertEquals(polymorphicList, polymorphicList.add(new Bob()));
        assertEquals(polymorphicList, polymorphicList.add(new Charlie()));
        assertEquals(polymorphicList, polymorphicList.execute());
        log.info(polymorphicList.toString());
    }

}
