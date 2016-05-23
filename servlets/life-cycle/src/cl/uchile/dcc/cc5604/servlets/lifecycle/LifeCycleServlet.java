package cl.uchile.dcc.cc5604.servlets.lifecycle;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class aims to implements the servlet life cycle methods in order to check when the servlet is instantiated and
 * destroyed.
 *
 * @author Andrés Farías
 */
@WebServlet(value = "lifeCycle", loadOnStartup = 1)
public class LifeCycleServlet extends HttpServlet {

    /** A logger to print at the output */
    private Logger logger = Logger.getLogger(LifeCycleServlet.class.getName());

    /**
     * This method is called immediately after the servlet container has created this servlet.
     *
     * @param config The Servlet configuration.
     *
     * @throws ServletException Thrown if anything goes wrong on this method.
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        logger.log(Level.INFO, "The servlet has been instantiated.");
    }



    /**
     * This method is responsible for execute custom instructions before the servlet is destroyed.
     * The Servlet container calls this method right before it is ready to destroy this servlet.
     */
    @Override
    public void destroy() {
        logger.log(Level.INFO, "The servlet will be destroyed.");
    }

}
