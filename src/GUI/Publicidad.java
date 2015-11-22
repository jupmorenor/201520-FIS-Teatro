package GUI;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Publicidad extends JFrame implements Contraseña{

    private final JButton btnAgregar;
    private final JButton btnConsultar;
    private final JButton btnPublicar;
    
    public Publicidad() {
        
        btnAgregar = new JButton();
        btnConsultar = new JButton();
        btnPublicar = new JButton();
        
        btnAgregar.setText("Agregar anuncion");
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

    @Override
    public int getContraseña() {
        return 56322;
    }

    
}
