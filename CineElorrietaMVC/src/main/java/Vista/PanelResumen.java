package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import Controlador.*;
import Modelo.*;
import Vista.*;


@SuppressWarnings("serial")
public class PanelResumen extends JPanel{

	private JButton btnGeneros;
	private JLabel lblResumen;
	private ControladorPanelResumen controladorPanelResumen;
	private JButton btnSalir;
	private JTextArea txtAResumen;

	
	public PanelResumen(ControladorPanelResumen controladorPanelResumen) {
		this.controladorPanelResumen = controladorPanelResumen;
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, new Color(0, 255, 255), Color.CYAN, Color.CYAN));
		setLayout(null);
		setBounds(150, 150, 530, 505);
		
		lblResumen = new JLabel("Resumen");
		txtAResumen = new JTextArea();
		btnSalir = new JButton("Salir");
		btnGeneros = new JButton("Generos");
		
		txtAResumen = ControladorPanelResumen.llenarResumen(txtAResumen);
		
		lblResumen = new JLabel("Panel Resumen");
		lblResumen.setBounds(51, 35, 115, 14);
		add(lblResumen);
		
		btnGeneros = new JButton("Generos");
		btnGeneros.setBounds(241, 115, 120, 23);
		add(btnGeneros);
		
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSalir.setBounds(331, 426, 89, 29);
		add(btnSalir);

		lblResumen.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblResumen.setBounds(200, 42, 108, 29);
		add(lblResumen);

		txtAResumen.setBounds(68, 100, 390, 278);
		txtAResumen.setEditable(false);
		add(txtAResumen);
		
		btnGeneros.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnGeneros.setBounds(94, 426, 101, 29);
		add(btnGeneros);

		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnGeneros.addActionListener(listenerBotonGeneros(this.controladorPanelResumen));
		this.btnSalir.addActionListener(listenerBotonSalir(this.controladorPanelResumen));
	}
	
	private ActionListener listenerBotonSalir(ControladorPanelResumen controladorPanelResumen2) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelResumen.accionadoBotonSalir();
			}
		};
	}

	private ActionListener listenerBotonGeneros(ControladorPanelResumen controladorPanelResumen) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Generos");
				controladorPanelResumen.accionadoBotonGeneros();
				
			}
		};
	}
}
