
package patterns.command;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import coaching.resources.PropertiesLoader;

/**
 * An example class factory for creating Class objects.
 */
public final class CommandFactory {

    /** provides logging */
    private static final Logger LOG = LoggerFactory
        .getLogger(CommandFactory.class);
    private static final String DEFAULT = "patterns.command.ExampleCommand";
    private static final CommandFactory INSTANCE = new CommandFactory();
    private final Properties properties;

    private CommandFactory() {
        super();
        properties = PropertiesLoader.getProperties("commands.properties");
    }

    public static CommandFactory getInstance() {
        return INSTANCE;
    }

    /**
     * Factory method to create a new instance of a class.
     * The factory decides which class to provide.
     *
     * @return new instance of CommandFactory
     */
    public static AbstractCommand create() {
        final CommandFactory commandFactory = getInstance();
        return commandFactory.createByClassName(DEFAULT);
    }

    public static AbstractCommand create(final String string) {
        final CommandFactory commandFactory = getInstance();
        final String className = DEFAULT;
        return commandFactory.createByClassName(className);
    }

    private AbstractCommand createByClassName(final String className) {
        try {
            return (AbstractCommand) Class.forName(className).newInstance();
        } catch (
                InstantiationException |
                    IllegalAccessException |
                    ClassNotFoundException e) {
            LOG.error(e.getLocalizedMessage(), e);
        }
        return null;
    }

}
