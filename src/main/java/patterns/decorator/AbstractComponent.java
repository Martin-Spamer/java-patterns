package patterns.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The AbstractComponent Class.
 */
public abstract class AbstractComponent implements ComponentInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	abstract public void operation();

}
