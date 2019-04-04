
package patterns.command;

import coaching.factory.ClassFactory;
import lombok.extern.slf4j.Slf4j;

/**
 * The Class CommandInvoker.
 */
@Slf4j
public final class CommandInvoker {

    /**
     * Execute.
     *
     * @param actionName the action name
     * @return the result interface
     * @throws MissingCommandException the missing command exception
     */
    public ResultInterface execute(final String actionName) throws MissingCommandException {
        if (actionName != null) {
            if (actionName.length() > 0) {
                return executeActionName(actionName);
            } else {
                final String message = "actionName must be define, cannot be zero length.";
                log.error(message);
                throw new MissingCommandException(message);
            }
        } else {
            final String message = "actionName cannot be null";
            log.error(message);
            throw new MissingCommandException(message);
        }
    }

    /**
     * Execute action name.
     *
     * @param actionName the action name
     * @return the result interface
     * @throws MissingCommandException the missing command exception
     */
    private ResultInterface executeActionName(final String actionName) throws MissingCommandException {
        final String className = ClassFactory.classNameFor(actionName);
        if (className != null) {
            if (className.length() > 0) {
                return executeByClassName(className);
            } else {
                final String message = String.format("className '%s' cannot be zero length.", className);
                throw new MissingCommandException(message);
            }
        } else {
            final String message = String.format("className '%s' cannot be zero length.", className);
            log.error(message);
            throw new MissingCommandException(message);
        }
    }

    /**
     * Execute by class name.
     *
     * @param className the class name
     * @return the result interface
     * @throws MissingCommandException the missing command exception
     */
    private ResultInterface executeByClassName(final String className) throws MissingCommandException {
        AbstractCommand action = null;
        try {
            action = (AbstractCommand) Class.forName(className).newInstance();
            if (action != null) {
                final Parameters commandParameters = new Parameters();
                return action.execute(commandParameters);
            } else {
                final String message = String.format("%s Class not found. ", className);
                throw new MissingCommandException(message);
            }
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            log.error(e.getLocalizedMessage(), e);
            throw new MissingCommandException(e);
        }
    }
}
