package logica;

public class Suscripcion {

	private int cedula;

	private String nombre;

	private int cupo;	

	public Suscripcion(int cedula, String nombre, int cupo) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.cupo = cupo;
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
