package GUI.Logistica;

import java.awt.Container;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import GUI.Contraseña;
import logica.IDirLogistica;
import logica.Teatro;

/**
 * Esta ventana se encarga de que el director de logistica
 * pueda interactuar con el sistema
 */
public class Logistica extends JFrame implements Contraseña{

    private final JButton btnConsultar;
    private final JButton btnCrear;
    
    private LCrear lCrear;
    private LAcomodar lAcomodar;
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
    	iDirLogistica.crearEvento(fecha, nombre, edad, valor, "Sala 1");
    	lAcomodar = new LAcomodar(this);
    }

	@Override
    public int getContraseña() {
        return 12345;
    }
    
    public static void main(String[] args) {
		Logistica logistica = new Logistica();
	}

	public void pasarDatosAcomodar(int[][] mtzIntPalco1, int[][] mtzIntPalco2, int[][] mtzIntPalco3,
			int[][] mtzIntPalco4, int[][] mtzIntPlatea, int[][] mtzIntAnfiteatro) {
		iDirLogistica.modificarSeccion(mtzIntPalco1, mtzIntPalco2, mtzIntPalco3,
				mtzIntPalco4, mtzIntPlatea, mtzIntAnfiteatro);
		
	}

}
