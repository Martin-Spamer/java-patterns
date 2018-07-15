/** CommandPool.java
 * Created on 17 April 2006, 21:02
 */

package coaching.mvc.controller;

import coaching.mvc.CommandInterface;

/**
 * CommandPool Class.
 */
public class Commands {

    /** The instance. */
    private static Commands instance;

    /**
     * single instance of CommandPool.
     *
     * @return single instance of CommandPool
     */
    public static Commands getInstance() {
        if (Commands.instance == null) {
            Commands.instance = new Commands();
        }
        return Commands.instance;
    }

    /**
     * Creates the new command
     *
     * @return the command pool
     */
    public static CommandInterface create() {
        return new Command();
    }

    /**
     * Instantiates a new command pool.
     */
    private Commands() {
        super();
    }

}
