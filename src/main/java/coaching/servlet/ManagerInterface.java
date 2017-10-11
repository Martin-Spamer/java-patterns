
package coaching.servlet;

import javax.servlet.http.*;

import patterns.mvc.controller.*;

/**
 * Manager Interface.
 */
public interface ManagerInterface {

	/**
	 * Attach.
	 *
	 * @param delegate the delegate
	 */
	public void attach(AbstractDelegate delegate);

	/**
	 * Detach.
	 *
	 * @param delegate the delegate
	 */
	public void detach(AbstractDelegate delegate);

	/**
	 * Handle request.
	 *
	 * @param request the request
	 * @param response the response
	 * @param result the result
	 */
	public void handleRequest(HttpServletRequest request, HttpServletResponse response, AbstractResult result);

}
