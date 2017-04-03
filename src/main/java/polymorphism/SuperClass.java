
package polymorphism;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class SuperClass.
 */
public abstract class SuperClass implements PolymorphicInterface {

	/** The log. */
	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/**
	 * Do process.
	 */
	public abstract void doProcess();
}
