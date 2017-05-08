package patterns.command;

/**
 * Result of Command execution.
 */
public class Result implements ResultInterface {

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
