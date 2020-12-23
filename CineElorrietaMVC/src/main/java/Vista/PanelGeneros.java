package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import Controlador.*;

@SuppressWarnings("serial")
public class PanelGeneros extends JPanel {

	private JButton btnVolver,btnDrama,btnTerror,btnComedia,btnCienciaFiccion;
	private JLabel lblGeneros;
	private ControladorPanelGeneros controladorPanelGeneros;
	private Date hrsSabado;
	private Date hrsDomingo;
	private String patternH;
	private SimpleDateFormat simpleDateFormat;
	private String ShrsSabado;
	private String ShrsDomingo;
	private JComboBox cmbxOpc;
	private JLabel lblOpc;
	private JLabel lblHrsSabado;
	private JLabel lblHrsDomingo;
	private JLabel lblSeleccionadas;
	private JLabel lblDia;
	private JButton btnAtras;
	private JButton btnAceptar;
	private JTextArea txtASeleccionadas;
	private JTextArea txtAGeneros;
	//private JTextArea txtPelis;

	public PanelGeneros(ControladorPanelGeneros controladorPanelGeneros){
		this.controladorPanelGeneros = controladorPanelGeneros;
		setLayout(null);
			cmbxOpc = new JComboBox();
			lblOpc = new JLabel("Elige una opcion:");
			lblHrsSabado = new JLabel("Sabado:");
			lblHrsDomingo = new JLabel("Domingo:");
			lblGeneros = new JLabel("Generos");
			lblSeleccionadas = new JLabel("Pelis seleccionadas");
			lblDia = new JLabel("");
			btnAtras = new JButton("<--");
			btnAceptar = new JButton("-->");
			txtASeleccionadas = new JTextArea();
			txtAGeneros = new JTextArea();
			txtAGeneros = ControladorPanelGeneros.llenarGeneros(txtAGeneros);
			JTextArea txtPelis = new JTextArea();
			txtPelis = ControladorPanelPeliculas.sacarPelis(txtPelis);
			cmbxOpc = ControladorPanelPeliculas.llenarCmbxOpc1(cmbxOpc, txtAGeneros);
			ShrsSabado = ControladorPanelPeliculas.calcularHorasSabado();
			ShrsDomingo = ControladorPanelPeliculas.calcularHorasDomingo();
			setLayout(null);
			setBounds(150, 150, 530, 505);
			cmbxOpc.setBounds(257, 72, 117, 22);
			add(cmbxOpc);
			lblOpc.setBounds(113, 72, 134, 22);
			add(lblOpc);
			btnAtras.setBounds(130, 421, 89, 29);
			add(btnAtras);
			btnAceptar.setBounds(325, 421, 89, 29);
			add(btnAceptar);
//			txtASeleccionadas.setBounds(257, 158, 230, 139);
//			txtASeleccionadas.setEditable(false);
//			add(txtASeleccionadas);
			lblHrsSabado.setBounds(257, 315, 230, 22);
			lblHrsSabado.setText(ShrsSabado);
			add(lblHrsSabado);
			lblHrsDomingo.setBounds(257, 348, 230, 22);
			lblHrsDomingo.setText(ShrsDomingo);
			add(lblHrsDomingo);
			lblGeneros.setBounds(103, 125, 81, 22);
			add(lblGeneros);
			lblSeleccionadas.setBounds(304, 125, 147, 22);
			add(lblSeleccionadas);
			lblDia.setBounds(167, 27, 184, 34);
			add(lblDia);
			txtAGeneros.setBounds(48, 158, 171, 225);
			txtAGeneros.setEditable(false);
			add(txtAGeneros);
			
		
			txtPelis.setBounds(288, 145, 158, 157);
			add(txtPelis);
			txtPelis.append(txtPelis.getText()+ControladorPanelPeliculas.nombrePeliSeleccionada+"\n");
	
			
			btnAtras.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					controladorPanelGeneros.accionadoBotonVolverLogin();
				}});
			btnAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					ControladorPanelPeliculas.pasarOpc1((int)cmbxOpc.getSelectedItem());
					controladorPanelGeneros.accionadoBottonMostrarPanelPelis(); 
					
				}});		
		}	
}