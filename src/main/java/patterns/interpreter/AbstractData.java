
package patterns.interpreter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Abstract Data Class.
 */
public abstract class AbstractData implements DataInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
}
