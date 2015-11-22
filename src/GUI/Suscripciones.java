package GUI;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Suscripciones extends JFrame implements Contrase�a{

    private final JButton btnActualizar;
    private final JButton btnConsultar;
    private final JButton btnCrear;
    
    public Suscripciones() {
        btnActualizar = new JButton();
        btnConsultar = new JButton();
        btnCrear = new JButton();
        
        btnActualizar.setText("Actualizar cupos de suscripcion");
        btnActualizar.setBounds(35, 34, 230, 23);

        btnConsultar.setText("Consultar suscripcion");
        btnConsultar.setBounds(35, 75, 230, 23);

        btnCrear.setText("Crear suscripcion");
        btnCrear.setBounds(35, 116, 230, 23);

        Container contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.add(btnActualizar);
        contenedor.add(btnConsultar);
        contenedor.add(btnCrear);
        
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setTitle("Suscripciones");
        this.setBounds(20, 20, 320, 200);
        this.setVisible(true);
    }

    @Override
    public int getContrase�a() {
        return 5550;
    }
    
}
