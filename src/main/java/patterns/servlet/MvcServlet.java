
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

		if (this.servletInitialised) {
			final String requestName = request.getPathInfo();

			final Result result = new Result();
			this.actionManager.handleRequest(request, response, result);
			this.viewManager.handleRequest(request, response, result);
		}
	}

	/** Returns a short description of the servlet */
	@Override
	public String getServletInfo() {
		return "Front Controller Servlet";
	}

}
