
package patterns.singleton;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Static Singleton Test class.
 */


@Slf4j
public final class StaticSingletonTest {

    /**
     * Unit Test to get instance.
     */
    @Test
    public void testGetInstance() {
        final StaticSingleton instance = StaticSingleton.getInstance();
        assertNotNull(instance);
        final String string = instance.toString();
        assertNotNull(instance);
        log.info(string);
    }

}
