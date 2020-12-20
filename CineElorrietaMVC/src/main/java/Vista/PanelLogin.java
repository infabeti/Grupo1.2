package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import Controlador.ControladorPanelLogin;


public class PanelLogin extends JPanel {
	private JTextField txtFUser;
	private JLabel lblDia;
	private JLabel lblUser;
	private JLabel lblContr;
	private JButton btnAceptar, btnEntrar;
	private JComboBox cmbXDia;
	private JPasswordField pswFContraseña;
	private ControladorPanelLogin controladorPanelLogin;

	public PanelLogin(ControladorPanelLogin controladorPanelLogin) {
		
		this.controladorPanelLogin=controladorPanelLogin;
		setLayout(null);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(165, 192, 63, 23);
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, new Color(0, 255, 255), Color.CYAN, Color.CYAN));
		setBounds(150, 150, 530, 505);
		setLayout(null);
		
		txtFUser = new JTextField();
		lblDia = new JLabel("D\u00EDa:");
		lblUser = new JLabel("Usuario:");
		lblContr = new JLabel("Contrase\u00F1a:");
		btnAceptar = new JButton("-->");
		cmbXDia = new JComboBox();
		pswFContraseña = new JPasswordField();
		
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblUser.setBounds(60, 142, 83, 29);
		add(lblUser);
		
		lblContr.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblContr.setBounds(60, 218, 95, 29);
		add(lblContr);
		
		txtFUser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtFUser.setBounds(176, 142, 192, 24);
		add(txtFUser);
		txtFUser.setColumns(10);
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (ControladorPanelLogin.comprobarLogIn(txtFUser.getText(), pswFContraseña.getText())) {
					ControladorPanelLogin.recogerDia((String)cmbXDia.getSelectedItem());
					controladorPanelLogin.accionadoBotonLogin();
				}
				else {
					System.out.println("Algo va mal");
				}
					
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAceptar.setBounds(210, 417, 89, 29);
		add(btnAceptar);
		
		lblDia.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDia.setBounds(119, 306, 95, 29);
		add(lblDia);
		
		cmbXDia.setBounds(224, 306, 130, 28);
		cmbXDia.addItem("Sabado");
		cmbXDia.addItem("Domingo");
		add(cmbXDia);
		
		pswFContraseña.setBounds(176, 223, 192, 24);
		add(pswFContraseña);
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
