package GUI.Logistica;

import java.awt.Container;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import GUI.Contraseña;
import logica.IDirLogistica;
import logica.Teatro;

public class Logistica extends JFrame implements Contraseña{

    private final JButton btnConsultar;
    private final JButton btnCrear;
    
    private LCrear lCrear;
    private final IDirLogistica iDirLogistica;
    
    public Logistica() {
    	
    	this.iDirLogistica = new Teatro();
    	
        btnCrear = new JButton();
        btnConsultar = new JButton();

        btnCrear.setText("Crear evento");
        btnCrear.addActionListener(e -> btnCrearActionPerformed());
        btnCrear.setBounds(20, 30, 150, 23);

        btnConsultar.setText("Consultar evento");
        btnConsultar.setBounds(20, 70, 150, 23);

        Container contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.add(btnCrear);
        contenedor.add(btnConsultar);
        
        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Logistica");
        this.setBounds(20, 20, 200, 150);
        this.setVisible(true);
    }

    private void btnCrearActionPerformed() {
		lCrear = new LCrear(this);
	}
    
    public void pasarDatosCrear(Date fecha, String nombre, int edad, int valor){
    	iDirLogistica.crearEvento(fecha, nombre, edad, valor);
    }

	@Override
    public int getContraseña() {
        return 12345;
    }
    
    public static void main(String[] args) {
		Logistica logistica = new Logistica();
	}

}
