package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Controlador.ControladorPanelResumen;

@SuppressWarnings("serial")
public class PanelResumen extends JPanel{

	private JButton btnGeneros;
	private JLabel lblResumen;
	private ControladorPanelResumen controladorPanelResumen;
	
	public PanelResumen(ControladorPanelResumen controladorPanelResumen) {
		this.controladorPanelResumen = controladorPanelResumen;
		
		setLayout(null);
		
		lblResumen = new JLabel("Panel Resumen");
		lblResumen.setBounds(51, 35, 115, 14);
		add(lblResumen);
		
		btnGeneros = new JButton("Generos");
		btnGeneros.setBounds(241, 115, 120, 23);
		add(btnGeneros);
		
		
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnGeneros.addActionListener(listenerBotonGeneros(this.controladorPanelResumen));
	}
	
	private ActionListener listenerBotonGeneros(ControladorPanelResumen controladorPanelResumen) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Generos");
				
			}
		};
	}
}
