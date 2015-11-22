package ventanas;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Ingreso extends JFrame {

    private final JButton btnIngresar;
    private final JTextField txtContraseña;
    private final JTextField txtTipo;
    
    public Ingreso() {
        
        JLabel lblTipo = new JLabel();
        JLabel lblContraseña = new JLabel();
        txtTipo = new JTextField();
        txtContraseña = new JTextField();
        btnIngresar = new JButton();
        
        lblTipo.setText("Tipo de empleado:");
        lblTipo.setBounds(30, 30, 110, 14);
        
        txtTipo.setBounds(146, 27, 91, 20);

        lblContraseña.setText("Contraseña: ");
        lblContraseña.setBounds(30, 73, 110, 14);
        
        txtContraseña.setBounds(146, 70, 91, 20);

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(e -> btnIngresarActionPerformed());
        btnIngresar.setBounds(30, 117, 207, 23);

        Container contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.add(lblTipo);
        contenedor.add(txtTipo);
        contenedor.add(lblContraseña);
        contenedor.add(txtContraseña);
        contenedor.add(btnIngresar);
        
        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(20, 20, 300, 200);
        this.setVisible(true);
    }

    private void btnIngresarActionPerformed() {
        String tipo = txtTipo.getText();
        int contraseña1 = Integer.parseInt(txtContraseña.getText());
        
        Contraseña acceso = null;
        
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
            if (acceso.getContraseña() == contraseña1) {
                System.out.println("Se accedio corectamente");
                this.dispose();
            } else {
                System.out.println("ContraseÃ±a incorrecta");
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
