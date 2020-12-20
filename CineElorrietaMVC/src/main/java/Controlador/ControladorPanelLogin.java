package Controlador;

import java.util.ArrayList;
import java.util.Calendar;

import Modelo.Modelo;
import Vista.PanelLogin;
import Vista.Vista;
import Modelo.Pelicula;
import Modelo.Usuario;

public class ControladorPanelLogin {
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelLogin panelLogin;
	public static String NDia;
	
	public ControladorPanelLogin(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;
	}

	public void mostrarPanelLogin() {
		this.panelLogin=new PanelLogin(this);
		this.vista.mostrarPanel(this.panelLogin);
	}

	public void accionadoBotonLogin() {
		this.controlador.navegarPanelGeneros();
		
	}
	
	public static boolean comprobarLogIn(String nom, String contr) {
		Usuario user = new Usuario("cliente", "123");
		if (!nom.equals(user.getNombre()) || !contr.equals(user.getPasswd())) {
			return false;
		} else
			return true;
	}
	
	public static void recogerDia(String opcDia) {// recoger el dia seleccionado en el comboBox del login
		NDia = opcDia;
	}
}
