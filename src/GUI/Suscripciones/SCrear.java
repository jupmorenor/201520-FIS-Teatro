package GUI.Suscripciones;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 * Esta ventana hace parte del caso de uso
 * crear subscripcion
 *
 */
public class SCrear extends JFrame{
	
	private final JTextField txtNombre;
	private final JTextField txtCedula;
    private final JButton btnCrear;
    
    private final Suscripciones suscripciones;
    
    public SCrear(Suscripciones suscripciones) {
        
    	this.suscripciones = suscripciones;
    	
    	JLabel lblNombre = new JLabel();
    	JLabel lblCedula = new JLabel();
    	txtNombre = new JTextField();
    	txtCedula = new JTextField();
        btnCrear = new JButton();
        
        lblNombre.setText("Nombre: ");
        lblNombre.setBounds(20, 20, 60, 23);
        
        lblCedula.setText("Cedula: ");
        lblCedula.setBounds(20, 50, 60, 23);
        
        txtNombre.setBounds(80, 20, 80, 23);
        txtCedula.setBounds(80, 50, 80, 23);
        
        btnCrear.setText("Crear");
        btnCrear.addActionListener(e -> btnCrearActionPerformed());
        btnCrear.setBounds(20, 90, 140, 23);

        Container contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.add(lblNombre);
        contenedor.add(lblCedula);
        contenedor.add(btnCrear);
        contenedor.add(txtNombre);
        contenedor.add(txtCedula);
        
        this.pack();
        this.setBounds(300, 300, 200, 170);
        this.setVisible(true);
    }

	private void btnCrearActionPerformed() {
		String nombre = txtNombre.getText();
		int cedula = Integer.parseInt(txtCedula.getText());
		suscripciones.pasarDatosCrear(nombre, cedula);
		this.dispose();
	}
}
