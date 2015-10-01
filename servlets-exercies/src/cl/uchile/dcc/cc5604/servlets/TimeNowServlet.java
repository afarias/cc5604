package cl.uchile.dcc.cc5604.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/timeNow")
public class TimeNowServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

		/* Enviar una respusta en forma HTML */
        out.println("<html>");
        out.println("<h1>Hora del sistema</h1>");
        out.println("<h2>Fecha y hora: " + (new Date()) + "</h2>");
        out.println("</HTML>");
        out.close();
    }
}
