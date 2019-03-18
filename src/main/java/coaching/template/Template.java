
package coaching.template;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Template {

    /** provide logging */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    protected StringBuffer template;

    public static Template from(final String filename) {
        return new Template(filename);
    }

    public static Template from(final InputStream stream) {
        return null;
    }

    protected Template() {
        this.template = new StringBuffer();
    }

    protected Template(final String string) {
        this.template = new StringBuffer(string);
    }

    public Template load(final String filename) {
        try {
            Path path = Paths.get(filename);
            Charset utf8 = StandardCharsets.UTF_8;
            byte[] bytes = Files.readAllBytes(path);
            this.template = new StringBuffer();
            this.template.append(bytes);
        } catch (IOException e) {
            this.log.error(e.getLocalizedMessage(), e);
        }
        return null;
    }

    public Template replace(final String target, final String replacement) {
        int startOfTarget = this.template.indexOf(replacement);
        int endOfTarget = startOfTarget + target.length();
        this.template.replace(startOfTarget, endOfTarget, replacement);
        return this;
    }

    public Template merge(final Map<String, Object> map) {
        if (map != null) {
            Set<String> keySet = map.keySet();
            for (String key : keySet) {
                Object object = map.get(key);
                String target = String.format("${%s}", key);
                String substitution = String.format("%s", object);
                replace(target, substitution);
            }
        }
        return this;
    }

    public Template merge(final Properties properties) {
        if (properties != null) {
            Set<String> keySet = properties.stringPropertyNames();
            for (String key : keySet) {
                Object object = properties.get(key);
                String target = String.format("${%s}", key);
                String substitution = String.format("%s", object);
                replace(target, substitution);
            }
        }
        return this;
    }

}
