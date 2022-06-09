package farmaulife.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import farmaulife.controller.AtendenteController;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroAtendente extends JFrame {

	private JPanel contentPane;
	private JTextField JTextFieldAtendenteNome;
	private JTextField JTextFieldAtendenteSobrenome;
	private JTextField JTextFieldAtendenteEmail;
	private JPasswordField JPasswordFieldAtendente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroAtendente frame = new TelaCadastroAtendente();
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
	public TelaCadastroAtendente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel JLabelTituloCadastroAtendente = new JLabel("Cadastro de Atendente");
		JLabelTituloCadastroAtendente.setFont(new Font("Calibri", Font.PLAIN, 20));
		JLabelTituloCadastroAtendente.setAlignmentX(0.5f);
		contentPane.add(JLabelTituloCadastroAtendente, BorderLayout.NORTH);

		JPanel JPanelCadastroAtendente = new JPanel();
		JPanelCadastroAtendente.setLayout(null);
		JPanelCadastroAtendente.setBackground(new Color(153, 204, 204));
		contentPane.add(JPanelCadastroAtendente, BorderLayout.CENTER);

		JLabel JLabelAtendenteNome = new JLabel("Nome: ");
		JLabelAtendenteNome.setFont(new Font("Calibri", Font.PLAIN, 18));
		JLabelAtendenteNome.setAlignmentX(0.5f);
		JLabelAtendenteNome.setBounds(10, 8, 54, 23);
		JPanelCadastroAtendente.add(JLabelAtendenteNome);

		JTextFieldAtendenteNome = new JTextField();
		JTextFieldAtendenteNome.setForeground(Color.BLACK);
		JTextFieldAtendenteNome.setFont(new Font("Calibri", Font.PLAIN, 18));
		JTextFieldAtendenteNome.setColumns(10);
		JTextFieldAtendenteNome.setBounds(114, 5, 339, 29);
		JPanelCadastroAtendente.add(JTextFieldAtendenteNome);

		JLabel JLabelAtendenteSobrenome = new JLabel("Sobrenome: ");
		JLabelAtendenteSobrenome.setFont(new Font("Calibri", Font.PLAIN, 18));
		JLabelAtendenteSobrenome.setAlignmentX(0.5f);
		JLabelAtendenteSobrenome.setBounds(10, 56, 94, 23);
		JPanelCadastroAtendente.add(JLabelAtendenteSobrenome);

		JTextFieldAtendenteSobrenome = new JTextField();
		JTextFieldAtendenteSobrenome.setFont(new Font("Calibri", Font.PLAIN, 18));
		JTextFieldAtendenteSobrenome.setColumns(10);
		JTextFieldAtendenteSobrenome.setBounds(114, 53, 339, 29);
		JPanelCadastroAtendente.add(JTextFieldAtendenteSobrenome);

		JLabel JLabelAtendenteCpf = new JLabel("CPF: ");
		JLabelAtendenteCpf.setFont(new Font("Calibri", Font.PLAIN, 18));
		JLabelAtendenteCpf.setAlignmentX(0.5f);
		JLabelAtendenteCpf.setBounds(10, 105, 37, 23);
		JPanelCadastroAtendente.add(JLabelAtendenteCpf);

		JFormattedTextField JFormattedTextFieldAtendente = new JFormattedTextField();
		JFormattedTextFieldAtendente.setBounds(114, 101, 339, 29);
		JPanelCadastroAtendente.add(JFormattedTextFieldAtendente);

		JLabel JLabelAtendenteEmail = new JLabel("Email: ");
		JLabelAtendenteEmail.setFont(new Font("Calibri", Font.PLAIN, 18));
		JLabelAtendenteEmail.setAlignmentX(0.5f);
		JLabelAtendenteEmail.setBounds(10, 155, 49, 23);
		JPanelCadastroAtendente.add(JLabelAtendenteEmail);

		JTextFieldAtendenteEmail = new JTextField();
		JTextFieldAtendenteEmail.setFont(new Font("Calibri", Font.PLAIN, 18));
		JTextFieldAtendenteEmail.setColumns(10);
		JTextFieldAtendenteEmail.setBounds(114, 152, 339, 29);
		JPanelCadastroAtendente.add(JTextFieldAtendenteEmail);

		JLabel JLabelAtendenteSenha = new JLabel("Senha: ");
		JLabelAtendenteSenha.setFont(new Font("Calibri", Font.PLAIN, 18));
		JLabelAtendenteSenha.setAlignmentX(0.5f);
		JLabelAtendenteSenha.setBounds(10, 206, 54, 23);
		JPanelCadastroAtendente.add(JLabelAtendenteSenha);

		JPasswordFieldAtendente = new JPasswordField();
		JPasswordFieldAtendente.setBounds(114, 202, 339, 29);
		JPanelCadastroAtendente.add(JPasswordFieldAtendente);

		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean sucesso;

				try {
					AtendenteController atendenteController = new AtendenteController();
					sucesso = atendenteController.cadastrarAtendente(JTextFieldAtendenteNome.getText(),
							JTextFieldAtendenteSobrenome.getText(), JTextFieldAtendenteEmail.getText(),
							JFormattedTextFieldAtendente.getText(), JPasswordFieldAtendente.getText());
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
		btnNewButton.setBounds(114, 280, 89, 23);
		JPanelCadastroAtendente.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_1.setBounds(232, 280, 89, 23);
		JPanelCadastroAtendente.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Cancelar");
		btnNewButton_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_2.setBounds(351, 280, 102, 23);
		JPanelCadastroAtendente.add(btnNewButton_2);
	}

}
