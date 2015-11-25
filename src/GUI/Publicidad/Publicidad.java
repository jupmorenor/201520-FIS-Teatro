package GUI.Publicidad;

import java.awt.Container;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import GUI.Contraseña;
import GUI.Suscripciones.Suscripciones;
import logica.IPublicista;
import logica.Teatro;

/**
 * Esta ventana esta creada para que el publicista
 * pueda interactuar con el sistema *
 */
public class Publicidad extends JFrame implements Contraseña{

    private final JButton btnAgregar;
    private final JButton btnConsultar;
    private final JButton btnPublicar;
    
    private final IPublicista iPublicista;
    
    private PAgregar pAgregar;
    
    public Publicidad() {
        
    	iPublicista = new Teatro();
    	
        btnAgregar = new JButton();
        btnConsultar = new JButton();
        btnPublicar = new JButton();
        
        btnAgregar.setText("Agregar anuncio");
        btnAgregar.addActionListener(e -> btnAgregarActionPerformed());
        btnAgregar.setBounds(32, 27, 150, 23);

        btnConsultar.setText("Consultar anuncio");
        btnConsultar.setBounds(30, 70, 150, 23);

        btnPublicar.setText("Publicar anuncio");
        btnPublicar.setBounds(30, 110, 150, 23);
        
        Container contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.add(btnAgregar);
        contenedor.add(btnConsultar);
        contenedor.add(btnPublicar);
        
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setBounds(20, 20, 240, 200);
        this.setTitle("Publicidad");
        this.setVisible(true);
    }

    private void btnAgregarActionPerformed() {
    	pAgregar = new PAgregar(this);
	}
    
    public void pasarDatosAgregar(Icon slogan, String evento){
    	iPublicista.agregarAnuncio(evento, (Image) slogan);
    }

	@Override
    public int getContraseña() {
        return 56322;
    }

    public static void main(String[] args) {
    	Publicidad publicidad = new Publicidad();
	}
}
