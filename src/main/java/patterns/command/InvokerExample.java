
package patterns.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Invoker Example Class.
 */
public class InvokerExample implements InvokerInterface {

	private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private final ExampleCommand exampleCommand = new ExampleCommand();
	private final SequenceCommand commandSequence = new SequenceCommand();
	private final CompoundCommand compoundCommand = new CompoundCommand();
	private final ConditionalCommand conditionalCommand = new ConditionalCommand();
	private final SequenceCommand sequenceCommand = new SequenceCommand();

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.InvokerInterface#execute(java.lang.String)
	 */
	@Override
	public ResultInterface execute(final String actionName) {
		ResultInterface result = null;
		this.log.info("execute({})", actionName);
		switch (actionName) {
		case "ExampleCommand":
			this.log.info("case ExampleCommand");
			result = this.exampleCommand.execute(new Parameters());
			break;
		case "CommandSequence":
			this.log.info("case CommandSequence");
			result = this.commandSequence.execute(new Parameters());
			break;
		case "CompoundCommand":
			this.log.info("case CompoundCommand");
			result = this.compoundCommand.execute(new Parameters());
			break;
		case "ConditionalCommand":
			this.log.info("case ConditionalCommand");
			result = this.conditionalCommand.execute(new Parameters());
			break;
		case "SequenceCommand":
			this.log.info("case SequenceCommand");
			result = this.sequenceCommand.execute(new Parameters());
			break;
		default:
			this.log.info("unknown command");
			break;
		}
		this.log.info("result={}", result);
		return result;
	}

}
