package logica;

import java.util.ArrayList;

public class Seccion {

	public static final String PLATEA = "PLATEA";

	public static final String ANFITEATRO = "ANFITEATRO";

	public static final String PALCO = "PALCO";

	public static final String UTILIZABLE = "UTILIZABLE";

	public static final String LLENO = "LLENO";
	
	private final char filas[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
			'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

	private String tipo;

	private String estado;

	private ArrayList<Silla> sillas;
	
	private int maximoSillas;
	
	public Seccion(int maxSillas, String tipo) {
		sillas = new ArrayList<Silla>();
		maximoSillas = maxSillas;
		estado = UTILIZABLE;
		this.tipo = tipo;
	}

	public boolean esPlatea() {
		return tipo == PLATEA;
	}

	public boolean esAnfiteatro() {
		return tipo == ANFITEATRO;
	}

	public boolean esPalco() {
		return tipo == PALCO;
	}

	public boolean estaUtilizable() {
		return tipo == UTILIZABLE;
	}

	public boolean estaLleno() {
		return tipo == LLENO;
	}

	public ArrayList<Silla> darSillas() {
		return sillas;
	}

}
