
package Modelos;

import javax.swing.JOptionPane;

/**
 *
 * @author umg
 */
public class Lista {
    Nodo primero;
    Nodo Auxiliar;
    
    String cadena = "";
    
    public void Agregar()
    {
        
    }
    
    public void Agregar(String nombres, String apellidos){
                Nodo nuevoNodo = new Nodo(nombres, apellidos);
        if(primero == null)
        {
            primero = nuevoNodo;
        }
        else{
            nuevoNodo.siguiente = primero;
            primero = nuevoNodo;
        }
        
        JOptionPane.showMessageDialog(null, "Correcto");
    }
    
    public String Listar()
    {
        Auxiliar = primero;
        cadena = "";
        while(Auxiliar != null)
        {
            cadena = cadena + "[" +Auxiliar.getApellidos()+ Auxiliar.getNombres()+"]";
            Auxiliar = Auxiliar.siguiente;
        }
        return cadena;
    }
}
