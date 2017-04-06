
package patterns.gof.behavioural.command;

/**
 * The ConcreteCommand Class.
 */
class ConcreteCommand extends AbstractCommand {

	@Override
	public AbstractCommand execute() {
		return this;
	}

}
