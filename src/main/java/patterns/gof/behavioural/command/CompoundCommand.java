
package patterns.gof.behavioural.command;

/**
 * The CompoundCommand Class.
 */
class CompoundCommand extends AbstractCommand {

	@Override
	public AbstractCommand execute() {
		return this;
	}

}