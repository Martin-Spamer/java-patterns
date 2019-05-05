
package coaching.wip;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests showing retrieval of system properties.
 */


@Slf4j
public final class EnvironmentTest {

    /**
     * Unit test to log system properties.
     */
    @Test
    public void testLogSystemProperties() {
        log.info("SystemProperties = {}", System.getProperties());
    }

}
