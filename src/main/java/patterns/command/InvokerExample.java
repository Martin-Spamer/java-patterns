package patterns.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The StaticInvoker Class.
 */
public class InvokerExample implements InvokerInterface {

	private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private final ExampleCommand exampleCommand = new ExampleCommand();
	private final SequenceCommand commandSequence = new SequenceCommand();
	private final CompoundCommand compoundCommand = new CompoundCommand();
	private final ConditionalCommand conditionalCommand = new ConditionalCommand();

	/**
	 * Instantiates a new static invoker.
	 *
	 * @throws Exception the exception
	 */
	public InvokerExample() throws Exception {
		super();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.InvokerInterface#execute(java.lang.String)
	 */
	@Override
	public ResultInterface execute(final String actionName) {
		ResultInterface result = null;
		log.info("{}", actionName);
		switch (actionName) {
			case "ExampleCommand":
				result = exampleCommand.execute(null);
				break;
			case "CommandSequence":
				result = commandSequence.execute(null);
				break;
			case "CompoundCommand":
				result = compoundCommand.execute(null);
				break;
			case "ConditionalCommand":
				result = conditionalCommand.execute(null);
				break;
		}
		return result;
	}
}
