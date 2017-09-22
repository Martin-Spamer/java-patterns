

package patterns.servlet;

import javax.servlet.http.*;

import patterns.mvc.controller.*;

/**
 * ManagerInterface Interface.
 */
public interface ManagerInterface {

	/**
	 * Attach.
	 *
	 * @param delegate the delegate
	 */
	void attach(Delegate delegate);

	/**
	 * Detach.
	 *
	 * @param delegate the delegate
	 */
	void detach(Delegate delegate);

	/**
	 * Handle request.
	 *
	 * @param request the request
	 * @param response the response
	 * @param result the result
	 */
	void handleRequest(HttpServletRequest request, HttpServletResponse response, Result result);

}
