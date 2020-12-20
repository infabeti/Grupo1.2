package Controlador;

import Modelo.Modelo;
import Vista.Vista;

public class Controlador {

	private Modelo modelo;
	private Vista vista;
	private ControladorPanelBienvenida controladorPanelBienvenida;
	private ControladorPanelGeneros controladorPanelGeneros;
	private ControladorPanelLogin controladorPanelLogin;
	private ControladorPanelPeliculas controladorPanelPeliculas;
	private ControladorPanelResumen controladorPanelResumen;
	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
		this.controladorPanelBienvenida = new ControladorPanelBienvenida(this.modelo, this.vista, this);
		this.controladorPanelGeneros = new ControladorPanelGeneros(this.modelo, this.vista, this);
		this.controladorPanelLogin = new ControladorPanelLogin(this.modelo, this.vista, this);
		this.controladorPanelPeliculas = new ControladorPanelPeliculas(this.modelo, this.vista, this);
		this.controladorPanelResumen = new ControladorPanelResumen(this.modelo, this.vista, this);
		this.navegarPanelBienvenida();
	}
	
	public void navegarPanelBienvenida() {
		System.out.println("Navegar panel Bienvenida");
		this.controladorPanelBienvenida.mostrarPanelBienvenida();
	}
	
	public void navegarPanelGeneros() {
		System.out.println("Navegar panel Generos");
		this.controladorPanelGeneros.mostrarPanelGeneros();
	}
	public void navegarPanelLogin() {
		System.out.println("navegar panel login");
		this.controladorPanelLogin.mostrarPanelLogin();
	}
	public void navegarPanelPeliculas() {
		System.out.println("navegar panel Peliculas");
		this.controladorPanelPeliculas.mostrarPanelPeliculas(); 
		 
	}
	
	public void navegarPanelResumen() {
		System.out.println("navegar panel Resumen");
		this.controladorPanelResumen.mostrarPanelResumen(); 
		 
	}
}
