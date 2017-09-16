package patterns.iterator;

import org.slf4j.*;

public abstract class AbstractAggregate {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	public void createIterator() {
		log.info("%s.createIterator()", this.getClass().getSimpleName());
	}

}
