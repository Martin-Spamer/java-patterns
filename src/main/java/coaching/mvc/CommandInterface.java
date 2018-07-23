
package coaching.mvc;

import java.util.Properties;

/**
 * Command Interface.
 */
public interface CommandInterface {

    /**
     * Execute.
     *
     * @param parameters the parameters
     * @return the properties
     */
    public Properties execute(Properties parameters);
}
