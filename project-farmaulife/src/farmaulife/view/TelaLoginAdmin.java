package farmaulife.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;

public class TelaLoginAdmin extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLoginAdmin frame = new TelaLoginAdmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaLoginAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel JLabelTituloLogin = new JLabel("Login Administrador");
		JLabelTituloLogin.setFont(new Font("Calibri", Font.BOLD, 20));
		JLabelTituloLogin.setAlignmentX(0.5f);
		contentPane.add(JLabelTituloLogin, BorderLayout.NORTH);
		
		JPanel JPanelLoginAdmin = new JPanel();
		JPanelLoginAdmin.setLayout(null);
		JPanelLoginAdmin.setBackground(new Color(153, 204, 204));
		contentPane.add(JPanelLoginAdmin, BorderLayout.CENTER);
		
		JLabel JLabelAdminCpf = new JLabel("CPF: ");
		JLabelAdminCpf.setFont(new Font("Calibri", Font.PLAIN, 18));
		JLabelAdminCpf.setAlignmentX(0.5f);
		JLabelAdminCpf.setBounds(10, 14, 37, 23);
		JPanelLoginAdmin.add(JLabelAdminCpf);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(114, 10, 339, 29);
		JPanelLoginAdmin.add(formattedTextField);
		
		JLabel JLabelAdminSenha = new JLabel("Senha: ");
		JLabelAdminSenha.setFont(new Font("Calibri", Font.PLAIN, 18));
		JLabelAdminSenha.setAlignmentX(0.5f);
		JLabelAdminSenha.setBounds(10, 64, 54, 23);
		JPanelLoginAdmin.add(JLabelAdminSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(114, 60, 340, 29);
		JPanelLoginAdmin.add(passwordField);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton.setBounds(114, 287, 89, 23);
		JPanelLoginAdmin.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_1.setBounds(237, 287, 89, 23);
		JPanelLoginAdmin.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cancelar");
		btnNewButton_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_2.setBounds(352, 287, 102, 23);
		JPanelLoginAdmin.add(btnNewButton_2);
	}

}
