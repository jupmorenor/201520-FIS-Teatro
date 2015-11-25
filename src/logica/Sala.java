package logica;

import java.util.ArrayList;

public class Sala {

	private ArrayList<Seccion> secciones;

	private Evento evento;
	
	private String nombre;
	
	public Sala(String nom) {
		nombre = nom;
		secciones = new ArrayList<Seccion>();
		secciones.add(new Seccion(Seccion.PLATEA));
		secciones.add(new Seccion(Seccion.ANFITEATRO));
		secciones.add(new Seccion(Seccion.PALCO));
		secciones.add(new Seccion(Seccion.PALCO));
		secciones.add(new Seccion(Seccion.PALCO));
		secciones.add(new Seccion(Seccion.PALCO));
	}

	public Seccion darSeccion(String id) {
		Seccion sec;
		
		return null;
	}

	public Silla[][] consultarDisponibilidadSillas(String evento) {
		
		return null;
	}

	public String getNombre() {
		return nombre;
	}

}
