package logica;

import java.util.ArrayList;

public class Sala {

	private ArrayList<Seccion> secciones;

	private Evento evento;
	
	private String nombre;
	
	public Sala(String nom) {
		nombre = nom;
		secciones = new ArrayList<Seccion>();
		secciones.add(new Seccion(Seccion.PALCO, "palco1"));
		secciones.add(new Seccion(Seccion.PALCO, "palco2"));
		secciones.add(new Seccion(Seccion.PALCO, "palco3"));
		secciones.add(new Seccion(Seccion.PALCO, "palco4"));
		secciones.add(new Seccion(Seccion.PLATEA, "platea"));
		secciones.add(new Seccion(Seccion.ANFITEATRO, "anfiteatro"));
		
	}

	public ArrayList<Seccion> darSecciones() {
		return secciones;
	}

	public Silla[][] consultarSillasSeccion(String seccion) {
		Seccion sec = null;
		for (int i=0; i<secciones.size(); i++) {
			if (seccion == secciones.get(i).getId()) {
				sec = secciones.get(i);
				break;
			}
		}
		return sec.darSillas();
	}

	public String getNombre() {
		return nombre;
	}

}
