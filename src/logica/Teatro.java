package logica;

import java.util.Date;
import java.awt.Image;

public class Teatro implements IDirLogistica, IEncSuscripciones, IPublicista, IEncReservas, IEncPagos {

	private int totalRecaudado;

	private Evento[] eventos;

	private Reserva[] reservas;

	private Suscripcion[] suscripciones;

	private Sala[] salas;

	public Evento consultarEvento(String nombre) {
		return null;
	}

	public void modificarSeccion() {

	}


	/**
	 * @see logica.IDirLogistica#crearEvento(java.util.Date, java.lang.String, int, int)
	 */
	public void crearEvento(Date f, String nom, int ed, int val) {

	}


	/**
	 * @see logica.IDirLogistica#modificarEvento(java.lang.String, java.util.Date)
	 */
	public void modificarEvento(String nom, Date f) {

	}


	/**
	 * @see logica.IEncSuscripciones#consultarSuscripcion(int)
	 */
	public Suscripcion consultarSuscripcion(int cedula) {
		return null;
	}


	/**
	 * @see logica.IEncSuscripciones#crearSuscripcion(int, java.lang.String)
	 */
	public void crearSuscripcion(int cc, String nom) {

	}


	/**
	 * @see logica.IEncSuscripciones#actualizarSuscripcion(int)
	 */
	public void actualizarSuscripcion(int cc) {

	}


	/**
	 * @see logica.IPublicista#agregarAnuncio(java.lang.String, java.util.Image)
	 */
	public void agregarAnuncio(String evento, Image slogan) {

	}


	/**
	 * @see logica.IPublicista#publicarAnuncio(java.lang.String)
	 */
	public void publicarAnuncio(String evento) {

	}


	/**
	 * @see logica.IPublicista#consultarAnuncio(java.lang.String)
	 */
	public Anuncio consultarAnuncio(String evento) {
		return null;
	}


	/**
	 * @see logica.IEncReservas#consultartReserva(int)
	 */
	public Reserva consultartReserva(int cedula) {
		return null;
	}


	/**
	 * @see logica.IEncReservas#crearReserva(int, java.lang.String, logica.Silla)
	 */
	public void crearReserva(int cc, String evento, Silla sillas) {

	}


	/**
	 * @see logica.IEncReservas#eliminarReserva(int)
	 */
	public void eliminarReserva(int cc) {

	}


	/**
	 * @see logica.IEncPagos#darTotalRecaudado()
	 */
	public int darTotalRecaudado() {
		return 0;
	}


	/**
	 * @see logica.IEncPagos#pagarReserva(int)
	 */
	public void pagarReserva(int valor) {

	}

}
