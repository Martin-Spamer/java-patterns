
package patterns.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import patterns.mvc.controller.ResultInterface;

/**
 * The AbstractCommand Class.
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
	public CommandInterface execute(ParametersInterface commandParameters) {
		this.log.debug("{}.execute", this.getClass().getSimpleName());
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see patterns.command.CommandInterface#undo(patterns.command.
	 * ParametersInterface)
	 */
	@Override
	public CommandInterface undo(ParametersInterface commandParameters) {
		this.log.debug("{}.undo", this.getClass().getSimpleName());
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see patterns.command.CommandInterface#result()
	 */
	@Override
	public ResultInterface result() {
		return this.result;
	}

}
