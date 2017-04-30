
package patterns.chain;

/**
 * The HandlerInterface Interface.
 */
public interface HandlerInterface {

	/**
	 * Handle request.
	 *
	 * @return the handler interface
	 */
	abstract HandlerInterface handleRequest();

}