
package patterns.mvc.controller;

/**
 * The Interface CommandInterface.
 */
public interface CommandInterface {

	/**
	 * Execute.
	 *
	 * @param context the context
	 * @return the result
	 */
	public Result execute(Context context);

}
