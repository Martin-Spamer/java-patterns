package patterns.iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractAggregate {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	public void createIterator() {
		this.log.info("%s.createIterator()", this.getClass().getSimpleName());
	}

}
