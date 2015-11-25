package logica;

public class Silla{

	public static final String DISPONIBLE = "DISPONIBLE";

	public static final String RESERVADA = "RESERVADA";

	public static final String OCUPADA = "OCUPADA";

	private String estado;
	
	private String seccion;

	private char fila;

	private int numero;
	
	private int reserva;

	public Silla(char fila, int numero, String seccion) {
		this.fila = fila;
		this.numero = numero;
		this.seccion = seccion;
		this.estado = null;
	}

	public boolean estaDisponible() {
		return estado == DISPONIBLE;
	}

	public boolean estaOcupado() {
		return estado == OCUPADA;
	}

	public boolean estaReservada() {
		return estado == RESERVADA;
	}

	public char darFila() {
		return fila;
	}

	public int darNumero() {
		return numero;
	}
	
	public String darSeccion() {
		return seccion;
	}

	public void reservarSilla(int reserva) {
		this.reserva = reserva;
		estado = RESERVADA;
	}

	public void venderSilla() {
		estado = OCUPADA;
	}

	public void dejarDisponible() {
		estado = DISPONIBLE;
	}

}
