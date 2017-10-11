
package patterns.proxy;

import org.slf4j.*;

/**
 * Subject Class.
 */
public abstract class AbstractSubject implements SubjectInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/* (non-Javadoc)
	 * @see patterns.proxy.SubjectInterface#request()
	 */
	@Override
	public abstract void request();

}
