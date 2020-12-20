package Modelo;

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private String passwd;
	
	
	public Usuario(String nombre, String passwd) {
		this.nombre = nombre;
		this.passwd = passwd;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPasswd() {
		return passwd;
	}


	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}


	@Override
	public String toString() {
		return "usuario [nombre=" + nombre  + ", passwd=" + passwd + "]";
	}
}
