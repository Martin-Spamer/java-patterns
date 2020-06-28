
package coaching.json;

import org.json.simple.JSONObject;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AbstractJsonToCsv {

    private final JSONObject json;

    public AbstractJsonToCsv() {
        this.json = new JSONObject();
    }

    public AbstractJsonToCsv(final String source) {
        this.json = new JSONObject();
    }

    @Override
    public String toString() {
        return String.format("%s [json=%s]", this.getClass().getSimpleName(), this.json);
    }

}
