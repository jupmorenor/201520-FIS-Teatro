package GUI.Publicidad;

import java.awt.Container;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PAgregar extends JFrame{
	
	private final JTextField txtEvento;
	private final JButton btnCargarImagen;
    private final JButton btnCrear;
    private Icon imagen;
    
    private final Publicidad publicidad;
    
    public PAgregar(Publicidad publicidad) {
    	
    	this.publicidad = publicidad;
    	
    	JLabel lblEvento = new JLabel();
    	JLabel lblImagen = new JLabel();
    	txtEvento = new JTextField();
    	btnCargarImagen = new JButton();
        btnCrear = new JButton();
        
        lblEvento.setText("Evento: ");
        lblEvento.setBounds(20, 20, 60, 23);
        
        lblImagen.setText("Imagen: ");
        lblImagen.setBounds(20, 50, 60, 23);
        
        txtEvento.setBounds(80, 20, 130, 23);
        
        btnCargarImagen.setText("Cargar imagen");
        btnCargarImagen.addActionListener(e -> btnCargarImagenActionPerformed());
        btnCargarImagen.setBounds(80, 50, 130, 23);
        
        btnCrear.setText("Crear");
        btnCrear.addActionListener(e -> btnAgregarActionPerformed());
        btnCrear.setBounds(20, 90, 190, 23);

        Container contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.add(lblEvento);
        contenedor.add(lblImagen);
        contenedor.add(btnCrear);
        contenedor.add(txtEvento);
        contenedor.add(btnCargarImagen);
        
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setBounds(300, 300, 260, 170);
        this.setVisible(true);
    }

	private void btnCargarImagenActionPerformed() {
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", "png");
		JFileChooser fileChooserCargar = new JFileChooser();
		fileChooserCargar.setFileFilter(filtro);
		fileChooserCargar.setDialogTitle("Abrir");
		 
		int seleccion = fileChooserCargar.showOpenDialog(this);
			 
		if (seleccion == JFileChooser.APPROVE_OPTION) {
			File file = fileChooserCargar.getSelectedFile();
			imagen = new ImageIcon(file.toString());			
		}
	}

	private void btnAgregarActionPerformed() {
		publicidad.pasarDatosAgregar(imagen, txtEvento.getText());
	}

}
