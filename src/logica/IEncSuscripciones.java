package logica;

public interface IEncSuscripciones {

	public abstract Suscripcion consultarSuscripcion(int cedula);

	public abstract void crearSuscripcion(int cc, String nom);

	public abstract void actualizarSuscripcion(int cc, int cant);

}
