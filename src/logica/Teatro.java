package logica;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.awt.Image;

import conexionBD.Conector;

public class Teatro implements IDirLogistica, IEncSuscripciones, IPublicista, IEncReservas, IEncPagos {

	private int totalRecaudado;

	private Evento evento;

	private Reserva reserva;

	private Suscripcion suscripcion;

	private Sala sala;
	
	private Conector con;
	
	private ResultSet tabla;
	
	public Teatro() {

	}
	
	public Evento consultarEvento(String nombre) {
		con = new Conector("localhost", "BDTeatro", "postgres", "Yamile_00");
		con.SetCadena("SELECT * FROM evento WHERE s_nombre='" + nombre + "';");
		tabla = con.consultar();
		try {
			evento = new Evento(tabla.getDate("f_evento"), nombre, tabla.getInt("n_edad_min"), tabla.getInt("n_val_base"));
		} catch (Exception e) {
			return null;
		}
		con.cerrar();
		return evento;
	}

	public void modificarSeccion() {
		//FIXME hay que revisar la sala primero
	}


	/**
	 * @see logica.IDirLogistica#crearEvento(java.util.Date, java.lang.String, int, int)
	 */
	public void crearEvento(Date f, String nom, int ed, int val) {		
		con = new Conector("localhost", "BDTeatro", "postgres", "Yamile_00");


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
		con = new Conector("localhost", "BDTeatro", "postgres", "Yamile_00");
		con.SetCadena("SELECT * FROM suscripcion WHERE n_cedula=" + cedula + "';");
		tabla = con.consultar();
		try {
			suscripcion = new Suscripcion(cedula, tabla.getString("s_nombre"), tabla.getInt("n_cupo"));
		} catch (Exception e) {
			return null;
		}
		con.cerrar();
		return suscripcion;
	}


	/**
	 * @see logica.IEncSuscripciones#crearSuscripcion(int, java.lang.String)
	 */
	public void crearSuscripcion(int cc, String nom) {
		Suscripcion sus = new Suscripcion(cc, nom, 0);

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
		consultarEvento(evento).darAnuncio().setSlogan(slogan);
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
		con = new Conector("localhost", "BDTeatro", "postgres", "Yamile_00");
		con.SetCadena("SELECT * FROM reserva WHERE n_cedula=" + cedula + "';");
		tabla = con.consultar();
		try {
			//reserva = new Reserva();
		} catch (Exception e) {
			return null;
		}
		con.cerrar();
		return reserva;		

	}


	/**
	 * @see logica.IEncReservas#crearReserva(int, java.lang.String, logica.Silla)
	 */
	public void crearReserva(int cc, String evento, Silla sillas) {
		Reserva res = new Reserva(cc, evento);

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
