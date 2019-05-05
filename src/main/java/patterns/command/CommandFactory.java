
package patterns.command;

import java.util.Properties;

import coaching.resources.PropertiesLoader;
import lombok.extern.slf4j.Slf4j;

/**
 * An example class factory for creating Class objects.
 */

@Slf4j
public final class CommandFactory {

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
 * The name
     * @return the abstract command
     */
    private AbstractCommand createByClassName(final String className) {
        try {
            return (AbstractCommand) Class.forName(className).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            log.error(e.getLocalizedMessage(), e);
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("CommandFactory [properties=%s]", this.properties);
    }

}
