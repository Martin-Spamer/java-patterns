package javamentor.polymorphism;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractType {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	public AbstractType operation() {
		log.info("{}.operation", this.getClass().getSimpleName());
		return this;
	}

	@Override
	public String toString() {
		return String.format("%s", this.getClass().getSimpleName());
	}

}
