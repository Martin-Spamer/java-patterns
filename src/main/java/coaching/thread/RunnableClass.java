
package coaching.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class RunnableClass implements Runnable {

    /** provides logging */
    private static final Logger LOG = LoggerFactory
        .getLogger(RunnableClass.class);

    private RunnableClass() {
        super();
        LOG.info("{} loaded...", this.getClass().getSimpleName());
    }

    @Override
    public void run() {
        LOG.info("{} running... ", this.getClass().getSimpleName());
    }

}
