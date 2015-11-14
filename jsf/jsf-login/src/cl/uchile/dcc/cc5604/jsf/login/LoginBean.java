package cl.uchile.dcc.cc5604.jsf.login;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * This class implements a Login Bean
 */
@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean {

    /** The customer's username */
    private String username;

    /** the customer's password */
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String login(){
        return "";
    }
}
