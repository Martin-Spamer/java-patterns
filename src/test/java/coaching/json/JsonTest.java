
package coaching.json;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Properties;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Test;

import static org.junit.Assume.assumeNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests showing Json examples.
 */


/** The Constant 			log. */
@Slf4j
public final class JsonTest {

    /**
     * Unit test to new.
     */
    @Test
    public void testNew() {
        final JSONObject json = new JSONObject();
        assumeNotNull(json);

        json.put("aString", "Alice");
        json.put("aInteger", new Integer(100));
        json.put("aBalance", new BigDecimal("12345678.90"));
        json.put("aBoolean", new Boolean(true));

        log.info(json.toString());
    }

    /**
     * Unit test to system.
     */
    @Test
    public void testSystem() {
        final JSONObject json = new JSONObject();
        assumeNotNull(json);
        final Properties properties = System.getProperties();

        final Set<Object> keySet = properties.keySet();
        for (final Object key : keySet) {
            final String keyString = key.toString();
            final String property = System.getProperty(keyString);
            json.put(keyString, property);
        }

        log.info(json.toString());
    }

    /**
     * Unit test to.
     */
    @Test
    public void test() {
        final JSONObject json = new JSONObject();
        json.put("name", "Alice");
        json.put("email", "alice@example.com");

        final JSONArray list = new JSONArray();
        list.add("value-1");
        list.add("value-2");
        list.add("value-3");

        json.put("list", list);

        write(json);

        log.info(json.toString());

    }

    /**
     * Write.
     *
     * @param json the json
     */
    private void write(final JSONObject json) {
        try (FileWriter file = new FileWriter("./target/test.json")) {

            file.write(json.toJSONString());
            file.flush();

        } catch (final IOException e) {
            e.printStackTrace();
        }
    }
}
