package logica;

public class Seccion {

	private final String PLATEA = "PLATEA";

	private final String ANFITEATRO = "ANFITEATRO";

	private final String PALCO = "PALCO";

	private final String UTILIZABLE = "UTILIZABLE";

	private final String LLENO = "LLENO";

	private String tipo;

	private String estado;

	private Silla[] sillas;

	public boolean esPlatea() {
		return false;
	}

	public boolean esAnfiteatro() {
		return false;
	}

	public boolean esPalco() {
		return false;
	}

	public boolean estaUtilizable() {
		return false;
	}

	public boolean estaLleno() {
		return false;
	}

	public void agregarSilla() {

	}

	public Silla darSillas() {
		return null;
	}

}
