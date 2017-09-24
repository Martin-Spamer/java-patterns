

package patterns.visitor;

import org.slf4j.*;

/**
 * Abstract Element Class.
 */
public abstract class AbstractElement implements ElementInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.visitor.ElementInterface#accept(patterns.visitor.
	 * VisitorInterface)
	 */
	@Override
	public abstract void accept(VisitorInterface visitor);

}
