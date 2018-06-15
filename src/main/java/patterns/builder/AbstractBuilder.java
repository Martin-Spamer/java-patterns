
package patterns.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AbstractBuilder Class.
 */
public abstract class AbstractBuilder implements BuilderInterface {

    /** The log. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /*
     * (non-Javadoc)
     *
     * @see patterns.builder.BuilderInterface#build()
     */
    @Override
    public abstract Part build();

}
