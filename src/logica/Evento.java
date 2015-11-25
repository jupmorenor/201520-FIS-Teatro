package logica;

import java.util.Date;

public class Evento {

	private Date fecha;

	private String nombre;

	private int edadMinima;

	private int valorBase;

	private Sala sala;

	private Anuncio anuncio;

	public Evento(Date fecha, String nom, int ed, int val) {
		this.fecha = fecha;
		nombre = nom;
		edadMinima = ed;
		valorBase = val;
	}

	public Date darFecha() {
		return fecha;
	}

	public String darNombre() {
		return nombre;
	}

	public int darEdadMinima() {
		return edadMinima;
	}

	public void cambiarFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int darValorBase() {
		return valorBase;
	}

	public void publicarAnuncio() {
		//Publica el anuncio en una red social 
	}

}
