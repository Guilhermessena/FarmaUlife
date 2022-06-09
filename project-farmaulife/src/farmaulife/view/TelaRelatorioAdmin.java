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
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaRelatorioAdmin extends JFrame {

	private TelaCadastroAdmin telaCadastroAdmin;

	//public TelaRelatorioAdmin() {
		//initComponents();
	//}
	
	

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRelatorioAdmin frame = new TelaRelatorioAdmin();
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
	public TelaRelatorioAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblRelatrioUsuario = new JLabel("Relat\u00F3rio Usuario");
		lblRelatrioUsuario.setFont(new Font("Calibri", Font.BOLD, 20));
		lblRelatrioUsuario.setAlignmentX(0.5f);
		contentPane.add(lblRelatrioUsuario, BorderLayout.NORTH);

		JPanel JPanelCadastroAdmin = new JPanel();
		JPanelCadastroAdmin.setLayout(null);
		JPanelCadastroAdmin.setBackground(new Color(153, 204, 204));
		contentPane.add(JPanelCadastroAdmin, BorderLayout.CENTER);

		JLabel lblNewLabel = new JLabel("Informe o usuario");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 18, 105, 19);
		JPanelCadastroAdmin.add(lblNewLabel);

		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.PLAIN, 14));
		textField.setBounds(125, 17, 172, 19);
		JPanelCadastroAdmin.add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Consulta");
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnNewButton.setBounds(334, 17, 85, 21);
		JPanelCadastroAdmin.add(btnNewButton);

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Email", "Sobrenome", "Nome", "ID" }) {
			Class[] columnTypes = new Class[] { String.class, String.class, String.class, Integer.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.setFont(new Font("Calibri", Font.PLAIN, 14));
		table.setBounds(22, 68, 425, 242);
		JPanelCadastroAdmin.add(table);
	}

}
