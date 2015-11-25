package logica;

import java.util.ArrayList;
import java.util.Date;
import java.awt.Image;

public class Teatro implements IDirLogistica, IEncSuscripciones, IPublicista, IEncReservas, IEncPagos {

	private int totalRecaudado;

	private ArrayList<Evento> eventos;

	private ArrayList<Reserva> reservas;

	private ArrayList<Suscripcion> suscripciones;

	private ArrayList<Sala> salas;
	
	public Evento consultarEvento(String nombre) {
		Evento e = null;
		for(int i=0; i<eventos.size(); i++) {
			if (nombre == eventos.get(i).darNombre()) {
				e = eventos.get(i);
				break;
			}
		}
		return e;
	}

	public void modificarSeccion() {
		//FIXME hay que revisar la sala primero
	}


	/**
	 * @see logica.IDirLogistica#crearEvento(java.util.Date, java.lang.String, int, int)
	 */
	public void crearEvento(Date f, String nom, int ed, int val) {
		Evento e = new Evento(f, nom, ed, val);
		eventos.add(e);
	}


	/**
	 * @see logica.IDirLogistica#modificarEvento(java.lang.String, java.util.Date)
	 */
	public void modificarEvento(String nom, Date f) {
		consultarEvento(nom).cambiarFecha(f);
	}


	/**
	 * @see logica.IEncSuscripciones#consultarSuscripcion(int)
	 */
	public Suscripcion consultarSuscripcion(int cedula) {
		Suscripcion sus = null;
		for(int i=0; i<suscripciones.size(); i++) {
			if (cedula == suscripciones.get(i).darCedula()) {
				sus = suscripciones.get(i);
				break;
			}
		}
		return sus;
	}


	/**
	 * @see logica.IEncSuscripciones#crearSuscripcion(int, java.lang.String)
	 */
	public void crearSuscripcion(int cc, String nom) {
		Suscripcion sus = new Suscripcion(cc, nom);
		suscripciones.add(sus);
	}


	/**
	 * @see logica.IEncSuscripciones#actualizarSuscripcion(int)
	 */
	public void actualizarSuscripcion(int cc, int cant) {
		consultarSuscripcion(cc).aumentarCupo(cant);
	}


	/**
	 * @see logica.IPublicista#agregarAnuncio(java.lang.String, java.util.Image)
	 */
	public void agregarAnuncio(String evento, Image slogan) {
		consultarEvento(evento);//...
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
		Reserva res = null;
		for(int i=0; i<reservas.size(); i++) {
			if (cedula == reservas.get(i).darCedulaCliente()) {
				res = reservas.get(i);
				break;
			}
		}
		return res;
	}


	/**
	 * @see logica.IEncReservas#crearReserva(int, java.lang.String, logica.Silla)
	 */
	public void crearReserva(int cc, String evento, Silla sillas) {
		Reserva res = new Reserva(cc, evento);
		reservas.add(res);
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
		return totalRecaudado;
	}


	/**
	 * @see logica.IEncPagos#pagarReserva(int)
	 */
	public void pagarReserva(int valor) {
		totalRecaudado += valor;
	}

}
