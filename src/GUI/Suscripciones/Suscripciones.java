package GUI.Suscripciones;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

import GUI.Contraseña;
import logica.IEncSuscripciones;
import logica.Suscripcion;
import logica.Teatro;

/**
 * Esta ventana es hecha para que el encargado de subscripciones
 * pueda interactuar con el sistema
 *
 */
public class Suscripciones extends JFrame implements Contraseña{

    private final JButton btnActualizar;
    private final JButton btnConsultar;
    private final JButton btnCrear;
    private final IEncSuscripciones iEncSuscripciones;
    private SCrear sCrear;
    
    public Suscripciones() {
        
    	iEncSuscripciones = new Teatro();
    	
        btnCrear = new JButton();
        btnConsultar = new JButton();
        btnActualizar = new JButton();
        
        btnCrear.setText("Crear suscripcion");
        btnCrear.addActionListener(e -> btnCrearActionPerformed());
        btnCrear.setBounds(30, 30, 170, 23);
        
        btnConsultar.setText("Consultar suscripcion");
        btnConsultar.addActionListener(e -> btnConsultarActionPerformed());
        btnConsultar.setBounds(30, 70, 170, 23);
        
        btnActualizar.setText("Actualizar cupos");
        btnActualizar.setBounds(30, 110, 170, 23);

        Container contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.add(btnActualizar);
        contenedor.add(btnConsultar);
        contenedor.add(btnCrear);
        
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setTitle("Suscripciones");
        this.setBounds(20, 20, 240, 200);
        this.setVisible(true);
    }

    private void btnConsultarActionPerformed() {
    	String dato = JOptionPane.showInputDialog("Ingrese la cedula");
    	int cedula = Integer.parseInt(dato);
    	Suscripcion suscripcion = iEncSuscripciones.consultarSuscripcion(cedula);
    	SConsultar sConsultar = new SConsultar(suscripcion);
	}

	private void btnCrearActionPerformed() {
		sCrear = new SCrear(this);
	}
    
    public void pasarDatosCrear(String nom, int cc){
    	iEncSuscripciones.crearSuscripcion(cc, nom);
    }

	@Override
    public int getContraseña() {
        return 5550;
    }
    
	public static void main(String[] args) {
		new Suscripciones();
	}
}
