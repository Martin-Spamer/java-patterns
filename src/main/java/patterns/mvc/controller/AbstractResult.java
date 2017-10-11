
package patterns.mvc.controller;

/**
 * class AbstractResult.
 */
public abstract class AbstractResult implements ResultInterface {

	/**
	 * Instantiates a new abstract result.
	 */
	public AbstractResult() {
		super();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.mvc.controller.ResultInterface#result()
	 */
	@Override
	public ResultInterface result() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.mvc.controller.ResultInterface#updateResult(patterns.mvc.
	 * controller.ResultInterface)
	 */
	@Override
	public ResultInterface updateResult(final ResultInterface newResult) {
		return null;
	}

}