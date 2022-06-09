package farmaulife.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;

public class TelaRelatorioVendas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRelatorioVendas frame = new TelaRelatorioVendas();
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
	public TelaRelatorioVendas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblRelatrioVenda = new JLabel("Relat\u00F3rio Venda");
		lblRelatrioVenda.setFont(new Font("Calibri", Font.BOLD, 20));
		lblRelatrioVenda.setAlignmentX(0.5f);
		contentPane.add(lblRelatrioVenda, BorderLayout.NORTH);
		
		JPanel JPanelCadastroAdmin = new JPanel();
		JPanelCadastroAdmin.setLayout(null);
		JPanelCadastroAdmin.setBackground(new Color(153, 204, 204));
		contentPane.add(JPanelCadastroAdmin, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_1.setBounds(256, 287, 89, 23);
		JPanelCadastroAdmin.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cancelar");
		btnNewButton_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_2.setBounds(362, 287, 102, 23);
		JPanelCadastroAdmin.add(btnNewButton_2);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setToolTipText("Data Inicial");
		formattedTextField.setFont(new Font("Calibri", Font.PLAIN, 14));
		formattedTextField.setBounds(10, 11, 144, 20);
		JPanelCadastroAdmin.add(formattedTextField);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setToolTipText("Data Final");
		formattedTextField_1.setFont(new Font("Calibri", Font.PLAIN, 14));
		formattedTextField_1.setBounds(179, 11, 144, 20);
		JPanelCadastroAdmin.add(formattedTextField_1);
		
		JButton btnNewButton_3 = new JButton("Pesquisar");
		btnNewButton_3.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnNewButton_3.setBounds(343, 10, 89, 23);
		JPanelCadastroAdmin.add(btnNewButton_3);
		
		JList list = new JList();
		list.setBounds(36, 56, 200, 205);
		JPanelCadastroAdmin.add(list);
		
		JLabel lblNewLabel = new JLabel("Produtos vendidos");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel.setBounds(67, 42, 122, 14);
		JPanelCadastroAdmin.add(lblNewLabel);
		
		JLabel lblValorTotal = new JLabel("Valor Total");
		lblValorTotal.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblValorTotal.setBounds(179, 262, 71, 14);
		JPanelCadastroAdmin.add(lblValorTotal);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.PLAIN, 14));
		textField.setBounds(246, 257, 96, 20);
		JPanelCadastroAdmin.add(textField);
		textField.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblValor.setBounds(290, 42, 36, 14);
		JPanelCadastroAdmin.add(lblValor);
		
		JList list_1 = new JList();
		list_1.setBounds(246, 56, 96, 205);
		JPanelCadastroAdmin.add(list_1);
	}
}
