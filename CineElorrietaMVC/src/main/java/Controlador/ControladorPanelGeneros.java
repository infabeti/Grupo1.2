package Controlador;

import java.util.ArrayList;
import javax.swing.JTextArea;
import Modelo.*;
import Vista.*;
public class ControladorPanelGeneros {
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelGeneros panelGeneros;
	private static ArrayList<String> generosRestantesSabado, generosRestantesDomingo;
	public ControladorPanelGeneros(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}	
	public void mostrarPanelGeneros() {
		this.panelGeneros = new PanelGeneros(this);
		this.vista.mostrarPanel(this.panelGeneros);
	}
	public void accionadoBottonVolverPanelGeneros() {
		this.controlador.navegarPanelGeneros();
	}
	public void accionadoBotonDrama() {
		this.controlador.navegarPanelPeliculas();
	}
	public void accionadoBotonTerror() {
		this.controlador.navegarPanelPeliculas();
	}
	public void accionadoBotonComedia() {
		this.controlador.navegarPanelPeliculas();
	}
	public void accionadoBotonCienciaFiccion() {
		this.controlador.navegarPanelPeliculas();
	}
	public static JTextArea llenarGeneros(JTextArea txtAGeneros) {// rellena el textArea de generos
		ControladorPanelPeliculas.llenarPelis();
		boolean dramaVal = false;	boolean sciVal = false;		boolean comVal = false;		boolean terrVal = false;
		int cont = 1;
		String generos[] = new String[4];
		generos[0] = "Drama";	generos[1] = "Sci-Fi";	generos[2] = "Comedia";	generos[3] = "Terror";
		if (ControladorPanelLogin.NDia.equals("Sabado")) {
			for (int i = 0; i < ControladorPanelPeliculas.peliculasSabado.size(); i++) {
				if (ControladorPanelPeliculas.peliculasSabado.get(i).isElegida()) {
					if (ControladorPanelPeliculas.peliculasSabado.get(i).getGenero().equals(generos[0])) {
						dramaVal = true;
					} else if (ControladorPanelPeliculas.peliculasSabado.get(i).getGenero().equals(generos[1])) {
						sciVal = true;
					} else if (ControladorPanelPeliculas.peliculasSabado.get(i).getGenero().equals(generos[2])) {
						comVal = true;
					} else if (ControladorPanelPeliculas.peliculasSabado.get(i).getGenero().equals(generos[3])) {
						terrVal = true;
					}}}

			if (!dramaVal) {
				txtAGeneros.append(cont + ". " + generos[0] + "\n");
				ControladorPanelPeliculas.generosRestantesSabado.add(generos[0]);
				cont++;
			}
			if (!sciVal) {
				txtAGeneros.append(cont + ". " + generos[1] + "\n");
				ControladorPanelPeliculas.generosRestantesSabado.add(generos[1]);
				cont++;
			}
			if (!comVal) {
				txtAGeneros.append(cont + ". " + generos[2] + "\n");
				ControladorPanelPeliculas.generosRestantesSabado.add(generos[2]);
				cont++;
			}
			if (!terrVal) {
				txtAGeneros.append(cont + ". " + generos[3] + "\n");
				ControladorPanelPeliculas.generosRestantesSabado.add(generos[3]);
				cont++;
			}} else {
			for (int i = 0; i < ControladorPanelPeliculas.peliculasDomingo.size(); i++) {
				if (ControladorPanelPeliculas.peliculasDomingo.get(i).isElegida()) {
					if (ControladorPanelPeliculas.peliculasDomingo.get(i).getGenero().equals(generos[0])) {
						dramaVal = true;
					} else if (ControladorPanelPeliculas.peliculasDomingo.get(i).getGenero().equals(generos[1])) {
						sciVal = true;
					} else if (ControladorPanelPeliculas.peliculasDomingo.get(i).getGenero().equals(generos[2])) {
						comVal = true;
					} else if (ControladorPanelPeliculas.peliculasDomingo.get(i).getGenero().equals(generos[3])) {
						terrVal = true;
					}}}
			if (!dramaVal) {
				txtAGeneros.append(cont + ". " + generos[0] + "\n");
				ControladorPanelPeliculas.generosRestantesDomingo.add(generos[0]);
				cont++;
			}
			if (!sciVal) {
				txtAGeneros.append(cont + ". " + generos[1] + "\n");
				ControladorPanelPeliculas.generosRestantesDomingo.add(generos[1]);
				cont++;
			}
			if (!comVal) {
				txtAGeneros.append(cont + ". " + generos[2] + "\n");
				ControladorPanelPeliculas.generosRestantesDomingo.add(generos[2]);
				cont++;
			}
			if (!terrVal) {
				txtAGeneros.append(cont + ". " + generos[3] + "\n");
				ControladorPanelPeliculas.generosRestantesDomingo.add(generos[3]);
				cont++;
			}}
		txtAGeneros.append("0. Salir");
		return txtAGeneros;
}
	public void accionadoBottonMostrarPanelPelis() {
		this.controlador.navegarPanelPeliculas();
	}
	public void accionadoBotonVolverLogin() {
		this.controlador.navegarPanelLogin();
		
	}	
}