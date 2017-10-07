

package patterns.builder;

import org.slf4j.*;

/**
 * AbstractBuilder Class.
 */
public abstract class AbstractBuilder implements BuilderInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.builder.BuilderInterface#build()
	 */
	@Override
	public abstract Part build();

}
