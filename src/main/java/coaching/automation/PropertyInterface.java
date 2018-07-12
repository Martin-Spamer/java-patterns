
package coaching.automation;

import java.io.InputStream;
import java.io.OutputStream;

public interface PropertyInterface {

    PropertyInterface setProperty(final String key, final String value);

    String getProperty(final String key, final String defaultValue);

    String getProperty(final String key);

    int size();

    PropertyInterface load(final InputStream inputStream) throws Exception;

    PropertyInterface loadFromXML(final InputStream inputStream) throws Exception;

    PropertyInterface store(final OutputStream outStream) throws Exception;

    PropertyInterface store(final OutputStream outStream, final String comment) throws Exception;
}
