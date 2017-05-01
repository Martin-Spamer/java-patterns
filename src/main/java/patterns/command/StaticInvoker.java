
package patterns.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import patterns.mvc.controller.ResultInterface;

/**
 * The StaticInvoker Class.
 */
public class StaticInvoker implements InvokerInterface {

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
	public StaticInvoker() throws Exception {
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
		this.log.info("{}", actionName);
		switch (actionName) {
			case "ExampleCommand":
				result = this.exampleCommand.execute(null);
				break;
			case "CommandSequence":
				result = this.commandSequence.execute(null);
				break;
			case "CompoundCommand":
				result = this.compoundCommand.execute(null);
				break;
			case "ConditionalCommand":
				result = this.conditionalCommand.execute(null);
				break;
		}
		return result;
	}
}