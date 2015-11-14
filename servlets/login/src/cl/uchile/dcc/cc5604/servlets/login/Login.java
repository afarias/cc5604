package cl.uchile.dcc.cc5604.servlets.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /* Parameters are retrieved */
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if(username.trim().equals("afarias") && password.trim().equals("afarias")){
            req.getRequestDispatcher("/main").forward(req, resp);
            System.out.println("Login exitoso! Redirigiendo al main!");
        } else {
            req.getRequestDispatcher("/").forward(req, resp);
            System.out.println("Login inválido! Redirigiendo al landing!");
        }
    }

}
