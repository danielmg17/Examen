
import Controladores.NodoController;
import Modelos.Lista;
import Vistas.frmIngresoPacientes;
import Vistas.frmListaPacientes;
import Vistas.frmPrincipal;


public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        frmPrincipal vistaPrincipal = new frmPrincipal();
        frmIngresoPacientes vistaIngreso = new frmIngresoPacientes(vistaPrincipal, true);
        frmListaPacientes vistaLista = new frmListaPacientes(vistaPrincipal,true);
        
        Lista  nuevaLista = new Lista();
        
        //Levantar el controlador        
        NodoController nuevoControlador = new NodoController(vistaPrincipal,vistaIngreso,nuevaLista);
        
        
        
        
    }
    
}
