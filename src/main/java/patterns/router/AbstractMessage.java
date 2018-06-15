
package patterns.router;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * class AbstractMessage.
 */
public abstract class AbstractMessage implements MessageInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

}
