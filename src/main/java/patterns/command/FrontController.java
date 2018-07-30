
package patterns.command;

/**
 * CommandMap class.
 * When Commands are expensive to construct, borrow them from resource pool and return to the pool
 * when finished.
 */
@SuppressWarnings("serial")
public final class FrontController extends AbstractCommandMap {

    private static final FrontController COMMANDS = new FrontController();

    public static FrontController getInstance() {
        return COMMANDS;
    }

    private FrontController() {
        super();
    }

    //    final Properties properties = new Properties();
    //    final InputStream inputStream = inputStream("commands.properties");
    //    properties.load(inputStream);
    //
    //    for (final Map.Entry<Object, Object> entry : properties.entrySet()) {
    //        final String key = (String) entry.getKey();
    //        final String className = (String) entry.getValue();
    //        LOG.trace("\t{} = {}", key, className);
    //        try {
    //            final AbstractCommand instance = (AbstractCommand) Class
    //                    .forName(className)
    //                    .newInstance();
    //            commandMap.put(key, instance);
    //        } catch (final ClassNotFoundException e) {
    //            LOG.error("Class not found for command {}", key);
    //        }
    //    }

    //    public ResultInterface execute(final String actionName) throws MissingCommandException {
    //        if (actionName == null) {
    //            final String message = "actionName cannot be null";
    //            throw new MissingCommandException(message);
    //        } else {
    //            final CommandInterface command = get(actionName);
    //            if (command == null) {
    //                final String message = String
    //                        .format("command %s not found", actionName);
    //                throw new MissingCommandException(message);
    //            } else {
    //                return command.execute(new Parameters());
    //            }
    //        }
    //    }


}
