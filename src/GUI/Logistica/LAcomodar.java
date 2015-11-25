package GUI.Logistica;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
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
    
    private final JLabel[][] mtzPalco1;
    private final JLabel[][] mtzPalco2;
    private final JLabel[][] mtzPalco3;
    private final JLabel[][] mtzPalco4;
    private final JLabel[][] mtzPlatea;
    private final JLabel[][] mtzAnfiteatro;
    
    private final JTextField txtPalco1;
    private final JTextField txtPalco2;
    private final JTextField txtPalco3;
    private final JTextField txtPalco4;
    private final JTextField txtPlatea;
    private final JTextField txtAnfiteatro;
    
    public LAcomodar(Logistica logistica) {
    	
    	Border borde = BorderFactory.createLineBorder(Color.BLACK);
    	
    	
    	
    	Container contenedor = getContentPane();
        contenedor.setLayout(null);
        
        JLabel lblMtzPalco1 = new JLabel();
        lblMtzPalco1.setBounds(20, 30, 50, 23);
        lblMtzPalco1.setText("Palco1");
        contenedor.add(lblMtzPalco1);
        
        mtzPalco1 = new JLabel[3][5];
    	for(int i=0; i<3; i++){
    		for(int j=0; j<5; j++){
    			mtzPalco1[i][j] = new JLabel();
    			mtzPalco1[i][j].setBounds(30*i+20, 30*j+50, 30, 30);
    			mtzPalco1[i][j].setBorder(borde);
    			mtzPalco1[i][j].setName("1");
    			contenedor.add(mtzPalco1[i][j]);
    		}
    	}
    	
    	JLabel lblMtzPalco2 = new JLabel();
        lblMtzPalco2.setBounds(20, 310, 50, 23);
        lblMtzPalco2.setText("Palco2");
        contenedor.add(lblMtzPalco2);
    	
    	mtzPalco2 = new JLabel[3][5];
    	for(int i=0; i<3; i++){
    		for(int j=0; j<5; j++){
    			mtzPalco2[i][j] = new JLabel();
    			mtzPalco2[i][j].setBounds(30*i+20, 30*j+330, 30, 30);
    			mtzPalco2[i][j].setBorder(borde);
    			mtzPalco2[i][j].setName("1");
    			contenedor.add(mtzPalco2[i][j]);
    		}
    	}
    	
    	JLabel lblMtzPalco3 = new JLabel();
        lblMtzPalco3.setBounds(650, 30, 50, 23);
        lblMtzPalco3.setText("Palco3");
        contenedor.add(lblMtzPalco3);
    	
    	mtzPalco3 = new JLabel[3][5];
    	for(int i=0; i<3; i++){
    		for(int j=0; j<5; j++){
    			mtzPalco3[i][j] = new JLabel();
    			mtzPalco3[i][j].setBounds(30*i+650, 30*j+50, 30, 30);
    			mtzPalco3[i][j].setBorder(borde);
    			mtzPalco3[i][j].setName("1");
    			contenedor.add(mtzPalco3[i][j]);
    		}
    	}
    	
    	JLabel lblMtzPalco4 = new JLabel();
        lblMtzPalco4.setBounds(650, 310, 50, 23);
        lblMtzPalco4.setText("Palco4");
        contenedor.add(lblMtzPalco4);
    	
    	mtzPalco4 = new JLabel[3][5];
    	for(int i=0; i<3; i++){
    		for(int j=0; j<5; j++){
    			mtzPalco4[i][j] = new JLabel();
    			mtzPalco4[i][j].setBounds(30*i+650, 30*j+330, 30, 30);
    			mtzPalco4[i][j].setBorder(borde);
    			mtzPalco4[i][j].setName("1");
    			contenedor.add(mtzPalco4[i][j]);
    		}
    	}
    	
    	
    	JLabel lblMtzAnfiteatro = new JLabel();
        lblMtzAnfiteatro.setBounds(150, 30, 80, 23);
        lblMtzAnfiteatro.setText("Anfiteatro");
        contenedor.add(lblMtzAnfiteatro);
        
    	mtzAnfiteatro = new JLabel[15][8];
    	for(int i=0; i<15; i++){
    		for(int j=0; j<8; j++){
    			mtzAnfiteatro[i][j] = new JLabel();
    			mtzAnfiteatro[i][j].setBounds(30*i+150, 30*j+50, 30, 30);
    			mtzAnfiteatro[i][j].setBorder(borde);
    			mtzAnfiteatro[i][j].setName("1");
    			contenedor.add(mtzAnfiteatro[i][j]);
    		}
    	}
    	
    	
    	JLabel lblMtzPlatea = new JLabel();
        lblMtzPlatea.setBounds(150, 310, 80, 23);
        lblMtzPlatea.setText("Platea");
        contenedor.add(lblMtzPlatea);
        
    	mtzPlatea = new JLabel[15][5];
    	for(int i=0; i<15; i++){
    		for(int j=0; j<5; j++){
    			mtzPlatea[i][j] = new JLabel();
    			mtzPlatea[i][j].setBounds(30*i+150, 30*j+330, 30, 30);
    			mtzPlatea[i][j].setBorder(borde);
    			mtzPlatea[i][j].setName("1");
    			contenedor.add(mtzPlatea[i][j]);
    		}
    	}
        
        this.pack();
        this.setBounds(100, 100, 1200, 550);
        this.setVisible(true);
        this.repaint();
    }

    public void paint(Graphics g){
    	super.paint(g);
    	g.drawLine(800, 0, 800, 550);
    }
    
	private void btnCrearActionPerformed() {
		
		
	}
	
	public static void main(String[] args) {
		LAcomodar lAcomodar = new LAcomodar(null);
	}
}
