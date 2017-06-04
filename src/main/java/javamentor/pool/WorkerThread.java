package javamentor.pool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The WorkerThread Class.
 */
public class WorkerThread implements Runnable {

	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(WorkerThread.class);

	/** The Constant INTERVAL. */
	private static final int INTERVAL = 5000;

	/** The command. */
	private final String command;

	/**
	 * Instantiates a new worker thread.
	 *
	 * @param s the s
	 */
	public WorkerThread(final String s) {
		this.command = s;
	}

	/**
	 * Process command.
	 */
	private void processCommand() {
		try {
			// Simulate some work
			Thread.sleep(WorkerThread.INTERVAL);
		} catch (final InterruptedException e) {
			Thread.currentThread().interrupt();
			log.error(e.toString());
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		final String name = Thread.currentThread().getName();
		WorkerThread.log.info("{}:{}", name, this.command);
		processCommand();
		WorkerThread.log.info("{}:exit", name);
	}

}
