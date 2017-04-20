package patterns.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StaticInvoker implements InvokerInterface {

	private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private final ExampleCommand exampleCommand = new ExampleCommand();
	private final CommandSequence commandSequence = new CommandSequence();
	private final CompoundCommand compoundCommand = new CompoundCommand();
	private final ConditionalCommand conditionalCommand = new ConditionalCommand();

	public StaticInvoker() throws Exception {
		super();
	}

	@Override
	public CommandInterface execute(final String actionName) {
		this.log.info("{}", actionName);
		switch (actionName) {
			case "ExampleCommand":
				this.exampleCommand.execute(null);
				break;
			case "CommandSequence":
				this.commandSequence.execute(null);
				break;
			case "CompoundCommand":
				this.compoundCommand.execute(null);
				break;
			case "ConditionalCommand":
				this.conditionalCommand.execute(null);
				break;
		}
		return this.commandSequence;
	}
}
