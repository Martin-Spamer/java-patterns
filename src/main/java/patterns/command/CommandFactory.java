
package patterns.command;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import coaching.resources.PropertiesLoader;

/**
 * An example class factory for creating Class objects.
 */
public final class CommandFactory {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(CommandFactory.class);

    /** DEFAULT constant. */
    private static final String DEFAULT = "patterns.command.ExampleCommand";

    /** INSTANCE constant. */
    private static final CommandFactory INSTANCE = new CommandFactory();

    /** The properties. */
    protected final Properties properties;

    /**
     * Instantiates a new command factory.
     */
    private CommandFactory() {
        super();
        this.properties = PropertiesLoader.getProperties("commands.properties");
    }

    /**
     * Gets the instance.
     *
     * @return the instance
     */
    public static CommandFactory getInstance() {
        return INSTANCE;
    }

    /**
     * Factory method to create a new instance of a class. The factory decides
     * which class to provide.
     *
     * @return new instance of CommandFactory
     */
    public static AbstractCommand create() {
        final CommandFactory commandFactory = getInstance();
        return commandFactory.createByClassName(DEFAULT);
    }

    /**
     * Factory method to create a new instance of CommandFactory.
     *
     * @param string the string
     * @return new instance of CommandFactory
     */
    public static AbstractCommand create(final String string) {
        final CommandFactory commandFactory = getInstance();
        final String className = DEFAULT;
        return commandFactory.createByClassName(className);
    }

    /**
     * Factory Class to create a new Command instance.
     *
     * @param className the class name
     * @return the abstract command
     */
    private AbstractCommand createByClassName(final String className) {
        try {
            return (AbstractCommand) Class.forName(className).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            LOG.error(e.getLocalizedMessage(), e);
        }
        return null;
    }

}
