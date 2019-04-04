
package coaching.tuples;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test class for KeyValue.
 */
@Slf4j
public class KeyValueTest {

    /**
     * Unit test to key value.
     */
    @Test
    public void testKeyValue() {
        final String key = new String();
        final Boolean value = true;
        final KeyValue<String, Boolean> keyValue = new KeyValue<String, Boolean>(key, value);
        assertNotNull(keyValue);
        log.info("{}", keyValue);
    }

}
