
package coaching.template;

import org.slf4j.*;

/**
 * Abstract Template Class.
 */
public abstract class AbstractTemplate implements TemplateInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/**
	 * Template method provides common entry.
	 */
	public void templateMethod() {
		primitiveOperationAlice();
		primitiveOperationBob();
	}

	/**
	 * Primitive operation A.
	 *
	 * @return the template interface
	 */
	protected abstract TemplateInterface primitiveOperationAlice();

	/**
	 * Primitive operation B.
	 *
	 * @return the template interface
	 */
	protected abstract TemplateInterface primitiveOperationBob();
}
