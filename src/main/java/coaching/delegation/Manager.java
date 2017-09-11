
package coaching.delegation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Manager Class with delegation.
 */
public class Manager implements ProcessInterface {
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
	 * Instantiates a new manager.
	 *
	 * worker
	 *
	 * @param worker the worker
	 */
	public Manager(final Worker worker) {
		super();
		setWorker(worker);
	}

	/**
	 * worker.
	 *
	 * worker manager
	 *
	 * @param worker the worker
	 * @return the manager
	 */
	public Manager setWorker(final Worker worker) {
		this.worker = worker;
		return this;
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
