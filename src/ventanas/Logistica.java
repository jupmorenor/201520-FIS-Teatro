package ventanas;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Logistica extends JFrame implements Contraseña{

    private final JButton btnConsultar;
    private final JButton btnCrear;
    
    public Logistica() {
        btnCrear = new JButton();
        btnConsultar = new JButton();

        btnCrear.setText("Crear evento");
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

    @Override
    public int getContraseña() {
        return 12345;
    }

}
