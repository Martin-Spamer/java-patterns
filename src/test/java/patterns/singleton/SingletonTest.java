
package patterns.singleton;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Singleton Test class.
 */


/** The Constant 			log. */
@Slf4j
public final class SingletonTest {

    /**
     * Unit Test to singleton.
     */
    @Test
    public void testSingleton() {
        final Singleton instance = Singleton.getInstance();
        assertNotNull(instance);
        final String string = instance.toString();
        assertNotNull(instance);
        log.info(string);
    }

}
