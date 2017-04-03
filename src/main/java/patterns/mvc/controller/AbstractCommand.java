
package patterns.mvc.controller;

/**
 * The Class AbstractCommand.
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
