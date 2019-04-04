
package coaching.pool;

import lombok.extern.slf4j.Slf4j;

/**
 * WorkerThread Class.
 */
@Slf4j
public class WorkerThread implements Runnable {

    /** The Constant INTERVAL. */
    private static final int INTERVAL = 5000;

    /** The command. */
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
            log.error(e.getLocalizedMessage(), e);
        }
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        final String name = Thread.currentThread().getName();
        log.info("{}:{}", name, this.command);
        processCommand();
        log.info("{}:exit", name);
    }

}
