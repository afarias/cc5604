package cl.uchile.dcc.cc5604.servlets.lifecycle;

import javax.servlet.*;
import java.io.IOException;

public class GustavoServlet implements Servlet {

    private int age;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Se instanció el servlet");

        String stringAge = servletConfig.getInitParameter("Age");
        this.age = new Integer(stringAge);
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Se servió la petición: " + servletRequest.getRemoteAddr());
        System.out.println("Gustavo tiene " + this.age + " años.");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("Se destryyo el servlet");
    }
}
