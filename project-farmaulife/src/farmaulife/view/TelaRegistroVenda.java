package farmaulife.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import farmaulife.controller.AdminController;
import farmaulife.controller.VendaController;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class TelaRegistroVenda extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRegistroVenda frame = new TelaRegistroVenda();
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
	public TelaRegistroVenda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblRegistroVenda = new JLabel("Registro Venda");
		lblRegistroVenda.setFont(new Font("Calibri", Font.BOLD, 20));
		lblRegistroVenda.setAlignmentX(0.5f);
		contentPane.add(lblRegistroVenda, BorderLayout.NORTH);

		JPanel JPanelCadastroAdmin = new JPanel();
		JPanelCadastroAdmin.setLayout(null);
		JPanelCadastroAdmin.setBackground(new Color(153, 204, 204));
		contentPane.add(JPanelCadastroAdmin, BorderLayout.CENTER);

		JLabel lblDataDaCompra = new JLabel("Data da Compra: ");
		lblDataDaCompra.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblDataDaCompra.setAlignmentX(0.5f);
		lblDataDaCompra.setBounds(210, 191, 102, 23);
		JPanelCadastroAdmin.add(lblDataDaCompra);

		JFormattedTextField JFormattedTextField = new JFormattedTextField();
		JFormattedTextField.setFont(new Font("Calibri", Font.PLAIN, 14));
		JFormattedTextField.setBounds(322, 190, 152, 23);
		JPanelCadastroAdmin.add(JFormattedTextField);

		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valorTotal = Double.parseDouble(textField.getText());
				boolean sucesso;

				try {
					VendaController vendaController = new VendaController();
					sucesso = vendaController.cadastrarVenda(textField_1.getText(), textField_2.getText(),
							JFormattedTextField.getText(), valorTotal, JFormattedTextField.getText());
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

		JLabel lblValorDaCompra = new JLabel("Valor da Compra: ");
		lblValorDaCompra.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblValorDaCompra.setAlignmentX(0.5f);
		lblValorDaCompra.setBounds(210, 225, 102, 23);
		JPanelCadastroAdmin.add(lblValorDaCompra);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(322, 221, 152, 23);
		JPanelCadastroAdmin.add(textField);
		textField.setColumns(10);

		JLabel lblNomeComprador = new JLabel("Nome Comprador");
		lblNomeComprador.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNomeComprador.setAlignmentX(0.5f);
		lblNomeComprador.setBounds(10, 11, 112, 23);
		JPanelCadastroAdmin.add(lblNomeComprador);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(189, 7, 285, 23);
		JPanelCadastroAdmin.add(textField_1);

		JLabel lblSobrenomeComprador = new JLabel("Sobrenome Comprador");
		lblSobrenomeComprador.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblSobrenomeComprador.setAlignmentX(0.5f);
		lblSobrenomeComprador.setBounds(10, 45, 132, 23);
		JPanelCadastroAdmin.add(lblSobrenomeComprador);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(189, 75, 285, 23);
		JPanelCadastroAdmin.add(textField_2);

		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblCpf.setAlignmentX(0.5f);
		lblCpf.setBounds(10, 79, 132, 23);
		JPanelCadastroAdmin.add(lblCpf);

		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(189, 43, 285, 23);
		JPanelCadastroAdmin.add(formattedTextField);

		JList list = new JList();
		list.setBounds(10, 126, 179, 141);
		JPanelCadastroAdmin.add(list);
	}
}
