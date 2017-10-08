
package patterns.command;

import org.slf4j.*;

/**
 * Abstract Command class from GOF Command Pattern.
 */
public abstract class AbstractCommand implements CommandInterface {

	private final Context context = Context.getInstance();
	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	protected ResultInterface result = null;

	public ResultInterface execute() {
		this.log.debug("{}.execute", this.getClass().getSimpleName());
		this.result = new Result(Result.PASS);
		return this.result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.CommandInterface#execute(patterns.command.
	 * ParametersInterface)
	 */
	@Override
	public ResultInterface execute(final ParametersInterface commandParameters) {
		this.log.debug("{}.execute", this.getClass().getSimpleName());
		this.log.debug("context={}", this.context);
		commandParameters.setPrameter("result", "pass");
		this.result = new Result(Result.PASS);
		return this.result;
	}

	public ResultInterface undo() {
		this.log.debug("{}.undo", this.getClass().getSimpleName());
		this.result = new Result(Result.FAIL);
		return this.result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.CommandInterface#undo(patterns.command.
	 * ParametersInterface)
	 */
	@Override
	public ResultInterface undo(final ParametersInterface commandParameters) {
		this.log.debug("{}.undo", this.getClass().getSimpleName());
		commandParameters.setPrameter("result", "pass");
		this.result = new Result(Result.FAIL);
		return this.result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.AbstractCommand#result()
	 */
	@Override
	public Boolean result() {
		return this.result.result();
	}

}
