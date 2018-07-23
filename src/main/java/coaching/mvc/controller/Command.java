
package coaching.mvc.controller;

import java.util.Properties;

import coaching.mvc.CommandInterface;

/**
 * Command class.
 */
public class Command implements CommandInterface {

    /*
     * (non-Javadoc)
     * @see coaching.mvc.CommandInterface#execute(java.util.Properties)
     */
    @Override
    public Properties execute(final Properties parameters) {
        return parameters;
    }

}
