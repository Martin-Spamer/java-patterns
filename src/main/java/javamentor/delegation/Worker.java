package javamentor.delegation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Worker Class.
 */
class Worker implements ProcessInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/*
	 * (non-Javadoc)
	 *
	 * @see delegation.ProcessInterface#doProcess()
	 */
	@Override
	public Worker doProcess() {
		System.out.println("do work");
		return this;
	}
}
