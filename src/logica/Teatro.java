package logica;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.awt.Image;

import persistencia.Persistencia;
import conexionBD.Conector;

public class Teatro implements IDirLogistica, IEncSuscripciones, IPublicista, IEncReservas, IEncPagos {

	private int totalRecaudado;

	private Evento evento;

	private Reserva reserva;

	private Suscripcion suscripcion;

	private Sala sala;
	
	private Conector con;
	
	private ResultSet tabla;
	
	private Persistencia acceso;
	
	public Teatro() {
		sala = new Sala("Sala 1");
		con = new Conector("localhost", "BDTeatro", "postgres", "Yamile_00");
		con.setCadena("INSERT INTO sala VALUES('" + sala.getNombre() + "');");
	}
	
	/**
	 * Consulta de la BD el evento con el nombre dado y retorna un objeto Evento.
	 * @param nombre Nombre del evento
	 * @return Evento
	 */
	public Evento consultarEvento(String nombre) {
		con = new Conector("localhost", "BDTeatro", "postgres", "Yamile_00");
		con.setCadena("SELECT * FROM evento WHERE s_nombre='" + nombre + "';");
		tabla = con.consultar();
		try {
			tabla.next();
			evento = new Evento(tabla.getDate("f_evento"), nombre, tabla.getInt("n_edad_min"), tabla.getInt("n_val_base"));
		} catch (Exception e) {
			return null;
		}
		con.cerrar();
		return evento;
	}

	public void modificarSeccion(int[][] mtzIntPalco1, int[][] mtzIntPalco2, int[][] mtzIntPalco3,
			int[][] mtzIntPalco4, int[][] mtzIntPlatea, int[][] mtzIntAnfiteatro) {
		ArrayList<Seccion> secciones = sala.darSecciones();
		for (int i=0; i<mtzIntPalco1.length; i++) {
			for (int j=0; j<mtzIntPalco1[i].length; j++) {
				if (mtzIntPalco1[i][j]==1) {
					secciones.get(0).darSillas()[i][j].dejarDisponible();
				}
			}
		}
		
		for (int i=0; i<mtzIntPalco2.length; i++) {
			for (int j=0; j<mtzIntPalco2[i].length; j++) {
				if (mtzIntPalco2[i][j]==1) {
					secciones.get(1).darSillas()[i][j].dejarDisponible();
				}
			}
		}
		
		for (int i=0; i<mtzIntPalco3.length; i++) {
			for (int j=0; j<mtzIntPalco3[i].length; j++) {
				if (mtzIntPalco3[i][j]==1) {
					secciones.get(2).darSillas()[i][j].dejarDisponible();
				}
			}
		}
		
		for (int i=0; i<mtzIntPalco4.length; i++) {
			for (int j=0; j<mtzIntPalco4[i].length; j++) {
				if (mtzIntPalco4[i][j]==1) {
					secciones.get(3).darSillas()[i][j].dejarDisponible();
				}
			}
		}
		
		for (int i=0; i<mtzIntPlatea.length; i++) {
			for (int j=0; j<mtzIntPlatea[i].length; j++) {
				if (mtzIntPlatea[i][j]==1) {
					secciones.get(4).darSillas()[i][j].dejarDisponible();
				}
			}
		}
		
		for (int i=0; i<mtzIntAnfiteatro.length; i++) {
			for (int j=0; j<mtzIntAnfiteatro[i].length; j++) {
				if (mtzIntAnfiteatro[i][j]==1) {
					secciones.get(5).darSillas()[i][j].dejarDisponible();
				}
			}
		}
		
	}

	/**
	 * @see logica.IDirLogistica#crearEvento(java.util.Date, java.lang.String, int, int)
	 */
	public void crearEvento(String f, String nom, int ed, int val, String sala) {		
		String cadena = "INSERT INTO evento(f_evento, s_nombre, n_edad_min, n_val_base";
		String cadena2 = "VALUES('" + f + "', '" + nom + "', " + ed + ", " + val;
		con = new Conector("localhost", "BDTeatro", "postgres", "Yamile_00");
		con.setCadena("SELECT id_sala FROM sala WHERE s_nombre_sala='"+sala+"';");
		tabla = con.consultar();

		try {
			tabla.next();
			cadena += ", id_sala"; 
			cadena2 += ", "  + tabla.getInt("id_sala");
		} catch (Exception e) {
			
		}
		cadena += ") " + cadena2 + ");";
		System.out.println(cadena);
		con.setCadena(cadena);
		con.ejecutarSql();
	}

	/**
	 * @see logica.IDirLogistica#modificarEvento(java.lang.String, java.util.Date)
	 */
	public void modificarEvento(String nom, Date f) {
		evento = consultarEvento(nom);
		evento.cambiarFecha(f);
		con = new Conector("localhost", "BDTeatro", "postgres", "Yamile_00");
		con.setCadena("UPDATE evento SET f_evento='" + evento.darFecha() +
				"' WHERE s_nombre='" + evento.darNombre() + "';");
	}

	/**
	 * @see logica.IEncSuscripciones#consultarSuscripcion(int)
	 */
	public Suscripcion consultarSuscripcion(int cedula) {
		con = new Conector("localhost", "BDTeatro", "postgres", "Yamile_00");
		con.setCadena("SELECT * FROM suscripcion WHERE n_cedula=" + cedula + ";");
		tabla = con.consultar();
		try {
			tabla.next();
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
		con = new Conector("localhost", "BDTeatro", "postgres", "Yamile_00");
		con.setCadena("INSERT INTO suscripcion(n_cedula, s_nombre, n_cupo) VALUES ("+cc+", '"+nom+"', 0);");
		con.ejecutarSql();
	}

	/**
	 * @see logica.IEncSuscripciones#actualizarSuscripcion(int)
	 */
	public void actualizarSuscripcion(int cc, int cant) {
		suscripcion = consultarSuscripcion(cc);
		suscripcion.aumentarCupo(cant);
		con = new Conector("localhost", "BDTeatro", "postgres", "Yamile_00");
		con.setCadena("UPDATE suscripcion SET n_cupo=" + suscripcion.darCupo() +
				" WHERE n_cedula=" + suscripcion.darCedula() + ";");
		con.ejecutarSql();
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
	 * @see logica.IEncReservas#consultarReserva(int)
	 */
	public Reserva consultarReserva(int cedula) {
		try {
			con = new Conector("localhost", "BDTeatro", "postgres", "Yamile_00");
			con.setCadena("SELECT * FROM reserva WHERE n_cedula_cliente=" + cedula + "';");
			tabla = con.consultar();
			tabla.next();
			con.setCadena("SELECT s_nombre FROM evento WHERE id_evento=" + tabla.getInt("id_evento") + ";");
			tabla = con.consultar();
			tabla.next();
			reserva = new Reserva(cedula, tabla.getString("s_nombre"));
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
		String cadena = "INSERT INTO reserva(n_cedula_cliente, " + cc;
		String cadena2 = "VALUES(" + cc;
		con = new Conector("localhost", "BDTeatro", "postgres", "Yamile_00");
		con.setCadena("SELECT id_evento FROM evento WHERE s_nombre='" + evento + "';");
		tabla = con.consultar();
		try {
			cadena += ", id_evento";
			cadena2 += ", " + tabla.getInt("id_evento");
		} catch (Exception e) {
			
		}
		con.setCadena("SELECT id_suscripcion FROM suscripcion WHERE n_cedula_cliente=" + cc + ";");
		tabla = con.consultar();
		try {
			cadena += ", id_suscripcion";
			cadena2 += ", " + tabla.getInt("id_suscripcion");
		} catch (Exception e) {
			
		}
		cadena += ") " + cadena2 + ");";
		con.setCadena(cadena);
		con.ejecutarSql();
	}

	/**
	 * @see logica.IEncReservas#eliminarReserva(int)
	 */
	public void eliminarReserva(int cc) {
		reserva = consultarReserva(cc);
		con = new Conector("localhost", "BDTeatro", "postgres", "Yamile_00");
		con.setCadena("DELETE FROM reserva WHERE n_cedula_cliente=" + reserva.darCedulaCliente() + ";");
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

	public Sala getSala() {
		return sala;
	}
}
