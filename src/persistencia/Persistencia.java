package persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Clase que lee los datos de acceso a la BD desde un archivo de texto
 * @author Juanpa y Yami
 *
 */
public class Persistencia {
	
	private BufferedReader acceso;
	private ArrayList<String> datos;
	
	public Persistencia() {

	}
	
	public void cargarDatos(String ubicacion) {
		try {
			acceso = new BufferedReader(new FileReader(ubicacion));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<String> leerDatos() {
		String linea;
		datos = new ArrayList<String>();
		try {
			while((linea = acceso.readLine())!=null) {
				datos.add(linea);
			}
			acceso.close();
		} catch (Exception e) {
			datos.add(null);
		}
		return datos;
	}
}
