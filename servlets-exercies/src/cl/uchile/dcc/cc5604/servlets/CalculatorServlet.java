package cl.uchile.dcc.cc5604.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1>Calculadora</h1>");
        out.println("<br>");
        out.println("<form action=\"\" method=\"post\">");
        out.println("<br>");
        out.println("La IP de su computador es: " + request.getRemoteHost());
        out.println("<HR>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1>Calculadora</h1>");
        out.println("<br>");

    }
}
