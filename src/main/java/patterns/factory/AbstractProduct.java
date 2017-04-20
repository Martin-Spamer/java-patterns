package patterns.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbstractProduct {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	public AbstractProduct() {
		super();
	}

}