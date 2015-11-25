package persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Persistencia {
	
	private BufferedReader acceso;
	private ArrayList<String> datos;
	
	public Persistencia() {

	}
	
	public void cargarDatos(String ubicacion) throws Exception {
		acceso = new BufferedReader(new FileReader(ubicacion));
	}
	
	public ArrayList<String> leerDatos() throws Exception {
		String linea;
		datos = new ArrayList<String>();
		while((linea = acceso.readLine())!=null) {
			datos.add(linea);
		}
		acceso.close();
		return datos;
	}
	
	public void guardarDatos() {
		
	}
	

}