package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Controlador.ControladorPanelGeneros;

@SuppressWarnings("serial")
public class PanelGeneros extends JPanel {

	private JButton btnVolver,btnDrama,btnTerror,btnComedia,btnCienciaFiccion;
	private JLabel lblGeneros;
	private ControladorPanelGeneros controladorPanelGeneros;
	
	public PanelGeneros(ControladorPanelGeneros controladorPanelGeneros)
	{
		this.controladorPanelGeneros = controladorPanelGeneros;
		
		setLayout(null);
		
		lblGeneros = new JLabel("Panel Generos");
		lblGeneros.setBounds(58, 35, 115, 14);
		add(lblGeneros);
		
		btnVolver = new JButton("Volver");
		btnVolver.setBounds(10, 254, 89, 23);
		add(btnVolver);
		
		 btnDrama = new JButton("Drama");
		btnDrama.setBounds(58, 85, 102, 37);
		add(btnDrama);
		
		 btnTerror = new JButton("Terror");
		btnTerror.setBounds(58, 152, 102, 38);
		add(btnTerror);
		
		 btnComedia = new JButton("Comedia");
		btnComedia.setBounds(234, 84, 89, 38);
		add(btnComedia);
		
		 btnCienciaFiccion = new JButton("Sci-fi");
		btnCienciaFiccion.setBounds(234, 152, 89, 38);
		add(btnCienciaFiccion);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnVolver.addActionListener(listenerBotonVolver(this.controladorPanelGeneros));
		this.btnDrama.addActionListener(listenerBotonVolver(this.controladorPanelGeneros));
		this.btnTerror.addActionListener(listenerBotonVolver(this.controladorPanelGeneros));
		this.btnComedia.addActionListener(listenerBotonVolver(this.controladorPanelGeneros));
		this.btnCienciaFiccion.addActionListener(listenerBotonVolver(this.controladorPanelGeneros));
	}
	
	private ActionListener listenerBotonVolver(ControladorPanelGeneros controladorPanelGeneros) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Volver");
				controladorPanelGeneros.accionadoBottonVolverPanelGeneros();
			}
		};
	}
	private ActionListener listenerBotonDrama(ControladorPanelGeneros controladorPanelGeneros) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Drama");
				controladorPanelGeneros.accionadoBotonDrama();
			}
		};
	}
	
}
