
package patterns.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import patterns.mvc.controller.Delegate;
import patterns.mvc.controller.Result;

/**
 * ManagerInterface Interface.
 */
public interface ManagerInterface {

	/**
	 * Attach.
	 *
	 * delegate
	 *
	 * @param delegate the delegate
	 */
	void attach(Delegate delegate);

	/**
	 * Detach.
	 *
	 * delegate
	 *
	 * @param delegate the delegate
	 */
	void detach(Delegate delegate);

	/**
	 * Handle request.
	 *
	 * request
	 * response
	 * result
	 *
	 * @param request the request
	 * @param response the response
	 * @param result the result
	 */
	void handleRequest(HttpServletRequest request, HttpServletResponse response, Result result);

}
