
package coaching.jdbc;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public abstract class AbstractDto {

    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    protected HashMap<String, String> fields = new HashMap<String, String>();

    public void addField(final String keyValuePair) {
        String[] pair = keyValuePair.split("=");
        assertEquals(2, pair.length);
        String value = pair[1];
        String key = pair[0];
        addField(key, value);
    }

    public void addField(final String key, final String value) {
        fields.put(key, value);
    }

    public String get(final String key) {
        return fields.get(key);
    }

    public boolean containsKey(final String key) {
        return fields.containsKey(key);
    }

    @Override
    public String toString() {
        return String.format("%s [fields=%s]", this.getClass().getSimpleName(), fields);
    }

}
