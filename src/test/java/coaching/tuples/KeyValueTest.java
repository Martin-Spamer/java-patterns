
package coaching.tuples;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test class for KeyValue.
 */
public class KeyValueTest {

    /** LOG 			constant. */
    private static final Logger LOG = LoggerFactory
        .getLogger(KeyValueTest.class);

    /**
     * Unit test to key value.
     */
    @Test
    public void testKeyValue() {
        final String key = new String();
        final Boolean value = true;
        final KeyValue<String, Boolean> keyValue = new KeyValue<String, Boolean>(
                key, value);
        assertNotNull(keyValue);
        LOG.info("{}", keyValue);
    }

}
