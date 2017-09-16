/**
 *  @title       AbstractApplicationProcess.java
 *  @description TODO
 *  @author      martin.spamer.
 *  @version     0.1 - first release.
 *	Created      17-Sep-2004
 *
 **/

package coaching.thread;

/**
 * An Abstract Base Class for.
 *
 * @author martin.spamer
 * @version 0.1 - 16:13:19
 */
abstract public class AbstractApplicationProcess implements Runnable {
	private final java.lang.Thread thread;
	private long tick;
	private boolean exit = false;

	/**
	 * Thread.
	 */
	public AbstractApplicationProcess() {
		thread = new java.lang.Thread(this);
	}

	/**
	 * Thread running.
	 */
	public void start() {
		thread.start();
	}

	/**
	 * thread executes when it receives a time
	 * thread this function should simple exit.
	 */
	@Override
	public void run() {
		try {
			do {
				tick++;

				// A Run method MUST have either a sleep or yield to prevent deadlock.

				// Pause for 1 Second.
				Thread.sleep(1000); // Note sleep is static method.

				// Pause until I'm allowed to continue.
				Thread.yield(); // Note that yield is a static method.

				// * Thread ends if it runs for more than a minute.
				// alternatively I could throw a new InterruptedException
				if (tick >= 60) {
					exit = true;
				}

			} while (!exit);

		} catch (final InterruptedException exception) {
			exception.printStackTrace();
		}
	}

	/**
	 * Thread running.
	 */
	public void stop() {
		exit = true;
	}
}
