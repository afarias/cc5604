package cl.uchile.dcc.cc5604.servlets.lifecycle;

import semantikos.core.IConceptManagerLocal;
import semantikos.model.Description;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by andres on 5/24/16.
 */
@WebServlet("findDescription")
public class DescriptionFinderServlet extends HttpServlet {

    @EJB
    private IConceptManagerLocal conceptManager;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /* TODO: Recuperar el ID desde el request */
        int conceptID = 0;

        /* Se recupera la descripcion */
        Description description = conceptManager.findConceptByID(conceptID);

        // TODO: Escribir al response la descriion (setAttribute)

        // TODO: Escribir el Servlet que tiene este mapping para mostrar la descripcion.
        req.getRequestDispatcher("showDescripcion").forward(req, resp);
    }
}
