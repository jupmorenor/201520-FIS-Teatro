package logica;

import java.util.ArrayList;

public class Reserva {

	private int cedulaCliente;

	private String nombreEvento;

	private ArrayList<Silla> sillas;

	public Reserva(int cc, String nom) {
		cedulaCliente = cc;
		nombreEvento = nom;
	}

	public int darCedulaCliente() {
		return cedulaCliente;
	}

	public ArrayList<Silla> darSillas() {
		return sillas;
	}

	public String darNombreEvento() {
		return nombreEvento;
	}

}
