package Controlador;

import java.util.*;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import Modelo.*;
import Vista.*;
public class ControladorPanelPeliculas {
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelPeliculas panelPeliculas;
	private static PanelGeneros panelGeneros;
	public static ArrayList<Pelicula> peliculasSabado, peliculasDomingo;
	private static int opcGen;
	public static ArrayList<String> generosRestantesSabado, generosRestantesDomingo;
	private static Calendar tiempoRestantesSabado, tiempoRestantesDomingo;
	public static String nombrePeliSeleccionada = "";
	
	public ControladorPanelPeliculas(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	public void mostrarPanelPeliculas() {
		this.panelPeliculas = new PanelPeliculas(this);
		this.vista.mostrarPanel(this.panelPeliculas);
	}
	
	public static void cargarTiempoDias() {
		Date sab = new Date();	Date dom = new Date();
		tiempoRestantesSabado = Calendar.getInstance();		tiempoRestantesDomingo = Calendar.getInstance();
		sab.setHours(8);    sab.setMinutes(0);
		dom.setHours(6);	dom.setMinutes(0);
		tiempoRestantesSabado.setTime(sab);		tiempoRestantesDomingo.setTime(dom);
	}
	
	public static void llenarPelis() {
		cargarTiempoDias();
		generosRestantesSabado = new ArrayList<String>();	generosRestantesDomingo = new ArrayList<String>();
		peliculasSabado = new ArrayList<Pelicula>();	peliculasDomingo = new ArrayList<Pelicula>();
		Date duracion = new Date();		duracion.setHours(1);	duracion.setMinutes(56);
		Pelicula peli = new Pelicula("Handia", duracion, "Drama", false, "Sabado");
		Pelicula peli1 = new Pelicula("Handia", duracion, "Drama", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date(); 		duracion.setHours(3);		duracion.setMinutes(17);
		peli = new Pelicula("La lista de Schindler", duracion, "Drama", false, "Sabado");
		peli1 = new Pelicula("La lista de Schindler", duracion, "Drama", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();		duracion.setHours(2);		duracion.setMinutes(22);
		peli = new Pelicula("Cadena Perpetua", duracion, "Drama", false, "Sabado");
		peli1 = new Pelicula("Cadena Perpetua", duracion, "Drama", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();		duracion.setHours(2);		duracion.setMinutes(13);
		peli = new Pelicula("Million Dolar Baby", duracion, "Drama", false, "Sabado");
		peli1 = new Pelicula("Million Dolar Baby", duracion, "Drama", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();		duracion.setHours(2);		duracion.setMinutes(22);
		peli = new Pelicula("2001:Odisea en el espacio", duracion, "Sci-Fi", false, "Sabado");
		peli1 = new Pelicula("2001:Odisea en el espacio", duracion, "Sci-Fi", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();		duracion.setHours(1);	duracion.setMinutes(15);
		peli = new Pelicula("La novia de Frankenstein", duracion, "Sci-Fi", false, "Sabado");
		peli1 = new Pelicula("La novia de Frankenstein", duracion, "Sci-Fi", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();		duracion.setHours(1);		duracion.setMinutes(55);
		peli = new Pelicula("El planeta de los simios", duracion, "Sci-Fi", false, "Sabado");
		peli1 = new Pelicula("El planeta de los simios", duracion, "Sci-Fi", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();		duracion.setHours(1);		duracion.setMinutes(57);
		peli = new Pelicula("El planeta de los simios", duracion, "Sci-Fi", false, "Sabado");
		peli1 = new Pelicula("El planeta de los simios", duracion, "Sci-Fi", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();		duracion.setHours(1);		duracion.setMinutes(30);
		peli = new Pelicula("Scary movie", duracion, "Comedia", false, "Sabado");
		peli1 = new Pelicula("Scary movie", duracion, "Comedia", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();		duracion.setHours(1);		duracion.setMinutes(59);
		peli = new Pelicula("El gran Lebowsky", duracion, "Comedia", false, "Sabado");
		peli1 = new Pelicula("El gran Lebowsky", duracion, "Comedia", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();		duracion.setHours(1);	duracion.setMinutes(34);
		peli = new Pelicula("La vida de Brian", duracion, "Comedia", false, "Sabado");
		peli1 = new Pelicula("La vida de Brian", duracion, "Comedia", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();		duracion.setHours(1);		duracion.setMinutes(28);
		peli = new Pelicula("Aterriza como puedas", duracion, "Comedia", false, "Sabado");
		peli1 = new Pelicula("Aterriza como puedas", duracion, "Comedia", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();		duracion.setHours(1);		duracion.setMinutes(49);
		peli = new Pelicula("Psicosis", duracion, "Terror", false, "Sabado");
		peli1 = new Pelicula("Psicosis", duracion, "Terror", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();		duracion.setHours(2);		duracion.setMinutes(26);
		peli = new Pelicula("El resplandor", duracion, "Terror", false, "Sabado");
		peli1 = new Pelicula("El resplandor", duracion, "Terror", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();		duracion.setHours(2);		duracion.setMinutes(35);
		peli = new Pelicula("Dracula", duracion, "Terror", false, "Sabado");
		peli1 = new Pelicula("Dracula", duracion, "Terror", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();		duracion.setHours(1);		duracion.setMinutes(55);
		peli = new Pelicula("Cisne negro", duracion, "Terror", false, "Sabado");
		peli1 = new Pelicula("Cisne negro", duracion, "Terror", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		
		generosRestantesSabado.add("Drama");	generosRestantesSabado.add("Sci-Fi");		generosRestantesSabado.add("Comedia");		generosRestantesSabado.add("Terror");
		generosRestantesDomingo.add("Drama");	generosRestantesDomingo.add("Sci-Fi");		generosRestantesDomingo.add("Comedia");		generosRestantesDomingo.add("Terror");
	}
	public static String calcularHorasSabado() {
		String res = "";	String hrs = "";	String mins = "";
		if (tiempoRestantesSabado.get(Calendar.HOUR) < 10) {
			hrs = "0" + tiempoRestantesSabado.get(Calendar.HOUR);
		} else
			hrs = tiempoRestantesSabado.get(Calendar.HOUR) + "";
		if (tiempoRestantesSabado.get(Calendar.MINUTE) < 10) {
			mins = "0" + tiempoRestantesSabado.get(Calendar.MINUTE);
		} else
			mins = "" + tiempoRestantesSabado.get(Calendar.MINUTE);
		res = "Sabado: " + hrs + ":" + mins;
		return res;
	}
	public static String calcularHorasDomingo() {
		String res = "";	String hrs = "";	String mins = "";
		if (tiempoRestantesDomingo.get(Calendar.HOUR) < 10) {
			hrs = "0" + tiempoRestantesDomingo.get(Calendar.HOUR);
		} else
			hrs = tiempoRestantesDomingo.get(Calendar.HOUR) + "";
		if (tiempoRestantesDomingo.get(Calendar.MINUTE) < 10) {
			mins = "0" + tiempoRestantesDomingo.get(Calendar.MINUTE);
		} else
			mins = "" + tiempoRestantesDomingo.get(Calendar.MINUTE);
		res = "Domingo: " + hrs + ":" + mins;
		return res;
	}
	public static JTextArea sacarPelis(JTextArea txtASeleccionadas) {// rellena el textArea de las pelis
		if (ControladorPanelLogin.NDia.equals("Sabado")) {
			for (int i = 0; i < peliculasSabado.size(); i++) {
				if (peliculasSabado.get(i).isElegida()) {
					txtASeleccionadas.append(peliculasSabado.get(i).getTitulo() + "\n");
				}}
		} else {
			for (int i = 0; i < peliculasDomingo.size(); i++) {
				if (peliculasDomingo.get(i).isElegida()) {
					txtASeleccionadas.append(peliculasDomingo.get(i).getTitulo() + "\n");
				}}}
					return txtASeleccionadas;
			}
	public static JComboBox llenarCmbxOpc1(JComboBox cmbxOpc, JTextArea txtAGeneros) {
		String opciones[] = new String[5];
		opciones = txtAGeneros.getText().split("\n");
		int cont = 0;
		for (int i = 0; i < opciones.length; i++) {
			if (opciones[i] != null) {
				cmbxOpc.addItem(cont);
				cont++;
			}}
		return cmbxOpc;
	}
	public static void pasarOpc1(int selectedItem) {
		if (selectedItem == 0) {
			System.exit(0);
		}
		opcGen = selectedItem;
	}

	public static JTextArea cargarPelis(JTextArea txtAPelis) {
		int cont = 1;
		int suma = 0; //variable para validar que tenga el mismo valor que el genero seleccionado para mantener el indice del array generosRestantes
		if (ControladorPanelLogin.NDia.equals("Sabado")) {
			for (int i = 0; i < generosRestantesSabado.size(); i++) {
				for (int j = 0; j < peliculasSabado.size(); j++) {
					suma = i + 1;
					if (peliculasSabado.get(j).getGenero() == generosRestantesSabado.get(i)
							&& !peliculasSabado.get(j).isElegida() && suma == opcGen) {
						txtAPelis.append(cont + ". " + peliculasSabado.get(j).getTitulo() + "\n");
						cont++;
					}}}} else {
			for (int i = 0; i < generosRestantesDomingo.size(); i++) {
				for (int j = 0; j < peliculasDomingo.size(); j++) {
					suma = i + 1;
					if (peliculasDomingo.get(j).getGenero() == generosRestantesDomingo.get(i)
							&& !peliculasDomingo.get(j).isElegida() && suma == opcGen) {
						txtAPelis.append(cont + ". " + peliculasDomingo.get(j).getTitulo() + "\n");
						cont++;
					}}}}
		txtAPelis.append("0. Salir");
		return txtAPelis;
	}
	public static JComboBox llenarCmbxOpc2(JComboBox cmbxOpc) {
		cmbxOpc.addItem(0);
		cmbxOpc.addItem(1);
		cmbxOpc.addItem(2);
		cmbxOpc.addItem(3);
		cmbxOpc.addItem(4);
		return cmbxOpc;
	}
	public static void seleccionarPeli(int opcion) {
		System.out.println(opcion);
		if (opcion == 0) {
			System.exit(0);
		}
		String genero = "";
		//String nombrePeliSeleccionada = "";
		Pelicula peliculasGenero[] = new Pelicula[4];
		int cont = 0;
		int hrsPeli = 0;
		boolean cambioASabado = false;
		boolean cambioADomingo = false;
		if (ControladorPanelLogin.NDia.equals("Sabado")) {
			genero = generosRestantesSabado.get(opcGen - 1);
			for (int i = 0; i < peliculasSabado.size(); i++) {
				if (peliculasSabado.get(i).getGenero().equals(genero)) {
					peliculasGenero[cont] = peliculasSabado.get(i);
					cont++;
				}}
			nombrePeliSeleccionada = peliculasGenero[opcion - 1].getTitulo();
			for (int i = 0; i < peliculasSabado.size(); i++) {
				if (peliculasSabado.get(i).getTitulo().equals(nombrePeliSeleccionada)
						&& peliculasSabado.get(i).getDia().equals("Sabado")) {
					hrsPeli = peliculasSabado.get(i).getDuracion().getHours();
					if (hrsPeli < tiempoRestantesSabado.get(Calendar.HOUR)) {
						peliculasSabado.get(i).setElegida(true);
						tiempoRestantesSabado.add(Calendar.HOUR, -(hrsPeli));
						tiempoRestantesSabado.add(Calendar.MINUTE,
								-(peliculasSabado.get(i).getDuracion().getMinutes()));
						for (int j = 0; j < generosRestantesSabado.size(); j++) {
							if (peliculasSabado.get(i).getGenero().equals(generosRestantesSabado.get(j))) {
								generosRestantesSabado.remove(j);
							}}
					} else if (hrsPeli > tiempoRestantesSabado.get(Calendar.HOUR)) {
						for (int j = 0; j < generosRestantesDomingo.size(); j++) {
							if (genero.equals(generosRestantesDomingo.get(j))) {
								cambioADomingo = true;
							}}
						if (cambioADomingo) {
							peliculasDomingo.get(i).setElegida(true);
							tiempoRestantesDomingo.add(Calendar.HOUR, -(hrsPeli));
							tiempoRestantesDomingo.add(Calendar.MINUTE,
									-(peliculasDomingo.get(i).getDuracion().getMinutes()));
							for (int j = 0; j < generosRestantesDomingo.size(); j++) {
								if (peliculasDomingo.get(i).getGenero().equals(generosRestantesDomingo.get(j))) {
									generosRestantesDomingo.remove(j);
								}}}}}}} else {
			genero = generosRestantesDomingo.get(opcGen - 1);
			for (int i = 0; i < peliculasDomingo.size(); i++) {
				if (peliculasDomingo.get(i).getGenero().equals(genero)) {
					peliculasGenero[cont] = peliculasDomingo.get(i);
					cont++;
				}}
			nombrePeliSeleccionada = peliculasGenero[opcion - 1].getTitulo();
			for (int i = 0; i < peliculasDomingo.size(); i++) {
				if (peliculasDomingo.get(i).getTitulo().equals(nombrePeliSeleccionada)
						&& peliculasDomingo.get(i).getDia().equals("Domingo")) {
					hrsPeli = peliculasDomingo.get(i).getDuracion().getHours();
					if (hrsPeli < tiempoRestantesDomingo.get(Calendar.HOUR)) {
						peliculasDomingo.get(i).setElegida(true);
						tiempoRestantesDomingo.add(Calendar.HOUR, -(hrsPeli));
						tiempoRestantesDomingo.add(Calendar.MINUTE,
								-(peliculasDomingo.get(i).getDuracion().getMinutes()));
						for (int j = 0; j < generosRestantesDomingo.size(); j++) {
							if (peliculasDomingo.get(i).getGenero().equals(generosRestantesDomingo.get(j))) {
								generosRestantesDomingo.remove(j);
							}}} else if (hrsPeli < tiempoRestantesSabado.get(Calendar.HOUR)) {
						for (int j = 0; j < generosRestantesSabado.size(); j++) {
							if (genero.equals(generosRestantesSabado.get(j))) {
								cambioASabado = true;
							}}
						if (cambioASabado) {
						peliculasSabado.get(i).setElegida(true);
						tiempoRestantesSabado.add(Calendar.HOUR, -(hrsPeli));
						tiempoRestantesSabado.add(Calendar.MINUTE,
								-(peliculasSabado.get(i).getDuracion().getMinutes()));
						for (int j = 0; j < generosRestantesDomingo.size(); j++) {
							if (peliculasDomingo.get(i).getGenero().equals(generosRestantesDomingo.get(j))) {
								generosRestantesDomingo.remove(j);
							}}}}}}}
		System.out.println("Tiempo restante sabado: "+tiempoRestantesSabado.get(Calendar.HOUR)+":"+tiempoRestantesSabado.get(Calendar.MINUTE));
		System.out.println("Tiempo restante domingo: "+tiempoRestantesDomingo.get(Calendar.HOUR)+":"+tiempoRestantesDomingo.get(Calendar.MINUTE));
		System.out.println("Peli seleccionada: "+nombrePeliSeleccionada);
		
		}
	public void accionadoBotonMostrarPanelGeneros() {
		this.controlador.navegarPanelGeneros();
	}
	
	public void accionadoBotonMostrarPanelResumen() {
		this.controlador.navegarPanelResumen();
	}
	
	
	
}