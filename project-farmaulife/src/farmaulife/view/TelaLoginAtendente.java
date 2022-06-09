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

public class TelaLoginAtendente extends JFrame {

	private JPanel contentPane;
	private JPasswordField JPasswordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLoginAtendente frame = new TelaLoginAtendente();
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
	public TelaLoginAtendente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel JlabelLoginAtendente = new JLabel("Login Atendente");
		JlabelLoginAtendente.setFont(new Font("Calibri", Font.BOLD, 20));
		JlabelLoginAtendente.setAlignmentX(0.5f);
		contentPane.add(JlabelLoginAtendente, BorderLayout.NORTH);
		
		JPanel JPanelLoginAtendente = new JPanel();
		JPanelLoginAtendente.setLayout(null);
		JPanelLoginAtendente.setBackground(new Color(153, 204, 204));
		contentPane.add(JPanelLoginAtendente, BorderLayout.CENTER);
		
		JLabel JLabelAtendenteCpf = new JLabel("CPF: ");
		JLabelAtendenteCpf.setFont(new Font("Calibri", Font.PLAIN, 18));
		JLabelAtendenteCpf.setAlignmentX(0.5f);
		JLabelAtendenteCpf.setBounds(10, 14, 37, 23);
		JPanelLoginAtendente.add(JLabelAtendenteCpf);
		
		JFormattedTextField JFormattedTextField = new JFormattedTextField();
		JFormattedTextField.setBounds(114, 10, 339, 29);
		JPanelLoginAtendente.add(JFormattedTextField);
		
		JLabel JLabelAtendenteSenha = new JLabel("Senha: ");
		JLabelAtendenteSenha.setFont(new Font("Calibri", Font.PLAIN, 18));
		JLabelAtendenteSenha.setAlignmentX(0.5f);
		JLabelAtendenteSenha.setBounds(10, 64, 54, 23);
		JPanelLoginAtendente.add(JLabelAtendenteSenha);
		
		JPasswordField = new JPasswordField();
		JPasswordField.setBounds(114, 60, 340, 29);
		JPanelLoginAtendente.add(JPasswordField);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton.setBounds(114, 287, 89, 23);
		JPanelLoginAtendente.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_1.setBounds(237, 287, 89, 23);
		JPanelLoginAtendente.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cancelar");
		btnNewButton_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_2.setBounds(352, 287, 102, 23);
		JPanelLoginAtendente.add(btnNewButton_2);
	}

}
