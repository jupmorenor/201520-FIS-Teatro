package logica;

import java.awt.Image;
import java.util.Date;


public class Anuncio {

	private String evento;

	private Date fechaPublicacion;

	private Image slogan;

	public Anuncio(String evento) {
		this.evento = evento;
	}

	public void setSlogan(Image slogan) {
		this.slogan = slogan;
	}

	public void setFechaPublicacion(Date fecha) {
		fechaPublicacion = fecha;
	}

	public String getEvento() {
		return evento;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public Image getSlogan() {
		return slogan;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}
	

}
