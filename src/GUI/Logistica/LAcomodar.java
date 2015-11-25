package GUI.Logistica;

import java.awt.Color;
import java.awt.Container;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 * Esta ventana se encarga del proceso de
 * creacion de un evento
 */
public class LAcomodar extends JFrame{
    
    private final JLabel[][] palco1;
    private final JLabel[][] palco2;
    private final JLabel[][] palco3;
    private final JLabel[][] palco4;
    private final JLabel[][] platea;
    private final JLabel[][] anfiteatro;

    
    public LAcomodar(Logistica logistica) {
    	
    	Border borde = BorderFactory.createLineBorder(Color.BLACK);
    	
    	
    	
    	Container contenedor = getContentPane();
        contenedor.setLayout(null);
        
        JLabel lblPalco1 = new JLabel();
        lblPalco1.setBounds(30, 30, 50, 23);
        lblPalco1.setText("Palco1");
        contenedor.add(lblPalco1);
        
        palco1 = new JLabel[2][3];
    	for(int i=0; i<2; i++){
    		for(int j=0; j<3; j++){
    			palco1[i][j] = new JLabel();
    			palco1[i][j].setBounds(30*i+20, 30*j+55, 30, 30);
    			palco1[i][j].setBorder(borde);
    			contenedor.add(palco1[i][j]);
    		}
    	}
    	
    	JLabel lblPalco2 = new JLabel();
        lblPalco2.setBounds(30, 190, 50, 23);
        lblPalco2.setText("Palco2");
        contenedor.add(lblPalco2);
    	
    	palco2 = new JLabel[2][3];
    	for(int i=0; i<2; i++){
    		for(int j=0; j<3; j++){
    			palco2[i][j] = new JLabel();
    			palco2[i][j].setBounds(30*i+20, 30*j+215, 30, 30);
    			palco2[i][j].setBorder(borde);
    			contenedor.add(palco2[i][j]);
    		}
    	}
    	
    	JLabel lblPalco3 = new JLabel();
        lblPalco3.setBounds(430, 30, 50, 23);
        lblPalco3.setText("Palco3");
        contenedor.add(lblPalco3);
    	
    	palco3 = new JLabel[2][3];
    	for(int i=0; i<2; i++){
    		for(int j=0; j<3; j++){
    			palco3[i][j] = new JLabel();
    			palco3[i][j].setBounds(30*i+420, 30*j+55, 30, 30);
    			palco3[i][j].setBorder(borde);
    			contenedor.add(palco3[i][j]);
    		}
    	}
    	
    	JLabel lblPalco4 = new JLabel();
        lblPalco4.setBounds(430, 190, 50, 23);
        lblPalco4.setText("Palco4");
        contenedor.add(lblPalco4);
    	
    	palco4 = new JLabel[2][3];
    	for(int i=0; i<2; i++){
    		for(int j=0; j<3; j++){
    			palco4[i][j] = new JLabel();
    			palco4[i][j].setBounds(30*i+420, 30*j+215, 30, 30);
    			palco4[i][j].setBorder(borde);
    			contenedor.add(palco4[i][j]);
    		}
    	}
    	
    	anfiteatro = new JLabel[10][4];
    	for(int i=0; i<10; i++){
    		for(int j=0; j<4; j++){
    			anfiteatro[i][j] = new JLabel();
    			anfiteatro[i][j].setBounds(30*i+100, 30*j+40, 30, 30);
    			anfiteatro[i][j].setBorder(borde);
    			contenedor.add(anfiteatro[i][j]);
    		}
    	}
    	
    	platea = new JLabel[10][4];
    	for(int i=0; i<10; i++){
    		for(int j=0; j<4; j++){
    			platea[i][j] = new JLabel();
    			platea[i][j].setBounds(30*i+100, 30*j+200, 30, 30);
    			platea[i][j].setBorder(borde);
    			contenedor.add(platea[i][j]);
    		}
    	}
    	
    	
        

        
        
        
        this.pack();
        this.setBounds(300, 200, 600, 400);
        this.setVisible(true);
    }

	private void btnCrearActionPerformed() {
		
		
	}
	
	public static void main(String[] args) {
		LAcomodar lAcomodar = new LAcomodar(null);
	}
}
