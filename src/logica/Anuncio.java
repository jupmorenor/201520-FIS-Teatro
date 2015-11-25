package logica;

import java.awt.Image;
import java.util.Date;


public class Anuncio {

	private String id;

	private Date fechaPublicacion;

	private Image slogan;

	public Anuncio(String id) {
		this.id = id;
	}

	public void setSlogan(Image slogan) {
		this.slogan = slogan;
	}

	public void setFechaPublicacion(Date fecha) {
		fechaPublicacion = fecha;
	}

}
