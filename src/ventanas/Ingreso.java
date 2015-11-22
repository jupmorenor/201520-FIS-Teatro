package ventanas;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Ingreso extends JFrame {

    private final JButton btnIngresar;
    private final JTextField txtContrase�a;
    private final JTextField txtTipo;
    
    public Ingreso() {
        
        JLabel lblTipo = new JLabel();
        JLabel lblContrase�a = new JLabel();
        txtTipo = new JTextField();
        txtContrase�a = new JTextField();
        btnIngresar = new JButton();
        
        lblTipo.setText("Tipo de empleado:");
        lblTipo.setBounds(30, 30, 110, 14);
        
        txtTipo.setBounds(146, 27, 91, 20);

        lblContrase�a.setText("Contrase�a: ");
        lblContrase�a.setBounds(30, 73, 110, 14);
        
        txtContrase�a.setBounds(146, 70, 91, 20);

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(e -> btnIngresarActionPerformed());
        btnIngresar.setBounds(30, 117, 207, 23);

        Container contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.add(lblTipo);
        contenedor.add(txtTipo);
        contenedor.add(lblContrase�a);
        contenedor.add(txtContrase�a);
        contenedor.add(btnIngresar);
        
        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(20, 20, 300, 200);
        this.setVisible(true);
    }

    private void btnIngresarActionPerformed() {
        String tipo = txtTipo.getText();
        int contrase�a1 = Integer.parseInt(txtContrase�a.getText());
        
        Contrase�a acceso = null;
        
        switch (tipo) {
            case "Encargado reservas":
                acceso = new Reservas();
                break;
            case "Encargado subscripciones":
                acceso = new Subcripciones();
                break;
            case "Director logistica":
                acceso = new Logistica();
                break;
            case "Publicista":
                acceso = new Publicidad();
                break;
            case "Encargado pagos":
                acceso = new Pagos();
                break;
        }
        
        if(acceso != null){
            if (acceso.getContrase�a() == contrase�a1) {
                System.out.println("Se accedio corectamente");
                this.dispose();
            } else {
                System.out.println("Contraseña incorrecta");
                System.exit(0);
            }
        } else {
            System.out.println("Nombre incorrecto");
            System.exit(0);
        }
        
        
        
    }

    public static void main(String args[]) {
        Ingreso ingreso = new Ingreso();
        
    }

    

}
