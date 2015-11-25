package logica;

public class Suscripcion {

	private int cedula;

	private String nombre;

	private int cupo;

	private Reserva reserva;

	public Suscripcion(int cedula, String nombre) {
		this.cedula = cedula;
		this.nombre = nombre;
	}

	public int darCedula() {
		return cedula;
	}

	public String darNombre() {
		return nombre;
	}

	public int darCupo() {
		return cupo;
	}

	public void aumentarCupo(int cant) {
		cupo+=cant;
	}

}
