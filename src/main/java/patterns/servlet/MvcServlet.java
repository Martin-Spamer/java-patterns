
package patterns.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import patterns.mvc.controller.Result;

/**
 * The MvcServlet Class.
 */
@SuppressWarnings("serial")
public class MvcServlet extends HttpServlet {

	private static final Logger LOG = LoggerFactory.getLogger(MvcServlet.class);
	private ManagerInterface actionManager;
	private ManagerInterface viewManager;
	private ManagerInterface browserManager;
	private boolean servletInitialised;

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.servlet.GenericServlet#init(javax.servlet.ServletConfig)
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.servlet.GenericServlet#destroy()
	 */
	@Override
	public void destroy() {
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		try {
			processRequest(request, response);
		} catch (final IOException e) {
			LOG.error(e.toString());
			throw new ServletException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, java.io.IOException {
		try {
			processRequest(request, response);
		} catch (final IOException e) {
			LOG.error(e.toString());
			throw new ServletException(e);
		}
	}

	/**
	 * Process request.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, java.io.IOException {

		if (servletInitialised) {
			final String requestName = request.getPathInfo();

			final Result result = new Result();
			actionManager.handleRequest(request, response, result);
			viewManager.handleRequest(request, response, result);
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.servlet.GenericServlet#getServletInfo()
	 */
	@Override
	public String getServletInfo() {
		return "Front Controller Servlet";
	}

}
