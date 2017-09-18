
package patterns.command;

import org.slf4j.*;

/**
 * Abstract Command class from GOF Command Pattern.
 */
public abstract class AbstractCommand implements CommandInterface {

	private static final Context context = Context.getInstance();
	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	protected ResultInterface result = null;

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.CommandInterface#execute(patterns.command.
	 * ParametersInterface)
	 */
	public ResultInterface execute() {
		log.debug("{}.execute", this.getClass().getSimpleName());
		result = new Result(Result.PASS);
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.CommandInterface#execute(patterns.command.
	 * ParametersInterface)
	 */
	@Override
	public ResultInterface execute(final ParametersInterface commandParameters) {
		log.debug("{}.execute", this.getClass().getSimpleName());
		log.debug("context={}", context);
		commandParameters.setPrameter("result", "pass");
		result = new Result(Result.PASS);
		return result;
	}

	/**
	 * Undo.
	 *
	 * result interface
	 *
	 * @return the result interface
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.CommandInterface#undo(patterns.command.
	 * ParametersInterface)
	 */
	public ResultInterface undo() {
		log.debug("{}.undo", this.getClass().getSimpleName());
		result = new Result(Result.FAIL);
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.CommandInterface#undo(patterns.command.
	 * ParametersInterface)
	 */
	@Override
	public ResultInterface undo(final ParametersInterface commandParameters) {
		log.debug("{}.undo", this.getClass().getSimpleName());
		commandParameters.setPrameter("result", "pass");
		result = new Result(Result.FAIL);
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.AbstractCommand#result()
	 */
	@Override
	public Boolean result() {
		return result.result();
	}

}
