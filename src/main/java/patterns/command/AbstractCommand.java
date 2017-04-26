package patterns.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractCommand implements CommandInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	@Override
	public CommandInterface execute(ParametersInterface commandParameters) {
		this.log.debug("{}.execute", this.getClass().getSimpleName());
		return this;
	}

	@Override
	public CommandInterface undo(ParametersInterface commandParameters) {
		this.log.debug("{}.undo", this.getClass().getSimpleName());
		return this;
	}

}
