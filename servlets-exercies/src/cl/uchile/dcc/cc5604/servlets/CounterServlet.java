package cl.uchile.dcc.cc5604.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/counter")
public class CounterServlet extends HttpServlet {

    /** A counter for the access count */
    private int counter = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.counter++;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1>Contador de accesos </h1>");
        out.println("<hr>");
        out.println("Este servlet ha sido accedido " + counter + " veces");
        out.println("<HR>");
        out.println("La IP de su computador es: " + request.getRemoteHost());
        out.println("<HR>");
        out.close();
    }
}
