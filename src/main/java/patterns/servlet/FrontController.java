
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
import patterns.command.CommandInterface;

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
			this.commands = new CommandFactory();
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

	/**
	 * Handles the HTTP <code>GET</code> method.
	 * @param request servlet request
	 * @param response servlet response
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

	/**
	 * Handles the HTTP <code>POST</code> method.
	 * @param request servlet request
	 * @param response servlet response
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
	 * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
	 * methods.
	 * @param request servlet request
	 * @param response servlet response
	 */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, java.io.IOException {

		final String queryString = request.getQueryString();
		final String[] split = queryString.split("/");
		final String actionName = split[split.length - 1];

		final CommandInterface result = this.commands.execute(actionName);

		final String page = "result";

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

	/** Returns a short description of the servlet */
	@Override
	public String getServletInfo() {
		return "Front Controller Servlet";
	}

}
