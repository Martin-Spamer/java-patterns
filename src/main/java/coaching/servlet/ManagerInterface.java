
package coaching.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import patterns.mvc.controller.AbstractDelegate;
import patterns.mvc.controller.AbstractResult;

/**
 * Manager Interface.
 */
public interface ManagerInterface {

	/**
	 * Attach.
	 *
	 * @param delegate
	 *            the delegate
	 */
	public void attach(final AbstractDelegate delegate);

	/**
	 * Detach.
	 *
	 * @param delegate
	 *            the delegate
	 */
	public void detach(final AbstractDelegate delegate);

	/**
	 * Handle request.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @param result
	 *            the result
	 */
	public void handleRequest(HttpServletRequest request, HttpServletResponse response, AbstractResult result);

}
