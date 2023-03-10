
package Controladores;

import Modelos.Lista;
import Vistas.frmIngresoPacientes;
import Vistas.frmListaPacientes;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author umg
 */
public class NodoController implements ActionListener {
    frmPrincipal vistaPrincipal;
    frmIngresoPacientes vistaIngreso;
    frmListaPacientes vistaLista;
    Lista nuevaLista;

    public NodoController(frmPrincipal vistaPrincipal, frmIngresoPacientes vistaIngreso, Lista nuevaLista) {
        this.vistaPrincipal = vistaPrincipal;
        this.vistaIngreso = vistaIngreso;
        this.nuevaLista = nuevaLista;
        
        
        this.vistaPrincipal.btnAgregarPacientes.addActionListener(this);
        this.vistaPrincipal.btnListaPacientes.addActionListener(this);
        
        
        this.vistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.vistaPrincipal.setVisible(true);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.vistaPrincipal.btnAgregarPacientes)
        {
            this.vistaIngreso.btnAgregar.addActionListener(this);
            
            this.vistaIngreso.setLocationRelativeTo(null);
            this.vistaIngreso.setVisible(true);
        }
        if(e.getSource() == this.vistaPrincipal.btnListaPacientes)
        {
            this.vistaLista.setLocationRelativeTo(null);
            this.vistaLista.setVisible(true);
        }
        if(e.getSource () == this.vistaIngreso.btnAgregar);
        {
            
            this.nuevaLista.Agregar(this.vistaIngreso.txtApellidos.getText(),
                    this.vistaIngreso.txtNombre.getText());
           
            this.vistaLista.txtLista.setText(this.nuevaLista.Listar());
        }
    }
    
    
}
