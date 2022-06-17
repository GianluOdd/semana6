package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bean.Usuario;
import mantenimiento.GestorUser;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmLogin frame = new frmLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public frmLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setBounds(56, 81, 85, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_1.setBounds(56, 124, 85, 14);
		contentPane.add(lblNewLabel_1);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(138, 78, 86, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(138, 121, 86, 20);
		contentPane.add(txtPassword);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salir();
			}
		});
		btnSalir.setBounds(52, 197, 135, 23);
		contentPane.add(btnSalir);
		
		JButton btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				ingresar();
			}
		});
		
		btnIngresar.setBounds(257, 197, 135, 23);
		contentPane.add(btnIngresar);
	}

	protected void ingresar() {
		
		String usuario = txtUsername.getText();
		String password = String.valueOf(txtPassword.getPassword());
		
		GestorUser gestorUser = new GestorUser();
		
		Usuario usuario2 = new Usuario();
		usuario2.setUsername(usuario);
		usuario2.setPassword(password);
		
		Usuario usu = gestorUser.obtenerUsuario(usuario2);
		
		
		if(usu!=null) {
			JOptionPane.showMessageDialog(contentPane, "Bienvenido");
			
			this.dispose();
			
			frmBienvenido bienvenido = new frmBienvenido();
			bienvenido.setVisible(true);
			
		}else {
			JOptionPane.showMessageDialog(contentPane, "El usuario o la contraseña no coinciden","Error",JOptionPane.ERROR_MESSAGE);
		}
	}

	protected void salir() {
		
		System.exit(0);
		
	}
}
