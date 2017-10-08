

package coaching.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

import org.slf4j.*;

import patterns.mvc.controller.Result;

/**
 * MvcServlet Class.
 */
@SuppressWarnings("serial")
public class MvcServlet extends HttpServlet {

	private static final Logger LOG = LoggerFactory.getLogger(MvcServlet.class);
	private ManagerInterface actionManager;
	private ManagerInterface viewManager;
	private boolean servletInitialised;

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.servlet.GenericServlet#init(javax.servlet.ServletConfig)
	 */
	@Override
	public void init(final ServletConfig config) throws ServletException {
		super.init(config);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException {
		try {
			processRequest(request, response);
		} catch (final Exception e) {
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
	protected void doPost(final HttpServletRequest request, final HttpServletResponse response)
	        throws ServletException {
		try {
			processRequest(request, response);
		} catch (final Exception e) {
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
	 */
	protected void processRequest(final HttpServletRequest request, final HttpServletResponse response)
	        throws ServletException {

		if (servletInitialised) {
			final String requestName = request.getPathInfo();
			LOG.info("requestName={}", requestName);
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