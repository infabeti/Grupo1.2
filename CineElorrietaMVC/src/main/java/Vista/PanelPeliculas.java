package Vista;

import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import Controlador.ControladorPanelGeneros;
import Controlador.ControladorPanelPeliculas;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JMenu;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.DropMode;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

public class PanelPeliculas extends JPanel{
	private JComboBox cmbxOpc;
	private JLabel lblOpc;
	private JTextArea txtAPelis;
	private JButton btnAtras;
	//private JButton btnAceptar;
	
	private ControladorPanelPeliculas controladorPanelPeliculas;
	public PanelPeliculas(ControladorPanelPeliculas controladorPanelPeliculas) {
		this.controladorPanelPeliculas=controladorPanelPeliculas;
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, new Color(0, 255, 255), Color.CYAN, Color.CYAN));
		setLayout(null);
		setBounds(150, 150, 530, 505);

		lblOpc = new JLabel("Elige una opcion:");
		txtAPelis = new JTextArea();
		btnAtras = new JButton("<--");
		//btnAceptar = new JButton("-->");
		cmbxOpc = new JComboBox();
		
		txtAPelis = ControladorPanelPeliculas.cargarPelis(txtAPelis);
		cmbxOpc = ControladorPanelPeliculas.llenarCmbxOpc2(cmbxOpc);

		cmbxOpc.setBounds(255, 68, 117, 22);
		add(cmbxOpc);

		lblOpc.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblOpc.setBounds(111, 68, 134, 22);
		add(lblOpc);

		txtAPelis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtAPelis.setBounds(46, 133, 431, 248);
		txtAPelis.setEditable(false);
		add(txtAPelis);

		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAtras.setBounds(134, 410, 99, 29);
		add(btnAtras);
		
		JButton btnAceptar = new JButton("-->");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAceptar.setBounds(277, 410, 99, 29);
		add(btnAceptar);
		
		
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ControladorPanelPeliculas.seleccionarPeli((int)cmbxOpc.getSelectedItem());
				controladorPanelPeliculas.accionadoBotonMostrarPanelGeneros(); 
			}
		});
	
	btnAceptar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			ControladorPanelPeliculas.seleccionarPeli((int)cmbxOpc.getSelectedItem());
			controladorPanelPeliculas.accionadoBotonMostrarPanelResumen(); 
		}
	});
	}
}