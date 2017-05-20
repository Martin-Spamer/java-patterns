
package patterns.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import patterns.command.CommandFactory;
import patterns.command.MissingCommandException;

/**
 * The FrontController Class.
 */
@SuppressWarnings("serial")
public class FrontController extends HttpServlet {

	private static final Logger LOG = LoggerFactory.getLogger(FrontController.class);
	private CommandFactory commands;

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.servlet.GenericServlet#init(javax.servlet.ServletConfig)
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		try {
			commands = new CommandFactory();
		} catch (final Exception e) {
			LOG.error(e.toString());
		}
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

		final String queryString = request.getQueryString();
		final String[] split = queryString.split("/");
		final String actionName = split[split.length - 1];

		String page;
		try {
			commands.execute(actionName);
			page = "result";
		} catch (final MissingCommandException e) {
			LOG.error(e.toString());
			page = "error";
		}

		// dispatch control to view
		dispatch(request, response, page);
	}

	/**
	 * Dispatch.
	 *
	 * @param request the request
	 * @param response the response
	 * @param page the page
	 * @throws ServletException the servlet exception
	 */
	protected void dispatch(HttpServletRequest request, HttpServletResponse response, String page)
	        throws ServletException {
		final RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(page);
		try {
			dispatcher.forward(request, response);
		} catch (final IOException e) {
			LOG.error(e.toString());
			throw new ServletException(e);
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
