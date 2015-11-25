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
public class SActualizar extends JFrame{
	
	private final JTextField txtCupos;
	private final JTextField txtCedula;
    private final JButton btnActualizar;
    
    private final Suscripciones suscripciones;
    
    public SActualizar(Suscripciones suscripciones) {
        
    	this.suscripciones = suscripciones;
    	
    	JLabel lblCupo = new JLabel();
    	JLabel lblCedula = new JLabel();
    	txtCupos = new JTextField();
    	txtCedula = new JTextField();
        btnActualizar = new JButton();
        
        lblCupo.setText("Cupo: ");
        lblCupo.setBounds(20, 20, 60, 23);
        
        lblCedula.setText("Cedula: ");
        lblCedula.setBounds(20, 50, 60, 23);
        
        txtCupos.setBounds(80, 20, 80, 23);
        txtCedula.setBounds(80, 50, 80, 23);
        
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(e -> btnCrearActionPerformed());
        btnActualizar.setBounds(20, 90, 140, 23);

        Container contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.add(lblCupo);
        contenedor.add(lblCedula);
        contenedor.add(btnActualizar);
        contenedor.add(txtCupos);
        contenedor.add(txtCedula);
        
        this.pack();
        this.setBounds(300, 300, 200, 170);
        this.setVisible(true);
    }

	private void btnCrearActionPerformed() {
		int cupo = Integer.parseInt(txtCupos.getText());
		int cedula = Integer.parseInt(txtCedula.getText());
		suscripciones.pasarDatosActualizar(cupo, cedula);
		this.dispose();
	}
}
