package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Controlador.ControladorPanelBienvenida;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class PanelBienvenida extends JPanel{

	private JButton btnGeneros,btnLogin;
	private ControladorPanelBienvenida controladorPanelBienvenida;
	public PanelBienvenida(ControladorPanelBienvenida controladorPanelBienvenida) {
		this.controladorPanelBienvenida = controladorPanelBienvenida;
		
		setLayout(null);
		
		/*
		 * btnGeneros = new JButton("Generos"); btnGeneros.setBounds(58, 116, 120, 23);
		 * add(btnGeneros);
		 */
		
		btnLogin = new JButton("Continuar");//provisional
		btnLogin.setBounds(285,190,120,23);
		add(btnLogin);
		
		JLabel mensajeBienvenida = new JLabel("BIENVENIDO");
		mensajeBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
		mensajeBienvenida.setForeground(Color.BLACK);
		mensajeBienvenida.setFont(new Font("Arial Black", Font.BOLD, 42));
		mensajeBienvenida.setBackground(Color.BLACK);
		mensajeBienvenida.setBounds(10, 28, 434, 32);
		add(mensajeBienvenida);
		
		JLabel mensajeBienvenida_1_1 = new JLabel("SOFTWARE ");
		mensajeBienvenida_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		mensajeBienvenida_1_1.setForeground(Color.BLACK);
		mensajeBienvenida_1_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		mensajeBienvenida_1_1.setBounds(10, 89, 434, 32);
		add(mensajeBienvenida_1_1);
		
		JLabel mensajeBienvenida_1 = new JLabel("SELECCION DE PELICULAS");
		mensajeBienvenida_1.setHorizontalAlignment(SwingConstants.CENTER);
		mensajeBienvenida_1.setForeground(Color.BLACK);
		mensajeBienvenida_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		mensajeBienvenida_1.setBounds(10, 132, 434, 32);
		add(mensajeBienvenida_1);
		
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		//this.btnGeneros.addActionListener(listenerBotonGeneros(this.controladorPanelBienvenida));
		this.btnLogin.addActionListener(listenerbtnLogin(this.controladorPanelBienvenida));
		//timer();
	}
	
	/*
	 * private ActionListener listenerBotonGeneros(ControladorPanelBienvenida
	 * controladorPanelBienvenida) { return new ActionListener() { public void
	 * actionPerformed(ActionEvent arg0) {
	 * System.out.println("Ejecutando evento Boton Generos");
	 * controladorPanelBienvenida.accionadoBottonMostrarPanelGeneros(); } }; }
	 */
	private ActionListener listenerbtnLogin(ControladorPanelBienvenida controladorPanelBienvenida) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Login");
				controladorPanelBienvenida.accionadoBottonMostrarLogin();
			}
		};
	}
}
