
package coaching.rules;

import java.util.Properties;

import coaching.context.AbstractContext;
import lombok.extern.slf4j.Slf4j;

/**
 * Context Class.
 */
@Slf4j
public class Context extends AbstractContext {

    /**
     * Instantiates a new context.
     *
     * @param properties the properties
     */
    public Context(final Properties properties) {
        super(properties);
    }

}
