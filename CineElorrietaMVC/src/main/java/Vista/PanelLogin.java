package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Controlador.ControladorPanelLogin;

public class PanelLogin extends JPanel {
	private JPasswordField passwordField;
	private JButton btnEntrar;
	private JTextField textField;
	private ControladorPanelLogin controladorPanelLogin;

	public PanelLogin(ControladorPanelLogin controladorPanelLogin) {
		
		this.controladorPanelLogin=controladorPanelLogin;
		setLayout(null);
		
		 btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(165, 192, 63, 23);
		//btnEntrar.setForeground(Color.WHITE);
		//btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEntrar.setBorderPainted(false);
		//btnEntrar.setBorder(new LineBorder(new Color(0, 0, 0)));
		//btnEntrar.setBackground(new Color(255, 140, 0));
		add(btnEntrar);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(114, 116, 40, 14);
		//lblUsuario.setForeground(Color.BLACK);
		//lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(103, 154, 60, 14);
		//lblContrasea.setForeground(Color.BLACK);
		//lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		//lblContrasea.setBackground(Color.BLACK);
		add(lblContrasea);
		
		JLabel lblNewLabel = new JLabel("Inicia Sesi\u00F3n");
		lblNewLabel.setBounds(165, 64, 59, 14);
		lblNewLabel.setToolTipText("");
		lblNewLabel.setOpaque(true);
		//lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		//lblNewLabel.setForeground(Color.WHITE);
		//lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		//lblNewLabel.setBackground(new Color(255, 140, 0));
		add(lblNewLabel);
		
		passwordField = new JPasswordField();
		//passwordField.setBorder(new LineBorder(new Color(255, 140, 0), 1, true));
		passwordField.setBounds(183, 148, 93, 20);
		add(passwordField);
		
		textField = new JTextField();
		textField.setColumns(10);
		//textField.setBorder(new LineBorder(new Color(255, 140, 0), 1, true));
		textField.setBounds(183, 113, 86, 20);
		add(textField);
		
		initialize();
	}

	private void initialize() {
		this.btnEntrar.addActionListener(listenerBotonLogin(this.controladorPanelLogin));
		
	}

	
	  private ActionListener listenerBotonLogin(ControladorPanelLogin
	  controladorPanelLogin2) { return new ActionListener() { public void
	  actionPerformed(ActionEvent arg0) {
	  System.out.println("Ejecutando evento Boton Login");
	  controladorPanelLogin.accionadoBotonLogin(); } }; }
	 
	
}
