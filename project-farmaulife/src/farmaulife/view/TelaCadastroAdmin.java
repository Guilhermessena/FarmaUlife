package farmaulife.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import farmaulife.controller.AdminController;
import farmaulife.model.Admin;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroAdmin extends JFrame {

	private JPanel ContentPane;
	private JTextField JTextFieldAdminNome;
	private JTextField JTextFieldAdminEmail;
	private JPasswordField JPasswordFieldAdmin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroAdmin frame = new TelaCadastroAdmin();
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
	public TelaCadastroAdmin() {
		setPreferredSize(new Dimension(510, 400));
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 510, 400);
		ContentPane = new JPanel();
		ContentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ContentPane);
		ContentPane.setLayout(null);

		JLabel JLabelTituloCadastro = new JLabel("Cadastro de Administrador");
		JLabelTituloCadastro.setAlignmentX(Component.CENTER_ALIGNMENT);
		JLabelTituloCadastro.setBounds(5, 0, 484, 30);
		JLabelTituloCadastro.setFont(new Font("Calibri", Font.BOLD, 20));
		ContentPane.add(JLabelTituloCadastro);

		JPanel JPanelCadastroAdmin = new JPanel();
		JPanelCadastroAdmin.setBounds(5, 24, 489, 337);
		JPanelCadastroAdmin.setBackground(new Color(153, 204, 204));
		ContentPane.add(JPanelCadastroAdmin);
		JPanelCadastroAdmin.setLayout(null);

		JLabel JLabelAdminNome = new JLabel("Nome: ");
		JLabelAdminNome.setAlignmentX(Component.CENTER_ALIGNMENT);
		JLabelAdminNome.setBounds(10, 8, 54, 23);
		JLabelAdminNome.setFont(new Font("Calibri", Font.PLAIN, 18));
		JPanelCadastroAdmin.add(JLabelAdminNome);

		JTextFieldAdminNome = new JTextField();
		JTextFieldAdminNome.setBounds(114, 5, 339, 29);
		JTextFieldAdminNome.setFont(new Font("Calibri", Font.PLAIN, 18));
		JTextFieldAdminNome.setForeground(new Color(0, 0, 0));
		JPanelCadastroAdmin.add(JTextFieldAdminNome);
		JTextFieldAdminNome.setColumns(10);

		JLabel JLabelAdminEmail = new JLabel("Email: ");
		JLabelAdminEmail.setFont(new Font("Calibri", Font.PLAIN, 18));
		JLabelAdminEmail.setAlignmentX(0.5f);
		JLabelAdminEmail.setBounds(10, 58, 49, 23);
		JPanelCadastroAdmin.add(JLabelAdminEmail);

		JTextFieldAdminEmail = new JTextField();
		JTextFieldAdminEmail.setFont(new Font("Calibri", Font.PLAIN, 18));
		JTextFieldAdminEmail.setColumns(10);
		JTextFieldAdminEmail.setBounds(114, 55, 339, 29);
		JPanelCadastroAdmin.add(JTextFieldAdminEmail);

		JLabel JLabelSenha = new JLabel("Senha: ");
		JLabelSenha.setFont(new Font("Calibri", Font.PLAIN, 18));
		JLabelSenha.setAlignmentX(0.5f);
		JLabelSenha.setBounds(10, 115, 54, 23);
		JPanelCadastroAdmin.add(JLabelSenha);

		JPasswordFieldAdmin = new JPasswordField();
		JPasswordFieldAdmin.setFont(new Font("Calibri", Font.PLAIN, 18));
		JPasswordFieldAdmin.setBounds(114, 112, 339, 29);
		JPanelCadastroAdmin.add(JPasswordFieldAdmin);

		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean sucesso;

				try {
					AdminController adminController = new AdminController();
					sucesso = adminController.cadastrarAdmin(JTextFieldAdminNome.getText(),
							JTextFieldAdminEmail.getText(), JPasswordFieldAdmin.getText());
					if (sucesso == true) {
						JOptionPane.showMessageDialog(null, "o cadastro foi realizado com sucesso");
					} else {
						JOptionPane.showMessageDialog(null, "os campos não foram preenchidos corretamente");
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Erro: " + ex);
				}

			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton.setBounds(114, 287, 89, 23);
		JPanelCadastroAdmin.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_1.setBounds(237, 287, 89, 23);
		JPanelCadastroAdmin.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Cancelar");
		btnNewButton_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_2.setBounds(352, 287, 102, 23);
		JPanelCadastroAdmin.add(btnNewButton_2);
	}
}
