package patterns.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Abstract Command class from GOF Command Pattern.
 */
public abstract class AbstractCommand implements CommandInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	protected ResultInterface result = null;

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.CommandInterface#execute(patterns.command.
	 * ParametersInterface)
	 */
	@Override
	public ResultInterface execute(ParametersInterface commandParameters) {
		log.debug("{}.execute", this.getClass().getSimpleName());
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.CommandInterface#undo(patterns.command.
	 * ParametersInterface)
	 */
	@Override
	public ResultInterface undo(ParametersInterface commandParameters) {
		log.debug("{}.undo", this.getClass().getSimpleName());
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.AbstractCommand#result()
	 */
	@Override
	public ResultInterface updateResult() {
		return result;
	}

}
