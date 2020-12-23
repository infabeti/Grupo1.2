package Controlador;

import javax.swing.JTextArea;
import Modelo.*;
import Vista.*;
import Controlador.*;
public class ControladorPanelResumen {
	private PanelResumen panelResumen;
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	
	
	public ControladorPanelResumen(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	
	public void mostrarPanelResumen() {
		this.panelResumen = new PanelResumen(this);
		this.vista.mostrarPanel(this.panelResumen);
	}
	
	public static JTextArea llenarResumen(JTextArea txtAResumen) {
		int hrs = 0;
		int mins = 0;

		txtAResumen.append("Titulo\t\tDuracion\tDia\n\n");
		for (int i = 0; i < ControladorPanelPeliculas.peliculasSabado.size(); i++) {
			if (ControladorPanelPeliculas.peliculasSabado.get(i).isElegida()) {
				hrs = ControladorPanelPeliculas.peliculasSabado.get(i).getDuracion().getHours();
				mins = ControladorPanelPeliculas.peliculasSabado.get(i).getDuracion().getMinutes();
				txtAResumen.append(ControladorPanelPeliculas.peliculasSabado.get(i).getTitulo() + "\t" + hrs + ":" + mins + "\t"
						+ ControladorPanelPeliculas.peliculasSabado.get(i).getDia() + "\n");
			}
		}
		for (int i = 0; i <ControladorPanelPeliculas. peliculasDomingo.size(); i++) {
			if (ControladorPanelPeliculas.peliculasDomingo.get(i).isElegida()) {
				hrs =ControladorPanelPeliculas. peliculasDomingo.get(i).getDuracion().getHours();
				mins = ControladorPanelPeliculas.peliculasDomingo.get(i).getDuracion().getMinutes();
				txtAResumen.append(ControladorPanelPeliculas.peliculasDomingo.get(i).getTitulo() + "\t" + hrs + ":" + mins + "\t"
						+ ControladorPanelPeliculas.peliculasDomingo.get(i).getDia() + "\n");
			}
		}
		return txtAResumen;
		
	}
	
	public void accionadoBotonGeneros() {
		this.controlador.navegarPanelGeneros();
		
	}


	public void accionadoBotonSalir() {
		this.controlador.navegarPanelBienvenida();
		
	}
	
//	public static JTextArea llenarResumen(JTextArea txtAResumen) {
//		int hrs = 0;
//		int mins = 0;
//
//		txtAResumen.append("Titulo\t\tDuracion\tDia\n\n");
//		for (int i = 0; i < ControladorPanelPeliculas.peliculasSabado.size(); i++) {
//			if (ControladorPanelPeliculas.peliculasSabado.get(i).isElegida()) {
//				hrs = ControladorPanelPeliculas.peliculasSabado.get(i).getDuracion().getHours();
//				mins = ControladorPanelPeliculas.peliculasSabado.get(i).getDuracion().getMinutes();
//				txtAResumen.append(ControladorPanelPeliculas.peliculasSabado.get(i).getTitulo() + "\t" + hrs + ":" + mins + "\t"
//						+ ControladorPanelPeliculas.peliculasSabado.get(i).getDia() + "\n");
//			}
//		}
//		for (int i = 0; i < ControladorPanelPeliculas.peliculasDomingo.size(); i++) {
//			if (ControladorPanelPeliculas.peliculasDomingo.get(i).isElegida()) {
//				hrs = ControladorPanelPeliculas.peliculasDomingo.get(i).getDuracion().getHours();
//				mins = ControladorPanelPeliculas.peliculasDomingo.get(i).getDuracion().getMinutes();
//				txtAResumen.append(ControladorPanelPeliculas.peliculasDomingo.get(i).getTitulo() + "\t" + hrs + ":" + mins + "\t"
//						+ ControladorPanelPeliculas.peliculasDomingo.get(i).getDia() + "\n");
//			}
//		}
//		return txtAResumen;
//	}
	
	

}
