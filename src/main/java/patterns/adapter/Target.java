package patterns.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Target implements TargetInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	public Result request() {
		this.log.info("request");
		return new Result();
	}

}
