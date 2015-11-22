package GUI;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Subcripciones extends JFrame implements Contraseña{

    private final JButton btnActualizar;
    private final JButton btnConsultar;
    private final JButton btnCrear;
    
    public Subcripciones() {
        btnActualizar = new JButton();
        btnConsultar = new JButton();
        btnCrear = new JButton();
        
        btnActualizar.setText("Actualizar cupos de subscripcion");
        btnActualizar.setBounds(35, 34, 230, 23);

        btnConsultar.setText("Consultar subscripcion");
        btnConsultar.setBounds(35, 75, 230, 23);

        btnCrear.setText("Crear subcripcion");
        btnCrear.setBounds(35, 116, 230, 23);

        Container contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.add(btnActualizar);
        contenedor.add(btnConsultar);
        contenedor.add(btnCrear);
        
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setTitle("Subscripciones");
        this.setBounds(20, 20, 320, 200);
        this.setVisible(true);
    }

    @Override
    public int getContraseña() {
        return 5550;
    }
    
}
