package cl.uchile.dcc.cc5604.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/visit")
public class VisitingIPAddressesServlet extends HttpServlet {

    /**
     * Arreglo de IP's de los visitantes
     */
    List<String> ips = new ArrayList<String>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /* Se obtiene la IP del cliente */
        String ip = request.getRemoteHost();
        ips.add(ip);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");

        out.println("<h1>Addresses Memory</h1>");
        out.println("<p>Han visitado este sitio: </p><br>");

        out.println("<ul>");
        for (String laIP : ips) {
            out.println("<li> " + laIP + "</li>");
        }
        out.println("</ul>");

        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
