package cl.uchile.dcc.cc5604.servlets.lifecycle;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet(value = "lifeCycle", loadOnStartup = 1)
public class LifeCycleServlet extends HttpServlet {

    private Logger logger = Logger.getLogger(LifeCycleServlet.class.getName());

    @Override
    public void destroy() {
        logger.log(Level.INFO, "The servlet will be destroyed.");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        logger.log(Level.INFO, "The servlet has been instantiated.");
    }

}
