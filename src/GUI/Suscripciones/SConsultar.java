package GUI.Suscripciones;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import logica.Suscripcion;

/**
 * Falta completar cupo pero es requerida la logica *
 */
public class SConsultar extends JFrame{
    
    public SConsultar(Suscripcion suscripcion) {
    	
    	JLabel lblNombre = new JLabel();
    	JLabel lblCedula = new JLabel();
    	JLabel txtNombre = new JLabel(suscripcion.darNombre());
    	JLabel txtCedula = new JLabel("" + suscripcion.darCedula());
        
        lblNombre.setText("Nombre: ");
        lblNombre.setBounds(20, 20, 60, 23);
        
        lblCedula.setText("Cedula: ");
        lblCedula.setBounds(20, 50, 60, 23);
        
        txtNombre.setBounds(80, 20, 80, 23);
        txtCedula.setBounds(80, 50, 80, 23);

        Container contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.add(lblNombre);
        contenedor.add(lblCedula);
        contenedor.add(txtNombre);
        contenedor.add(txtCedula);
        
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setBounds(300, 300, 200, 170);
        this.setVisible(true);
    }


}
