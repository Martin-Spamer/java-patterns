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

package coaching.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A template for a Thread class.
 */
public class ThreadTemplate implements Runnable {

    /** The Constant TIME_OUT. */
    private static final long TIME_OUT = 1000;

    /** The Constant MAX_TICKS. */
    private static final long MAX_TICKS = 10;

    /** Provides logging. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /** The configuration. */
    protected ThreadConfig config;

    /** thread. */
    protected final Thread thread;

    /** exit. */
    protected boolean exit = false;

    /** tick. */
    protected long tick;

    /** start time. */
    protected long startTime;

    /** time out. */
    protected long timeOut = TIME_OUT;

    /** max ticks. */
    protected long maxTicks = MAX_TICKS;

    /**
     * Default Constructor.
     */
    public ThreadTemplate() {
        initialise(new ThreadConfig());
        this.thread = new Thread(this);
        this.log.info("{}", this);
    }

    /**
     * Initialise.
     *
     * configuration element
     *
     * @param config the config
     */
    public void initialise(final ThreadConfig config) {
        this.log.info("{}", config);
        this.config = config;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        this.log.info("run");

        do {
            this.tick++;

            final String className = this.getClass().getSimpleName();
            final String threadName = this.thread.getName();
            final int priority = this.thread.getPriority();
            this.log.info("classname:{}:threadName:{}({}).{}", className, threadName, priority, this.tick);

            try {
                execute();
            } catch (final ApplicationException exception) {
                this.log.error("{}", exception);
            }

            // Yield a little.
            Thread.yield();

            // * Thread ends.
            if (this.tick >= this.maxTicks) {
                this.exit = true;
            }

            final long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.startTime > TIME_OUT) {
                this.exit = true;
            }
        } while (!this.exit);
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
        this.thread.start();
    }

    /**
     * Stop.
     */
    public void stop() {
        this.exit = true;
    }

    /**
     * The Class ApplicationException.
     */
    public class ApplicationException extends Exception {

        /**
         * Instantiates a new application exception.
         *
         * @param message the message
         */
        public ApplicationException(final String message) {
            super(message);
        }
    }

}
