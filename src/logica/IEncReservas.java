package logica;

public interface IEncReservas {

	public abstract Reserva consultarReserva(int cedula);

	public abstract void crearReserva(int cc, String evento, Silla sillas);

	public abstract void eliminarReserva(int cc);

}
