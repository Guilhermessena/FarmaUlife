package farmaulife.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import farmaulife.controller.ProdutoController;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroProduto extends JFrame {

	private JPanel contentPane;
	private JTextField JTextFieldProdutoNome;
	private JTextField JTextFieldProdutoValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroProduto frame = new TelaCadastroProduto();
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
	public TelaCadastroProduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel JLabelTituloCadastroProduto = new JLabel("Produto");
		JLabelTituloCadastroProduto.setFont(new Font("Calibri", Font.PLAIN, 20));
		JLabelTituloCadastroProduto.setAlignmentX(0.5f);
		contentPane.add(JLabelTituloCadastroProduto, BorderLayout.NORTH);

		JPanel JPanelCadastroProduto = new JPanel();
		JPanelCadastroProduto.setToolTipText("Escolha o produto");
		JPanelCadastroProduto.setLayout(null);
		JPanelCadastroProduto.setBackground(new Color(153, 204, 204));
		contentPane.add(JPanelCadastroProduto, BorderLayout.CENTER);

		JLabel JLabelProdutoNome = new JLabel("Nome: ");
		JLabelProdutoNome.setFont(new Font("Calibri", Font.PLAIN, 18));
		JLabelProdutoNome.setAlignmentX(0.5f);
		JLabelProdutoNome.setBounds(10, 8, 54, 23);
		JPanelCadastroProduto.add(JLabelProdutoNome);

		JTextFieldProdutoNome = new JTextField();
		JTextFieldProdutoNome.setForeground(Color.BLACK);
		JTextFieldProdutoNome.setFont(new Font("Calibri", Font.PLAIN, 18));
		JTextFieldProdutoNome.setColumns(10);
		JTextFieldProdutoNome.setBounds(124, 5, 339, 29);
		JPanelCadastroProduto.add(JTextFieldProdutoNome);

		JLabel JLabelProdutoValor = new JLabel("Valor: ");
		JLabelProdutoValor.setFont(new Font("Calibri", Font.PLAIN, 18));
		JLabelProdutoValor.setAlignmentX(0.5f);
		JLabelProdutoValor.setBounds(10, 56, 94, 23);
		JPanelCadastroProduto.add(JLabelProdutoValor);

		JTextFieldProdutoValor = new JTextField();
		JTextFieldProdutoValor.setFont(new Font("Calibri", Font.PLAIN, 18));
		JTextFieldProdutoValor.setColumns(10);
		JTextFieldProdutoValor.setBounds(124, 53, 339, 29);
		JPanelCadastroProduto.add(JTextFieldProdutoValor);

		JLabel JLabelProdutoTipo = new JLabel("Tipo de Produto: ");
		JLabelProdutoTipo.setFont(new Font("Calibri", Font.PLAIN, 18));
		JLabelProdutoTipo.setAlignmentX(0.5f);
		JLabelProdutoTipo.setBounds(10, 105, 133, 23);
		JPanelCadastroProduto.add(JLabelProdutoTipo);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Produto Farmac\u00EAutico", "Produto de Higiene" }));
		comboBox.setToolTipText("");
		comboBox.setFont(new Font("Calibri", Font.PLAIN, 18));
		comboBox.setBounds(165, 105, 198, 22);
		JPanelCadastroProduto.add(comboBox);

		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valorProduto = Double.parseDouble(JTextFieldProdutoValor.getText());
				String tipoProduto = comboBox.getSelectedItem().toString();

				boolean sucesso;

				try {
					ProdutoController produtoController = new ProdutoController();
					sucesso = produtoController.cadastrarProduto(JTextFieldProdutoNome.getText(), valorProduto,
							tipoProduto);
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
		btnNewButton.setBounds(124, 280, 89, 23);
		JPanelCadastroProduto.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_1.setBounds(245, 280, 89, 23);
		JPanelCadastroProduto.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Cancelar");
		btnNewButton_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_2.setBounds(361, 280, 102, 23);
		JPanelCadastroProduto.add(btnNewButton_2);
	}

}
