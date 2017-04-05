
package patterns.mvc.controller;

/**
 * The CommandInterface Interface.
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
