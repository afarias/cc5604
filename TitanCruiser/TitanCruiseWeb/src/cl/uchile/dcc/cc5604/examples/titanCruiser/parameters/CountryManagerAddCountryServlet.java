package cl.uchile.dcc.cc5604.examples.titanCruiser.parameters;

import cl.uchile.dcc.cc5604.examples.titanCruiser.model.Country;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@TransactionManagement(TransactionManagementType.CONTAINER)
@WebServlet("/addCountry")
public class CountryManagerAddCountryServlet extends HttpServlet {

    private Logger logger = Logger.getLogger(CountryManagerAddCountryServlet.class.getName());

    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        EntityManager em = entityManagerFactory.createEntityManager();

        logger.log(Level.INFO, "Servlet NEW Transaction begin");

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        String name = req.getParameter("name");

        Country country = new Country();
        country.setName(name);

        em.persist(country);
        transaction.commit();

        logger.log(Level.INFO, "Servlet Transaction ends.");
        req.getRequestDispatcher("countries.jsp").forward(req, resp);
    }
}
