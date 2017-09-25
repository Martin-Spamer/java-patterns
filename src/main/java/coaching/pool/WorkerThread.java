
package coaching.pool;

import org.slf4j.*;

/**
 * WorkerThread Class.
 */
public class WorkerThread implements Runnable {

	private static final Logger log = LoggerFactory.getLogger(WorkerThread.class);
	private static final int INTERVAL = 5000;
	private final String command;

	/**
	 * Instantiates a new worker thread.
	 *
	 * @param commandName the command name as String object.
	 */
	public WorkerThread(final String commandName) {
		this.command = commandName;
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
