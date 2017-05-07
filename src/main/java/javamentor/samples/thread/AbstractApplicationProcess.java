/**
 *  @title       AbstractApplicationProcess.java
 *  @description TODO
 *  @author      martin.spamer.
 *  @version     0.1 - first release.
 *	Created      17-Sep-2004
 *
 **/

package javamentor.samples.thread;

/**
 * An Abstract Base Class for
 * @author martin.spamer
 * @version 0.1 - 16:13:19
 **/
abstract public class AbstractApplicationProcess implements Runnable {
	private final java.lang.Thread thread;
	private long tick;
	private boolean exit = false;

	/**
	 * Constructor for the Thread.
	 */
	public AbstractApplicationProcess() {
		this.thread = new java.lang.Thread(this);
	}

	/**
	 * Start the Thread running
	 */
	public void start() {
		this.thread.start();
	}

	/**
	 * The run function is what the thread executes when it receives a time
	 * slice. to halt the thread this function should simple exit.
	 */
	@Override
	public void run() {
		try {
			do // Some processing.
			{
				this.tick++;
				System.out.println(this.getClass().getName() + "." + this.thread.getName() + "("
				        + this.thread.getPriority() + ")" + ".tick= " + this.tick);

				// A Run method MUST have either a sleep or yield to prevent
				// deadlock.

				// Pause for 1 Second.
				java.lang.Thread.sleep(1000); // Note sleep is static method.

				// Pause until I'm allowed to continue.
				java.lang.Thread.yield(); // Note that yield is a static method.

				// lets just make sure the Thread ends if it runs for more than
				// a minute.
				// alternatively I could throw a new InterruptedException
				if (this.tick >= 60) {
					this.exit = true;
				}

			} while (!this.exit);

		} catch (final InterruptedException exception) {
			exception.printStackTrace();
		}
	}

	/**
	 * Stop the Thread running
	 */
	public void stop() {
		this.exit = true;
	}
}
