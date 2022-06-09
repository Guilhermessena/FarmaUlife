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
import javax.swing.JList;

public class TelaRelatorioProduto extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRelatorioProduto frame = new TelaRelatorioProduto();
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
	public TelaRelatorioProduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblRelatrioProduto = new JLabel("Relat\u00F3rio Produto");
		lblRelatrioProduto.setFont(new Font("Calibri", Font.BOLD, 20));
		lblRelatrioProduto.setAlignmentX(0.5f);
		contentPane.add(lblRelatrioProduto, BorderLayout.NORTH);
		
		JPanel JPanelCadastroAdmin = new JPanel();
		JPanelCadastroAdmin.setLayout(null);
		JPanelCadastroAdmin.setBackground(new Color(153, 204, 204));
		contentPane.add(JPanelCadastroAdmin, BorderLayout.CENTER);
		
		JButton btnNewButton_2 = new JButton("Cancelar");
		btnNewButton_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_2.setBounds(362, 287, 102, 23);
		JPanelCadastroAdmin.add(btnNewButton_2);
		
		JList list = new JList();
		list.setBounds(36, 11, 398, 267);
		JPanelCadastroAdmin.add(list);
	}

}
