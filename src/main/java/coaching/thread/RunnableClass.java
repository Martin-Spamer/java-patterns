
package coaching.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class RunnableClass implements Runnable {

    /** provides logging */
    private static final Logger LOG = LoggerFactory.getLogger(RunnableClass.class);

    public RunnableClass() {
        super();
        LOG.info("{} loaded...", this.getClass().getSimpleName());
    }

    @Override
    public void run() {
        LOG.info("{} running... ", this.getClass().getSimpleName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            LOG.error(e.getLocalizedMessage(), e);
            Thread.currentThread().interrupt();
        }

    }

}
