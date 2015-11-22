package logica;

public class Silla {

	private final String DISPONIBLE = "DISPONIBLE";

	private final String RESERVADA = "RESERVADA";

	private final String OCUPADA = "OCUPADA";

	private String estado;

	private char fila;

	private int numero;

	public Silla(char fila, int numero, String seccion) {

	}

	public boolean estaDisponible() {
		return false;
	}

	public boolean estaOcupado() {
		return false;
	}

	public boolean estaReservada() {
		return false;
	}

	public char darFila() {
		return 0;
	}

	public int darNumero() {
		return 0;
	}

	public void reservarSilla() {

	}

	public void venderSilla() {

	}

	public void dejarDisponible() {

	}

}
