



package patterns.command;

import org.slf4j.*;

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
		log.info("execute({})", actionName);
		switch (actionName) {
			case "ExampleCommand":
				log.info("case ExampleCommand");
				result = exampleCommand.execute(new Parameters());
				break;
			case "CommandSequence":
				log.info("case CommandSequence");
				result = commandSequence.execute(new Parameters());
				break;
			case "CompoundCommand":
				log.info("case CompoundCommand");
				result = compoundCommand.execute(new Parameters());
				break;
			case "ConditionalCommand":
				log.info("case ConditionalCommand");
				result = conditionalCommand.execute(new Parameters());
				break;
			case "SequenceCommand":
				log.info("case SequenceCommand");
				result = sequenceCommand.execute(new Parameters());
				break;
			default:
				log.info("unknown command");
				break;
		}
		log.info("result={}", result);
		return result;
	}

}
