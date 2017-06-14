
package patterns.command;

/**
 * Result of Command execution.
 */
public class Result implements ResultInterface {

	public static final Boolean PASS = true;
	public static final Boolean FAIL = false;
	private Boolean result = false;

	/**
	 * Instantiates a new result.
	 */
	public Result() {
		result = PASS;
	}

	/**
	 * Instantiates a new result.
	 *
	 * result
	 *
	 * @param result the result
	 */
	public Result(final Boolean result) {
		this.result = result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * patterns.command.ResultInterface#result(patterns.command.ResultInterface)
	 */
	@Override
	public Boolean result() {
		return result;
	}

	/* (non-Javadoc)
	 * @see patterns.command.ResultInterface#and(patterns.command.ResultInterface)
	 */
	@Override
	public boolean and(ResultInterface newResult) {
		result &= newResult.result().booleanValue();
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Result [result=%s]", result);
	}

}
