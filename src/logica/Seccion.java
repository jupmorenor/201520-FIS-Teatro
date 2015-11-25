package logica;

public class Seccion {

	public static final String PLATEA = "PLATEA";

	public static final String ANFITEATRO = "ANFITEATRO";

	public static final String PALCO = "PALCO";

	public static final String UTILIZABLE = "UTILIZABLE";

	public static final String LLENO = "LLENO";

	private String tipo;

	private String estado;

	private Silla[] sillas;

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

	public void agregarSilla() {

	}

	public Silla[] darSillas() {
		return sillas;
	}

}
