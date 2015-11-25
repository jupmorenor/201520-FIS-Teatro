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
    
    private final JButton btnActualizar;
    private final JButton btnAceptar;
    
    private final Logistica logistica;
    
    public LAcomodar(Logistica logistica) {
    	
    	this.logistica = logistica;
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
    			mtzPalco1[i][j].setOpaque(true);
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
    			mtzPalco2[i][j].setOpaque(true);
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
    			mtzPalco3[i][j].setOpaque(true);
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
    			mtzPalco4[i][j].setOpaque(true);
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
    			mtzAnfiteatro[i][j].setOpaque(true);
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
    			mtzPlatea[i][j].setOpaque(true);
    			contenedor.add(mtzPlatea[i][j]);
    		}
    	}
        
    	JLabel lblNombre = new JLabel("Sillas disponibles");
    	lblNombre.setBounds(800,20,110,23);
    	contenedor.add(lblNombre);
    	
    	JLabel lblPalco1 = new JLabel("Palco1: ");
    	lblPalco1.setBounds(800, 40 + 20, 70, 23);
    	contenedor.add(lblPalco1);
    	JLabel lblPalco2 = new JLabel("Palco2: ");
    	lblPalco2.setBounds(800, 80 + 20, 70, 23);
    	contenedor.add(lblPalco2);
    	JLabel lblPalco3 = new JLabel("Palco3: ");
    	lblPalco3.setBounds(800, 120 + 20, 70, 23);
    	contenedor.add(lblPalco3);
    	JLabel lblPalco4 = new JLabel("Palco4: ");
    	lblPalco4.setBounds(800, 160 + 20, 70, 23);
    	contenedor.add(lblPalco4);
    	JLabel lblPlatea = new JLabel("Platea: ");
    	lblPlatea.setBounds(800, 200 + 20, 70, 23);
    	contenedor.add(lblPlatea);
    	JLabel lblAnfiteatro = new JLabel("Anfiteatro: ");
    	lblAnfiteatro.setBounds(800, 240 + 20, 70, 23);
    	contenedor.add(lblAnfiteatro);
    	
    	txtPalco1 = new JTextField();
    	txtPalco1.setBounds(880, 40 + 20, 70, 23);
    	contenedor.add(txtPalco1);
    	txtPalco2 = new JTextField();
    	txtPalco2.setBounds(880, 80 + 20, 70, 23);
    	contenedor.add(txtPalco2);
    	txtPalco3 = new JTextField();
    	txtPalco3.setBounds(880, 120 + 20, 70, 23);
    	contenedor.add(txtPalco3);
    	txtPalco4 = new JTextField();
    	txtPalco4.setBounds(880, 160 + 20, 70, 23);
    	contenedor.add(txtPalco4);
    	txtPlatea = new JTextField();
    	txtPlatea.setBounds(880, 200 + 20, 70, 23);
    	contenedor.add(txtPlatea);
    	txtAnfiteatro = new JTextField();
    	txtAnfiteatro.setBounds(880, 240 + 20, 70, 23);
    	contenedor.add(txtAnfiteatro);
    	
    	btnActualizar = new JButton("Actualizar");
    	btnActualizar.addActionListener(e -> btnActualizarActionPerformed());
    	btnActualizar.setBounds(800, 310, 150, 23);
    	contenedor.add(btnActualizar);
    	
    	btnAceptar = new JButton("Aceptar");
    	btnAceptar.addActionListener(e -> btnAceptarActionPerformed());
    	btnAceptar.setBounds(800, 360, 150, 23);
    	contenedor.add(btnAceptar);
    	
        this.pack();
        this.setBounds(100, 100, 1000, 550);
        this.setVisible(true);
        this.repaint();
    }

    private void btnAceptarActionPerformed() {
		int[][] mtzIntPalco1 = new int[3][5];
		int[][] mtzIntPalco2 = new int[3][5];
		int[][] mtzIntPalco3 = new int[3][5];
		int[][] mtzIntPalco4 = new int[3][5];
		int[][] mtzIntPlatea = new int[15][5];
		int[][] mtzIntAnfiteatro = new int[15][8];
		
		for(int i=0; i<3; i++){
    		for(int j=0; j<5; j++){
    			mtzIntPalco1[i][j] = (mtzPalco1[i][j].getBackground() == Color.GREEN ? 0 : 1);
    			mtzIntPalco2[i][j] = (mtzPalco2[i][j].getBackground() == Color.GREEN ? 0 : 1);
    			mtzIntPalco3[i][j] = (mtzPalco3[i][j].getBackground() == Color.GREEN ? 0 : 1);
    			mtzIntPalco4[i][j] = (mtzPalco4[i][j].getBackground() == Color.GREEN ? 0 : 1);
    		}
		}
		
		for(int i=0; i<15; i++){
    		for(int j=0; j<5; j++){
    			mtzIntPlatea[i][j] = (mtzPlatea[i][j].getBackground() == Color.GREEN ? 0 : 1);
    		}
		}
		
		for(int i=0; i<15; i++){
    		for(int j=0; j<8; j++){
    			mtzIntAnfiteatro[i][j] = (mtzAnfiteatro[i][j].getBackground() == Color.GREEN ? 0 : 1);
    		}
		}
		
		logistica.pasarDatosAcomodar(mtzIntPalco1,mtzIntPalco2,mtzIntPalco3,mtzIntPalco4,mtzIntPlatea,mtzIntAnfiteatro);
		this.dispose();
	}

	public void paint(Graphics g){
    	super.paint(g);
    	g.drawLine(800, 0, 800, 550);
    }
    
	private void btnActualizarActionPerformed() {
		int numPalco1 = Integer.parseInt(txtPalco1.getText());
		int numPalco2 = Integer.parseInt(txtPalco2.getText());
		int numPalco3 = Integer.parseInt(txtPalco3.getText());
		int numPalco4 = Integer.parseInt(txtPalco4.getText());
		int numPlatea = Integer.parseInt(txtPlatea.getText());
		int numAnfiteatro = Integer.parseInt(txtAnfiteatro.getText());
		
		for(int i=0, cont=0; i<3; i++){
    		for(int j=0; j<5; j++, cont++){
    			mtzPalco1[i][j].setBackground(cont>=numPalco1 ? Color.GRAY : Color.GREEN);
    			mtzPalco2[i][j].setBackground(cont>=numPalco2 ? Color.GRAY : Color.GREEN);
    			mtzPalco3[i][j].setBackground(cont>=numPalco3 ? Color.GRAY : Color.GREEN);
    			mtzPalco4[i][j].setBackground(cont>=numPalco4 ? Color.GRAY : Color.GREEN);
    		}
		}
		
		for(int i=0, cont=0; i<5; i++){
    		for(int j=0; j<15; j++, cont++){
    			mtzPlatea[j][i].setBackground(cont>=numPlatea ? Color.GRAY : Color.GREEN);
    		}
		}
		
		for(int i=0, cont=0; i<8; i++){
    		for(int j=0; j<15; j++, cont++){
    			mtzAnfiteatro[j][i].setBackground(cont>=numAnfiteatro ? Color.GRAY : Color.GREEN);
    		}
		}
	}
	
	public static void main(String[] args) {
		LAcomodar lAcomodar = new LAcomodar(null);
	}
}
