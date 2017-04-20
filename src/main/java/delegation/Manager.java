package delegation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Manager Class.
 */
class Manager implements ProcessInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	private Worker worker;

	/**
	 * Instantiates a new manager.
	 */
	public Manager() {
		super();
		worker = new Worker();
	}

	/**
	 * Sets the worker.
	 *
	 * @param worker the new worker
	 */
	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see delegation.ProcessInterface#doProcess()
	 */
	@Override
	public Manager doProcess() {
		worker.doProcess();
		return this;
	}

}
