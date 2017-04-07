
package patterns.gof.behavioural.command;

/**
 * The CommandInterface Interface.
 */
interface CommandInterface {
	CommandInterface execute(final String actionName);
}
