
package patterns.strategy;

import java.util.Properties;

import coaching.context.AbstractContext;
import lombok.extern.slf4j.Slf4j;

/**
 * Context Class.
 */

/** log 			constant. */
@Slf4j
public final class Context extends AbstractContext {

    /**
     * Instantiates a new context.
     */
    public Context() {
        super(new Properties());
    }

    /**
     * Instantiates a new context.
     *
     * @param properties the properties
     */
    public Context(final Properties properties) {
        super(properties);
    }
}
