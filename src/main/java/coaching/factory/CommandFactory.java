
package coaching.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import patterns.command.AbstractCommand;

/**
 * An example class factory for creating Class objects.
 */
public final class CommandFactory {

    /** provides logging */
    private static final Logger LOG = LoggerFactory.getLogger(CommandFactory.class);
    private static final String DEFAULT = "coaching.factory.ClassFactory";
    private static final CommandFactory INSTANCE = new CommandFactory();
    private static final CommandMap COMMANDS = CommandMap.getInstance();

    private CommandFactory() {
        super();
    }

    public static CommandFactory getInstance() {
        return INSTANCE;
    }

    public static CommandFactory getInstance(final String resourceName) {
        COMMANDS.load(resourceName);
        return INSTANCE;
    }

    public void load(final String resourceName) {
    }

    public static AbstractCommand create() {
        CommandFactory commandFactory = getInstance();
        return commandFactory.createByClassName(DEFAULT);
    }

    public AbstractCommand createByKey(final String key) {
        String className = COMMANDS.get(key);
        return createByClassName(className);
    }

    public AbstractCommand createByClassName(final String className) {
        try {
            return (AbstractCommand) Class.forName(className).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            LOG.error(e.getLocalizedMessage(), e);
        }
        return null;
    }

}
