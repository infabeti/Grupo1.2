package Modelo;

import java.util.ArrayList;

public class Usuario {
	private String user, password;
	private static ArrayList<Usuario> lista_usuarios = new ArrayList<Usuario>();
	private static Usuario administrador;
	
	static{
		administrador= new Usuario("admin","admin"); //creo el administrador en un bloque estático para no depender del main

	}
	public Usuario(String user, String password) {
		this.setUser(user);
		this.password = password;
		lista_usuarios.add(this);
	}
	
	
	
	public static Usuario getAdministrador() {
		return administrador;
	}



	public static void setAdministrador(Usuario administrador) {
		Usuario.administrador = administrador;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public static ArrayList<Usuario> getLista_usuarios() {
		return lista_usuarios;
	}



	public static void setLista_usuarios(ArrayList<Usuario> lista_usuarios) {
		Usuario.lista_usuarios = lista_usuarios;
	}



	public String getUser() {
		return user;
	}



	public void setUser(String user) {
		this.user = user;
	}
	
}
