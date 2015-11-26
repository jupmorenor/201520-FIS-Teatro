package logica;

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

	private Silla[][] sillas;
	
	private int maximoSillas;
	
	private String id;
	
	public Seccion(String tipo, String id) {
		estado = UTILIZABLE;
		this.tipo = tipo;
		this.id = id;
		switch (tipo) {
		case PALCO: 
			sillas = new Silla[3][5];
			maximoSillas = 15;
			for (int i=0; i<3; i++) {
				for (int j=0; j<5; j++) {
					sillas[i][j] = new Silla(filas[i], j, this.tipo);
				}
			}
			break;
		case ANFITEATRO: 
			sillas = new Silla[15][8]; 
			maximoSillas = 120;
			for (int i=0; i<15; i++) {
				for (int j=0; j<8; j++) {
					sillas[i][j] = new Silla(filas[i], j, this.tipo);
				}
			}
			break;
		case PLATEA: 
			sillas = new Silla[15][5]; 
			maximoSillas = 75;
			for (int i=0; i<15; i++) {
				for (int j=0; j<5; j++) {
					sillas[i][j] = new Silla(filas[i], j, this.tipo);
				}
			}
			break;
		}
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
		return estado == UTILIZABLE;
	}

	public boolean estaLleno() {
		return estado == LLENO;
	}

	public Silla[][] darSillas() {
		return sillas;
	}
	
	public void setSillas(Silla[][] sillas) {
		this.sillas = sillas;
	}
	
	public int darMaximoSillas() {
		return maximoSillas;
	}

	public String getId() {
		return id;
	}

}
