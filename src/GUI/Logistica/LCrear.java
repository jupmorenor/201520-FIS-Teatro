package GUI.Logistica;

import java.awt.Container;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Esta ventana se encarga del proceso de
 * creacion de un evento
 */
public class LCrear extends JFrame{
	
	private final JTextField txtNombre;
    private final JButton btnCrear;
    private final JComboBox cboDia;
    private final JComboBox cboMes;
    private final JComboBox cboAño;
    private final JTextField txtEdad;
    private final JTextField txtValorBase;
    
    private final Logistica logistica;
    
    public LCrear(Logistica logistica) {
    	
    	this.logistica = logistica;
    	
    	JLabel lblNombre = new JLabel();
    	JLabel lblFecha = new JLabel();
    	JLabel lblEdad = new JLabel();
    	JLabel lblValorBase = new JLabel();
    	txtNombre = new JTextField();
        btnCrear = new JButton();
        cboDia = new JComboBox();
        cboMes = new JComboBox();
        cboAño = new JComboBox();
        txtEdad = new JTextField();
        txtValorBase = new JTextField();
        
        lblNombre.setText("Nombre: ");
        lblNombre.setBounds(10, 20, 70, 23);
        
        lblFecha.setText("Fecha: ");
        lblFecha.setBounds(10, 50, 70, 23);
        
        lblEdad.setText("Edad: ");
        lblEdad.setBounds(10, 80, 70, 23);
        
        lblValorBase.setText("Valor base: ");
        lblValorBase.setBounds(10, 110, 70, 23);
        
        txtNombre.setBounds(80, 20, 140, 23);
        txtEdad.setBounds(80, 80, 140, 23);
        txtValorBase.setBounds(80, 110, 140, 23);
        
        btnCrear.setText("Crear");
        btnCrear.addActionListener(e -> btnCrearActionPerformed());
        btnCrear.setBounds(10, 140, 210, 23);

        
        String[] dias = new String[31];
        for(int i=0; i<dias.length; i++){
        	dias[i] = (i<9 ? "0" + (i+1) : "" + (i+1)); 
        }
        cboDia.setModel(new DefaultComboBoxModel(dias));
        cboDia.setBounds(80, 50, 40, 23);
        
        JLabel division1 = new JLabel("/");
        division1.setBounds(125,50,10,23);
        
        String[] meses = new String[12];
        for(int i=0; i<meses.length; i++){
        	meses[i] = (i<9 ? "0" + (i+1) : "" + (i+1)); 
        }
        cboMes.setModel(new DefaultComboBoxModel(meses));
        cboMes.setBounds(130, 50, 40, 23);
        
        JLabel division2 = new JLabel("/");
        division2.setBounds(175,50,10,23);
        
        String[] años = new String[38];
        for(int i=0; i<años.length; i++){
        	años[i] = (i<9 ? "0" + (i+1) : "" + (i+1)); 
        }
        cboAño.setModel(new DefaultComboBoxModel(años));
        cboAño.setBounds(180, 50, 40, 23);
        
        Container contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.add(lblNombre);
        contenedor.add(lblFecha);
        contenedor.add(lblEdad);
        contenedor.add(lblValorBase);
        contenedor.add(btnCrear);
        contenedor.add(txtNombre);
        contenedor.add(cboDia);
        contenedor.add(cboMes);
        contenedor.add(cboAño);
        contenedor.add(txtEdad);
        contenedor.add(txtValorBase);
        contenedor.add(division1);
        contenedor.add(division2);
        
        
        this.pack();
        this.setBounds(300, 300, 260, 210);
        this.setVisible(true);
    }

	private void btnCrearActionPerformed() {
		
		int dia = Integer.parseInt(cboDia.getSelectedItem().toString());
		int mes = Integer.parseInt(cboMes.getSelectedItem().toString());
		int año = Integer.parseInt(cboAño.getSelectedItem().toString());
		@SuppressWarnings("deprecation")
		Date fecha = new Date(año,mes,dia);
		
		String nombre = txtNombre.getText();
		int edad = Integer.parseInt(txtEdad.getText());
		int valor = Integer.parseInt(txtValorBase.getText());
		
		logistica.pasarDatosCrear(fecha, nombre, edad, valor);
		this.dispose();
	}
}
