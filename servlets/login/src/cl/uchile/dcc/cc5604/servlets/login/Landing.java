package cl.uchile.dcc.cc5604.servlets.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/")
public class Landing extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("@Landing!");
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1>Login</h1>");
        writer.println("<form action='/login' method='POST'>");
        writer.println("Username: <input type='text' name='username' /><br />");
        writer.println("Password: <input type='password' name='password' />");
        writer.println("<input type='submit' value='Login' />");
        writer.println("</form>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
