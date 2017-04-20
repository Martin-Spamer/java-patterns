package patterns.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractCommand implements CommandInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	@Override
	public AbstractCommand execute(ParametersInterface commandParameters) {
		log.debug("{}.execute", this.getClass().getSimpleName());
		return this;
	}

	@Override
	public AbstractCommand undo(ParametersInterface commandParameters) {
		log.debug("{}.undo", this.getClass().getSimpleName());
		return this;
	}

}
