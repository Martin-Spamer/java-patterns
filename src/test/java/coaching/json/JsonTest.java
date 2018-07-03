
package coaching.json;

import java.math.BigDecimal;

import org.json.simple.JSONObject;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assume.assumeNotNull;

public class JsonTest {

    private static final Logger LOG = LoggerFactory.getLogger(JsonTest.class);

    @Test
    public void testNew() {
        final JSONObject json = new JSONObject();
        assumeNotNull(json);

        json.put("aString", "Alice");
        json.put("aInteger", new Integer(100));
        json.put("aBalance", new BigDecimal("12345678.90"));
        json.put("aBoolean", new Boolean(true));

        LOG.info("json = {}", json);
    }

}
