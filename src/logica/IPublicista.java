package logica;

import java.awt.Image;

public interface IPublicista {

	public abstract void agregarAnuncio(String evento, Image slogan);

	public abstract void publicarAnuncio(String evento);

	public abstract Anuncio consultarAnuncio(String evento);

}
