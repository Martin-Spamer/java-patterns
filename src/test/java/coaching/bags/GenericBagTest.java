
package coaching.bags;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import coaching.generics.GenericBag;
import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests for GenericBag class.
 */



@Slf4j
public final class GenericBagTest {

    /** VALUES Constants. */
    private static final String[] VALUES = { "Heads", "Tails" };

    /**
     * Unit Test to generic bag.
     */
    @Test
    public void testGenericBag() {
        log.info("testGenericBag()");
        final GenericBag<String> genericBag = new GenericBag<>();
        assertNotNull(genericBag);
        log.debug("genericBag = {}", genericBag);
    }

    /**
     * Unit Test to generic bag null.
     */
    @Test
    public void testGenericBagNull() {
        log.info("testGenericBagNull()");
        final GenericBag<String> genericBag = new GenericBag<String>((String[]) null);
        assertNotNull(genericBag);
        log.debug("genericBag = {}", genericBag);
    }

    /**
     * Unit Test to generic bag string array.
     */
    @Test
    public void testGenericBagStringArray() {
        log.info("testGenericBagStringArray()");
        final GenericBag<String> genericBag = new GenericBag<>(VALUES);
        assertNotNull(genericBag);
        log.debug("genericBag = {}", genericBag);
    }

    /**
     * Unit Test to generic bag vargs.
     */
    @Test
    public void testGenericBagVargs() {
        log.info("testGenericBagVargs()");
        final GenericBag<String> genericBag = new GenericBag<>("Heads", "Tails");
        assertNotNull(genericBag);
        log.debug("genericBag = {}", genericBag);
    }

    /**
     * Unit Test to generic bag T array.
     */
    @Test
    public void testGenericBagTArray() {
        log.info("testGenericBagTArray()");
        final GenericBag<Boolean> genericBag = new GenericBag<>(true, false);
        assertNotNull(genericBag);
        log.debug("genericBag = {}", genericBag);
    }

    /**
     * Unit Test to fill vargs.
     */
    @Test
    public void testFillVargs() {
        log.info("testFillVargs()");
        final GenericBag<String> genericBag = new GenericBag<>();
        assertNotNull(genericBag);
        genericBag.fill("Heads", "Tails");
        log.debug("genericBag = {}", genericBag);
    }

    /**
     * Unit Test to fill null.
     */
    @Test
    public void testFillNull() {
        log.info("testFillNull()");
        final GenericBag<String> genericBag = new GenericBag<>();
        assertNotNull(genericBag);
        genericBag.fill((String[]) null);
        log.debug("genericBag = {}", genericBag);
    }

    /**
     * Unit Test to fill string array.
     */
    @Test
    public void testFillStringArray() {
        log.info("testFillStringArray()");
        final GenericBag<String> genericBag = new GenericBag<>();
        assertNotNull(genericBag);
        genericBag.fill(VALUES);
        log.debug("genericBag = {}", genericBag);
    }

    /**
     * Unit Test to pick.
     */
    @Test
    public void testPick() {
        log.info("testPick()");
        final GenericBag<String> genericBag = new GenericBag<>("Heads", "Tails");
        assertNotNull(genericBag);
        log.debug("genericBag = {}", genericBag.pick());
    }

    /**
     * Unit Test to choose.
     */
    @Test
    public void testChoose() {
        log.info("testChoose()");
        final GenericBag<String> genericBag = new GenericBag<>("Heads", "Tails");
        assertNotNull(genericBag);
        log.debug("genericBag = {}", genericBag.choose());
    }

    /**
     * Unit Test to add T.
     */
    @Test
    public void testAddT() {
        log.info("testAddT()");
        final GenericBag<String> genericBag = new GenericBag<>("Heads", "Tails");
        assertNotNull(genericBag);
        genericBag.add("Edge");
        log.trace("genericBag.choose() = {}", genericBag.choose());
        log.trace("genericBag.choose() = {}", genericBag.choose());
        log.trace("genericBag.choose() = {}", genericBag.choose());
        log.trace("genericBag.choose() = {}", genericBag.choose());
    }

    /**
     * Unit Test to reset.
     */
    @Test
    public void testReset() {
        log.info("testReset()");
        final GenericBag<String> genericBag = new GenericBag<>("Heads", "Tails");
        assertNotNull(genericBag);
        log.debug("genericBag = {}", genericBag);
        log.trace("genericBag.choose() = {}", genericBag.choose());
        log.trace("genericBag.choose() = {}", genericBag.choose());
        genericBag.reset();
        log.debug("genericBag = {}", genericBag);
        log.trace("genericBag.choose() = {}", genericBag.choose());
        log.trace("genericBag.choose() = {}", genericBag.choose());
    }

}
