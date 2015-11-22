package ventanas;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Pagos extends JFrame implements Contraseña{

    private final JButton btnPagar;
    
    public Pagos() {
        btnPagar = new JButton();
        btnPagar.setText("Pagar reserva");
        btnPagar.setBounds(20, 20, 130, 23);
        
        Container contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.add(btnPagar);

        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Pagos");
        this.setBounds(20, 20, 200, 100);
        this.setVisible(true);
    }

    @Override
    public int getContraseña() {
        return 62345;
    }
    
}
