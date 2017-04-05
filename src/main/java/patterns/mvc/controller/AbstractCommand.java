
package patterns.mvc.controller;

/**
 * The AbstractCommand Class.
 */
public class AbstractCommand implements CommandInterface {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * patterns.mvc.controller.CommandInterface#execute(patterns.mvc.controller.
	 * Context)
	 */
	public Result execute(Context context) {
		return new Result();
	}

}
