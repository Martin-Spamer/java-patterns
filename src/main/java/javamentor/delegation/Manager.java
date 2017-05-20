
package javamentor.delegation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Manager Class with delegation
 */
public class Manager implements ProcessInterface {
	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private Worker worker;

	public Manager() {
		super();
		worker = new Worker();
	}

	public Manager(Worker worker) {
		super();
		setWorker(worker);
	}

	public Manager setWorker(Worker worker) {
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
