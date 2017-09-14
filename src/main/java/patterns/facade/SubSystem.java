package patterns.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubSystem {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/**
	 * Operation.
	 */
	public void operation() {
		this.log.info("%s.operation", this.toString());
	}

	@Override
	public String toString() {
		return String.format("%s", this.getClass().getSimpleName());
	}

}
