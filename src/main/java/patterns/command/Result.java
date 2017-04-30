
package patterns.command;

/**
 * The Result Class.
 */
public class Result implements ResultInterface {

	/**
	 * Instantiates a new result.
	 */
	public Result() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * patterns.command.ResultInterface#result(patterns.command.ResultInterface)
	 */
	@Override
	public ResultInterface result(final ResultInterface newResult) {
		return this;
	}

}
