/**
 * This file is part of Automated Testing Framework for Java (atf4j).
 *
 * Atf4j is free software: you can redistribute it and/or modify
 * GNU General Public License as published by
 * License, or
 * (at your option) any later version.
 *
 * hope that it will be useful,
 * implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * GNU General Public License
 * along with atf4j.  If not, see http://www.gnu.org/licenses/.
 */

package coaching.net;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class ThreadTemplate.
 */
public class ThreadTemplate implements Runnable {

    /** The Constant TIME_OUT. */
    private static final long TIME_OUT = 1000;

    /** The Constant MAX_TICKS. */
    private static final long MAX_TICKS = 10;

    /** The log. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /** The config. */
    protected SchedulerConfig config;

    /** The thread. */
    protected final Thread thread;

    /** The exit. */
    protected boolean exit = false;

    /** The tick. */
    protected long tick;

    /** The start time. */
    protected long startTime;

    /** The time out. */
    protected long timeOut = TIME_OUT;

    /** The max ticks. */
    protected long maxTicks = MAX_TICKS;

    /**
     * The Constructor.
     */
    public ThreadTemplate() {
        initialise(new SchedulerConfig());
        thread = new java.lang.Thread(this);
    }

    /**
     * Initialise.
     *
     * configuration element
     *
     * @param config the config
     */
    public void initialise(final SchedulerConfig config) {
        this.config = config;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        do {
            tick++;

            final String className = this.getClass().getSimpleName();
            final String threadName = thread.getName();
            final int priority = thread.getPriority();
            log.info("classname:{}:threadName:{}({}).{}", className, threadName, priority, tick);

            try {
                // Let the thread execute a little
                execute();
            } catch (final ApplicationException exception) {
                log.error(exception.toString());
            }

            // Yield a little.
            java.lang.Thread.yield();

            // * Thread ends.
            if (tick >= maxTicks) {
                exit = true;
            }

            final long currentTimeMillis = System.currentTimeMillis();
            if ((currentTimeMillis - startTime) > TIME_OUT) {
                exit = true;
            }
        } while (!exit);
    }

    /**
     * Execute.
     *
     * @throws ApplicationException the application exception
     */
    protected void execute() throws ApplicationException {
        throw new ApplicationException("execute method must be overridden");
    }

    /**
     * Start.
     */
    public void start() {
        thread.start();
    }

    /**
     * Stop.
     */
    public void stop() {
        exit = true;
    }

}
