/**
 *  @title			AbstractProcess.java
 *  @description	TODO
 *  @author			martin.spamer.
 *  @version		0.1 - first release.
 *	Created			17-Sep-2004 - 16:13:19
 *
 **/

package coaching.thread;

import org.slf4j.*;

/**
 * An abstract base class for an Application.
 */
public abstract class AbstractProcess implements Runnable {
	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private final Thread thread;
	private long tick;
	private boolean exit = false;

	/**
	 * AbstractProcess.
	 */
	public AbstractProcess() {
		log.info("AbstractProcess()", this.getClass().getSimpleName());
		thread = new Thread(this);
	}

	/**
	 * Start the thread running.
	 */
	public void start() {
		log.info("{}.start()", this.getClass().getSimpleName());
		thread.start();
	}

	/**
	 * thread executes when it receives a time
	 * thread this function should simple exit.
	 */
	@Override
	public void run() {
		log.info("{}.run", this.getClass().getSimpleName());
		try {
			do {
				// A Run method MUST have either a sleep or yield to prevent deadlock.

				// Pause for 1 Second.
				Thread.sleep(1000); // Note sleep is static method.

				// Pause until I'm allowed to continue.
				Thread.yield(); // Note that yield is a static method.

				// Thread ends if it runs more than a ten times.
				// alternatively I could throw a new InterruptedException
				tick++;
				if (tick >= 10) {
					exit = true;
				}

				log.info("tick={}", tick);
			} while (!exit);

		} catch (final InterruptedException exception) {
			log.error("{}", exception.toString());
		}
		log.info("{}.ending", this.getClass().getSimpleName());
	}

	/**
	 * Stop the thread running.
	 */
	public void stop() {
		log.info("{}.stop()", this.getClass().getSimpleName());
		exit = true;
	}
}
