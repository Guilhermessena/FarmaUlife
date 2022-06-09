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

public class TelaAtendente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAtendente frame = new TelaAtendente();
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
	public TelaAtendente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel JLabelAtendente = new JLabel("Atendente");
		JLabelAtendente.setFont(new Font("Calibri", Font.BOLD, 20));
		JLabelAtendente.setAlignmentX(0.5f);
		contentPane.add(JLabelAtendente, BorderLayout.NORTH);
		
		JPanel JPanelAtendente = new JPanel();
		JPanelAtendente.setLayout(null);
		JPanelAtendente.setBackground(new Color(153, 204, 204));
		contentPane.add(JPanelAtendente, BorderLayout.CENTER);
		
		JLabel JLabelVisualizaListaDe = new JLabel("Visualiza\u00E7\u00E3o lista de Usu\u00E1rio e Produto:");
		JLabelVisualizaListaDe.setFont(new Font("Calibri", Font.BOLD, 18));
		JLabelVisualizaListaDe.setAlignmentX(0.5f);
		JLabelVisualizaListaDe.setBounds(96, 11, 301, 23);
		JPanelAtendente.add(JLabelVisualizaListaDe);
		
		JButton btnNewButton_3_1_1_1 = new JButton("Usu\u00E1rio");
		btnNewButton_3_1_1_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_1_1_1.setBounds(31, 56, 100, 23);
		JPanelAtendente.add(btnNewButton_3_1_1_1);
		
		JButton btnNewButton_3_1_1_2 = new JButton("Produto");
		btnNewButton_3_1_1_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3_1_1_2.setBounds(31, 113, 100, 23);
		JPanelAtendente.add(btnNewButton_3_1_1_2);
		
		JButton btnNewButton_2 = new JButton("Cancelar");
		btnNewButton_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_2.setBounds(350, 267, 100, 23);
		JPanelAtendente.add(btnNewButton_2);
	}

}
