
package patterns.gof.behavioural.command;

/**
 * The CompoundCommand Class.
 */
public class CommandSequence extends AbstractCommand {

	@Override
	public AbstractCommand execute() {
		return this;
	}

}