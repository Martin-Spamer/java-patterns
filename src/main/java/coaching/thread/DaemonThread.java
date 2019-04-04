
package coaching.thread;

import lombok.extern.slf4j.Slf4j;

/**
 * DaemonThread class.
 */
@Slf4j
public final class DaemonThread extends Thread {

    /** Instantiate the single instance of this class. */
    private static final DaemonThread INSTANCE = new DaemonThread();

    /**
     * Returns this single shared instance.
     *
     * @return the singleton
     */
    public static DaemonThread getSingleton() {
        return INSTANCE;
    }

    /**
     * Private constructor prevents wild instantiations.
     */
    private DaemonThread() {
        super();
        setDaemon(true);
        log.info("{} loaded...", this.getClass().getSimpleName());
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Thread#run()
     */
    @Override
    public void run() {
        log.info("{} running... ", this.getClass().getSimpleName());
        log.info("sleep 500 at {} ", System.currentTimeMillis());
        try {
            yield();
            Thread.sleep(500);
        } catch (final InterruptedException e) {
            log.error(e.getLocalizedMessage(), e);
            currentThread().interrupt();
        }
        log.info("until {} ", System.currentTimeMillis());

    }

    /*
     * (non-Javadoc)
     * @see java.lang.Thread#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [id=%s, name=%s, state=%s, priority=%s, isAlive=%s, isDaemon=%s]",
            getClass(),
            getId(),
            getName(),
            getState(),
            getPriority(),
            isAlive(),
            isDaemon());
    }
}
