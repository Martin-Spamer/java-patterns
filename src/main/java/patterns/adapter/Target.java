


package patterns.adapter;

import org.slf4j.*;

/**
 * Target Class.
 */
public class Target implements TargetInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.adapter.TargetInterface#request()
	 */
	@Override
	public Result request() {
		log.info("request");
		return new Result();
	}

}
