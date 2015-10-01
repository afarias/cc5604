package cl.uchile.dcc.cc5604.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ramdom")
public class RandomNumberServlets extends HttpServlet {

    private int maxNumber = 0;
    private String maxIP = "";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /* Se crea el numero aleatorio y se recupera la IP del cliente */
        int randomNumber = (int) (1 + Math.random() * 100);
        String ip = req.getRemoteAddr();

        /* Validación del mayor aleatorio */
        if (randomNumber > maxNumber) {
            maxNumber = randomNumber;
            maxIP = ip;
        }

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<h2> Su dirección IP es " + ip + "<br>");
        out.println("Su número es " + randomNumber + "<br><br>");
        out.println("El numero mayor generado es " + maxNumber);
        out.println("<br>Fue generado para  " + maxIP);
        out.close();

    }
}
