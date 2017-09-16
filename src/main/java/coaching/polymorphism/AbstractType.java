package coaching.polymorphism;

import org.slf4j.*;

/**
 * An abstract Class providing a polymorphic base.
 */
public abstract class AbstractType implements TypeInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/* (non-Javadoc)
	 * @see coaching.polymorphism.TypeInterface#operation()
	 */
	@Override
	public TypeInterface operation() {
		log.info("{}.operation", this.getClass().getSimpleName());
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%s", this.getClass().getSimpleName());
	}

}
