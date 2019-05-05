
package coaching.thread;

import lombok.extern.slf4j.Slf4j;

/**
 * The Class RunnableClass.
 */


@Slf4j
public final class RunnableClass implements Runnable {

    /**
     * Instantiates a new runnable class.
     */
    public RunnableClass() {
        super();
        log.info("{} loaded...", this.getClass().getSimpleName());
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        log.info("{} running... ", this.getClass().getSimpleName());
        try {
            Thread.sleep(1000);
        } catch (final InterruptedException e) {
            log.error(e.getLocalizedMessage(), e);
            Thread.currentThread().interrupt();
        }

    }

}
