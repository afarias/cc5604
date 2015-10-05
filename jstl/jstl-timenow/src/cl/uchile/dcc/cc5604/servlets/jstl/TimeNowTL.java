package cl.uchile.dcc.cc5604.servlets.jstl;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.util.Date;

/**
 * This class implements a Custom Tag Lib for displaying the current time.
 *
 * @author Andrés Farías
 */
public class TimeNowTL extends TagSupport {

    /**
     * This method will be invoked at the end of the TagLib life cycle.
     */
    @Override
    public int doEndTag() throws JspException {

        /* The writer to write onto the response */
        JspWriter out = pageContext.getOut();

        try {
            out.println("La hora actual es: " + (new Date()));
        } catch (Exception e) {
            System.out.println("Problemas con el I/O.");
        }

        return super.doEndTag();
    }
}
