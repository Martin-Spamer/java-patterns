
package coaching.thread;

import lombok.extern.slf4j.Slf4j;

/**
 *
 * An abstract base class for an ThreadedApplication.
 *
 * @author martin.spamer.
 * @version 0.1 - first release. Created 17-Sep-2004 - 16:13:19
 */



@Slf4j
public abstract class AbstractProcess implements Runnable {

    /** MAX_TICKS. */
    private static final int MAX_TICKS = 10;

    /** DEFAULT_WAIT. */
    private static final int DEFAULT_WAIT = 1000;

    /** thread. */
    private final Thread thread;

    /** tick. */
    private long tick;

    /** exit. */
    private boolean exit = false;

    /**
     * AbstractProcess.
     */
    public AbstractProcess() {
        log.info("AbstractProcess()");
        thread = new Thread(this);
    }

    /**
     * Start the thread running.
     */
    public void start() {
        log.debug("{}.start()", this.getClass().getSimpleName());
        thread.start();
    }

    /**
     * thread executes when it receives a time thread this function should
     * simple exit.
     */
    @Override
    public void run() {
        log.info("{}.run", this.getClass().getSimpleName());
        try {
            do {
                /**
                 * A run method should either a sleep or yield to prevent
                 * deadlock.
                 */

                // Pause for 1 Second.
                Thread.sleep(DEFAULT_WAIT);

                // Pause until I'm allowed to continue.
                Thread.yield();

                // Thread ends if it runs more than a ten times.
                // alternatively I could throw a new InterruptedException
                tick++;
                if (tick >= MAX_TICKS) {
                    exit = true;
                }
                log.trace("tick={}", tick);
            } while (!exit);

        } catch (final InterruptedException e) {
            log.error(e.getLocalizedMessage(), e);
        }
        log.debug("{}.ending", this.getClass().getSimpleName());
    }

    /**
     * Stop the thread running.
     */
    public void stop() {
        log.debug("{}.stop()", this.getClass().getSimpleName());
        exit = true;
    }
}
