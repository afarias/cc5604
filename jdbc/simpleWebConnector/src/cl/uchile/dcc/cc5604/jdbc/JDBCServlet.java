package cl.uchile.dcc.cc5604.jdbc;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This Servlet class allows a DB configuration to be tests creating a connection.
 */
@WebServlet(urlPatterns = "connectToDB", loadOnStartup = 1)
public class JDBCServlet extends HttpServlet {

    /** This variable stores the state of whether it was possible to load the driver or not */
    private boolean driverFound = true;

    private static final Logger logger = Logger.getLogger(JDBCServlet.class.getName());

    @Override
    public void init(ServletConfig config) throws ServletException {

        /* The postgresql driver is loaded */
        try {
            Class.forName("org.postgresql.Driver");
            logger.log(Level.SEVERE, "The PostgreSQL driver, org.postgresql.Driver, was found.");
        } catch (ClassNotFoundException e) {
            driverFound = false;
            logger.log(Level.SEVERE, "The PostgreSQL driver, org.postgresql.Driver, was not found on the CLASS_PATH.");
        }

        /* The value of the flag is stored globally in the Servlet Context */
        config.getServletContext().setAttribute("driverFound", driverFound);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /* Checking if this is going to work (ever) */
        if (!driverFound) {
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }

        /* The DB parameters are retrieved from the form on the response */
        String user = req.getParameter("user");
        String password = req.getParameter("password");
        String host = req.getParameter("host");
        String port = req.getParameter("port");
        String bdd = req.getParameter("bdd");

        /* The connection is obtained */
        Connection connection = getConnection(host, port, bdd, user, password);

        /* And store in the request for further use in the receiver JSP resulting page */
        req.setAttribute("connection", connection);

        /* The control is pass to the JSP resulting page */
        req.getRequestDispatcher("result.jsp").forward(req, resp);
    }

    private Connection getConnection(String host, String port, String bdd, String user, String password) {


        return null;
    }
}
