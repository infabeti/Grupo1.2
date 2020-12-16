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

@SuppressWarnings("serial")
public class PanelBienvenida extends JPanel{

	private JButton btnGeneros,btnLogin;
	private JLabel lblBienvenida;
	private ControladorPanelBienvenida controladorPanelBienvenida;
	public PanelBienvenida(ControladorPanelBienvenida controladorPanelBienvenida) {
		this.controladorPanelBienvenida = controladorPanelBienvenida;
		
		setLayout(null);
		
		lblBienvenida = new JLabel("Panel Bienvenida");
		lblBienvenida.setBounds(58, 35, 115, 14);
		add(lblBienvenida);
		
		btnGeneros = new JButton("Generos");
		btnGeneros.setBounds(58, 116, 120, 23);
		add(btnGeneros);
		
		btnLogin = new JButton("Login");//provisional
		btnLogin.setBounds(30,116,120,23);
		add(btnLogin);
		
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnGeneros.addActionListener(listenerBotonGeneros(this.controladorPanelBienvenida));
		this.btnLogin.addActionListener(listenerbtnLogin(this.controladorPanelBienvenida));
		timer();
	}
	
	private ActionListener listenerBotonGeneros(ControladorPanelBienvenida controladorPanelBienvenida) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Generos");
				controladorPanelBienvenida.accionadoBottonMostrarPanelGeneros();
			}
		};
	}
	private ActionListener listenerbtnLogin(ControladorPanelBienvenida controladorPanelBienvenida) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Login");
				controladorPanelBienvenida.accionadoBottonMostrarLogin();
			}
		};
	}
	
	private void timer() {
		long a,b;
		try {
			a = System.currentTimeMillis();
			TimeUnit.SECONDS.sleep(3);
			b = System.currentTimeMillis();
			System.out.println(b-a);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
}
