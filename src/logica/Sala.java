package logica;

import java.util.ArrayList;

public class Sala {

	private ArrayList<Seccion> secciones;

	private Evento evento;
	
	public Sala() {
		secciones = new ArrayList<Seccion>();
		secciones.add(new Seccion(75, Seccion.PLATEA));
		secciones.add(new Seccion(120, Seccion.ANFITEATRO));
		secciones.add(new Seccion(15, Seccion.PALCO));
		secciones.add(new Seccion(15, Seccion.PALCO));
		secciones.add(new Seccion(15, Seccion.PALCO));
		secciones.add(new Seccion(15, Seccion.PALCO));
	}

	public Seccion darSeccion(String id) {
		return null;
	}

	public Silla consultarDisponibilidadSillas(String evento) {
		return null;
	}

}
