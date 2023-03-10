
package Modelos;

/**
 *
 * @author umg
 */
public class Nodo {
    String apellidos;
    String nombres;
    
    Nodo siguiente;

    public Nodo(String apellidos, String nombres) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.siguiente = null;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }    
}
