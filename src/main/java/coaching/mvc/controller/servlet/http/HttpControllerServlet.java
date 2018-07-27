/* Controller.java
 * Created on 17 April 2006, 21:12
 */

package coaching.mvc.controller.servlet.http;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import coaching.mvc.controller.ControllerException;

/**
 * ControllerServlet class.
 */
@SuppressWarnings("serial")
public class HttpControllerServlet extends HttpServlet {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(HttpControllerServlet.class);

    /*
     * (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.
     * HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doGet(final HttpServletRequest request,
            final HttpServletResponse response)
            throws ServletException {
        final Map<?, ?> parameters = request.getParameterMap();
        try {
            response.sendRedirect(execute(parameters));
        } catch (final ControllerException e) {
            LOG.error(e.getLocalizedMessage(), e);
        } catch (final IOException e) {
            LOG.error(e.getLocalizedMessage(), e);
        }
    }

    /*
     * (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.
     * HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doPost(final HttpServletRequest request,
            final HttpServletResponse response)
            throws ServletException {
        final Map<?, ?> parameters = request.getParameterMap();
        try {
            execute(parameters);
        } catch (final ControllerException e) {
            LOG.error(e.getLocalizedMessage(), e);
        }
    }

    /**
     * Execute.
     *
     * @param parameters the parameters
     * @return the string
     * @throws ControllerException the controller exception
     */
    protected String execute(final Map<?, ?> parameters)
            throws ControllerException {
        if (parameters.get("EXCEPTION").equals("TRUE")) {
            throw new ControllerException("execute");
        }
        return (String) parameters.get("url");
    }

    /*
     * (non-Javadoc)
     * @see javax.servlet.GenericServlet#getServletInfo()
     */
    @Override
    public String getServletInfo() {
        return this.getClass().getSimpleName();
    }

    /*
     * (non-Javadoc)
     * @see javax.servlet.GenericServlet#init(javax.servlet.ServletConfig)
     */
    @Override
    public void init(final ServletConfig config) throws ServletException {
        log(config.toString());
        super.init(config);
    }

}
