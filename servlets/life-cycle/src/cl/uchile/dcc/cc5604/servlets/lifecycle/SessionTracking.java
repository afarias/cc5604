package cl.uchile.dcc.cc5604.servlets.lifecycle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/summ")
public class SessionTracking extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(true);

        out.println("<h1> Calcula </h1>");
        int op1 = (int) (Math.random() * 100) + 1;
        int op2 = (int) (Math.random() * 100) + 1;

        // Se guardan en la sesion
        session.setAttribute("op1", op1);
        session.setAttribute("op2", op2);

        out.println("<form method=post>");
        out.println("<h2>" + op1 + " + " + op2 + " = ");
        out.println("<input type=text size=4 name=resultado>");
        out.println("<input type=submit value=corregir>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(true);
        int op1 = (Integer)session.getAttribute("op1");
        int op2 = (Integer)session.getAttribute("op2");

        String res = request.getParameter("resultado");
        int nres = Integer.parseInt(res);
        out.println("<h2>");
        if (nres == op1+op2)
            out.println("Excelente ");
        else
            out.println(" El resultado era "+(op1+op2));
    }
}
