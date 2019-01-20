
package coaching.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class RunnableClass.
 */
public final class RunnableClass implements Runnable {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(RunnableClass.class);

    /**
     * Instantiates a new runnable class.
     */
    public RunnableClass() {
        super();
        LOG.info("{} loaded...", this.getClass().getSimpleName());
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        LOG.info("{} running... ", this.getClass().getSimpleName());
        try {
            Thread.sleep(1000);
        } catch (final InterruptedException e) {
            LOG.error(e.getLocalizedMessage(), e);
            Thread.currentThread().interrupt();
        }

    }

}
