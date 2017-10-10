

package patterns.decorator;

import org.slf4j.*;

/**
 * AbstractComponent Class.
 */
public abstract class AbstractComponent implements ComponentInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.decorator.ComponentInterface#operation()
	 */
	@Override
	public AbstractComponent operation() {
		log.info("%s", this.getClass().getSimpleName());
		return this;
	}

}
