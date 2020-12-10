package Vista;

import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Controlador.ControladorPanelGeneros;
import Controlador.ControladorPanelPeliculas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;
import javax.swing.border.LineBorder;

public class PanelPeliculas extends JPanel{

	private ControladorPanelPeliculas controladorPanelPeliculas;
	public PanelPeliculas(ControladorPanelPeliculas controladorPanelPeliculas) {
		this.controladorPanelPeliculas=controladorPanelPeliculas;
		setBackground(new Color(255, 228, 181));
		setLayout(null);
		
		JTextArea JTPelis = new JTextArea();
		JTPelis.setEditable(false);
		JTPelis.setBounds(205, 11, 235, 261);
		add(JTPelis);
		
		JLabel lblNewLabel = new JLabel("PELICULAS");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 18));
		lblNewLabel.setBounds(40, 25, 121, 64);
		add(lblNewLabel);
		
		JLabel lblSelecionadas = new JLabel("SELECIONADAS");
		lblSelecionadas.setFont(new Font("Stencil", Font.PLAIN, 18));
		lblSelecionadas.setBounds(29, 66, 155, 64);
		add(lblSelecionadas);
	}
}