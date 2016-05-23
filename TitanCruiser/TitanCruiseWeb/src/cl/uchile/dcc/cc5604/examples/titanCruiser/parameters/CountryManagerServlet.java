package cl.uchile.dcc.cc5604.examples.titanCruiser.parameters;

import cl.uchile.dcc.cc5604.examples.titanCruiser.model.Country;
import cl.uchile.dcc.cc5604.examples.titanCruiser.model.CountryManager;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/getAllCountries")
public class CountryManagerServlet extends HttpServlet {

    @EJB
    private CountryManager countryManager;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Country> countries = countryManager.getAllCountries();
        req.setAttribute("countries", countries);

        req.getRequestDispatcher("countries.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
