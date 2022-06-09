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
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaAdmin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAdmin frame = new TelaAdmin();
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
	public TelaAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel JlabelAdministrador = new JLabel("Administrador");
		JlabelAdministrador.setFont(new Font("Calibri", Font.BOLD, 20));
		JlabelAdministrador.setAlignmentX(0.5f);
		contentPane.add(JlabelAdministrador, BorderLayout.NORTH);
		
		JPanel JPanelAdmin = new JPanel();
		JPanelAdmin.setLayout(null);
		JPanelAdmin.setBackground(new Color(153, 204, 204));
		contentPane.add(JPanelAdmin, BorderLayout.CENTER);
		
		JLabel JLabelRealizarCompraAdmin = new JLabel("Registrar venda ->");
		JLabelRealizarCompraAdmin.setFont(new Font("Calibri", Font.BOLD, 18));
		JLabelRealizarCompraAdmin.setAlignmentX(0.5f);
		JLabelRealizarCompraAdmin.setBounds(10, 45, 166, 23);
		JPanelAdmin.add(JLabelRealizarCompraAdmin);
		
		JButton btnNewButton_3 = new JButton("Registrar");
		btnNewButton_3.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3.setBounds(276, 45, 112, 23);
		JPanelAdmin.add(btnNewButton_3);
		
		JMenuBar JMenuBarAdmin = new JMenuBar();
		JMenuBarAdmin.setBounds(0, 0, 494, 29);
		JPanelAdmin.add(JMenuBarAdmin);
		
		JMenu JMenuAdmin = new JMenu("Cadastrar");
		JMenuAdmin.setFont(new Font("Calibri", Font.PLAIN, 18));
		JMenuBarAdmin.add(JMenuAdmin);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Administrador");
		mntmNewMenuItem.setFont(new Font("Calibri", Font.PLAIN, 18));
		JMenuAdmin.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Atendente");
		mntmNewMenuItem_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		JMenuAdmin.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Produto");
		mntmNewMenuItem_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		JMenuAdmin.add(mntmNewMenuItem_2);
		
		JMenu mnSair = new JMenu("Sair");
		mnSair.setFont(new Font("Calibri", Font.PLAIN, 18));
		JMenuBarAdmin.add(mnSair);
		
		JLabel JLabelGerarRelatrio = new JLabel("Gerar Relat\u00F3rio de vendas ->");
		JLabelGerarRelatrio.setFont(new Font("Calibri", Font.BOLD, 18));
		JLabelGerarRelatrio.setAlignmentX(0.5f);
		JLabelGerarRelatrio.setBounds(10, 79, 222, 23);
		JPanelAdmin.add(JLabelGerarRelatrio);
		
		JButton btnNewButton_3_1 = new JButton("Visualizar");
		btnNewButton_3_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_1.setBounds(276, 79, 112, 23);
		JPanelAdmin.add(btnNewButton_3_1);
		
		JLabel JLabelVisualizaListaDe = new JLabel("Visualiza\u00E7\u00E3o lista de Usu\u00E1rio e Produto:");
		JLabelVisualizaListaDe.setFont(new Font("Calibri", Font.BOLD, 18));
		JLabelVisualizaListaDe.setAlignmentX(0.5f);
		JLabelVisualizaListaDe.setBounds(87, 171, 301, 23);
		JPanelAdmin.add(JLabelVisualizaListaDe);
		
		JButton btnNewButton_3_1_1_1 = new JButton("Usu\u00E1rio");
		btnNewButton_3_1_1_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_1_1_1.setBounds(10, 199, 100, 23);
		JPanelAdmin.add(btnNewButton_3_1_1_1);
		
		JButton btnNewButton_3_1_1_2 = new JButton("Produto");
		btnNewButton_3_1_1_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_1_1_2.setBounds(10, 233, 100, 23);
		JPanelAdmin.add(btnNewButton_3_1_1_2);
	}
}
