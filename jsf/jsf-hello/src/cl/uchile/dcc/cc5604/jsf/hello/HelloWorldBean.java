package cl.uchile.dcc.cc5604.jsf.hello;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="hello")
public class HelloWorldBean {

    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
