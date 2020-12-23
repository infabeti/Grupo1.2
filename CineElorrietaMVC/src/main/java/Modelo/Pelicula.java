package Modelo;

import java.util.Date;

public class Pelicula {
	private String titulo;
	private Date duracion;
	private String genero;
	private boolean elegida;
	private String dia;
	
	

	public Pelicula(String titulo, Date duracion, String genero, boolean elegida, String dia) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.genero = genero;
		this.elegida = elegida;
		this.dia = dia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getDuracion() {
		return duracion;
	}

	public void setDuracion(Date duracion) {
		this.duracion = duracion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public boolean isElegida() {
		return elegida;
	}

	public void setElegida(boolean elegida) {
		this.elegida = elegida;
	}
	
	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", duracion=" + duracion + ", genero=" + genero + ", elegida=" + elegida
				+ ", dia=" + dia + "]";
	}


}
