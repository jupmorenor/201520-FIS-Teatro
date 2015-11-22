package ventanas;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Reservas extends JFrame implements Contraseña{

    private final JButton btnConsultar;
    private final JButton btnCrear;
    private final JButton btnEliminar;
    
    public Reservas() {
        btnCrear = new JButton();
        btnConsultar = new JButton();
        btnEliminar = new JButton();

        btnCrear.setText("Crear reserva");
        btnCrear.setBounds(27, 20, 160, 23);

        btnConsultar.setText("Consultar reserva");
        btnConsultar.setBounds(30, 60, 160, 23);

        btnEliminar.setText("Eliminar reserva");
        btnEliminar.setBounds(30, 100, 160, 23);
        
        Container contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.add(btnCrear);
        contenedor.add(btnConsultar);
        contenedor.add(btnEliminar);
        
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setTitle("Reservas");
        this.setBounds(20, 20, 240, 200);
        this.setVisible(true);
    }

    @Override
    public int getContraseña() {
        return 78463;
    }

    
}
