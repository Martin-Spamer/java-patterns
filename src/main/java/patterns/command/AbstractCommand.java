package patterns.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractCommand implements CommandInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	public AbstractCommand execute() {
		this.log.trace("execute");
		return this;
	}

	public AbstractCommand undo() {
		this.log.trace("undo");
		return this;
	}

}
