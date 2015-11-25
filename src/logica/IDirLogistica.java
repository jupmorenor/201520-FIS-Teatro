package logica;

import java.util.Date;

public interface IDirLogistica {

	public abstract void crearEvento(Date f, String nom, int ed, int val);

	public abstract void modificarEvento(String nom, Date f);
	
	public abstract void modificarSeccion(int[][] mtzIntPalco1, int[][] mtzIntPalco2, int[][] mtzIntPalco3,
			int[][] mtzIntPalco4, int[][] mtzIntPlatea, int[][] mtzIntAnfiteatro);

}
