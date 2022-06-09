package farmaulife.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JLabel;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setPreferredSize(new Dimension(510, 400));
		setResizable(false);
		setTitle("Sistema FarmaUlife");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 370);
		
		JMenuBar menuBarTelaPrincipal = new JMenuBar();
		setJMenuBar(menuBarTelaPrincipal);
		
		JMenu JMenuLogin = new JMenu("Login");
		JMenuLogin.setFont(new Font("Calibri", Font.BOLD, 18));
		menuBarTelaPrincipal.add(JMenuLogin);
		
		JMenuItem JMenuItemLoginAdmin = new JMenuItem("Administrador");
		JMenuItemLoginAdmin.setFont(new Font("Calibri", Font.PLAIN, 18));
		JMenuLogin.add(JMenuItemLoginAdmin);
		
		JMenuItem JMenuItemLoginAtendente = new JMenuItem("Atendente");
		JMenuItemLoginAtendente.setFont(new Font("Calibri", Font.PLAIN, 18));
		JMenuLogin.add(JMenuItemLoginAtendente);
		
		JMenu JMenuSair = new JMenu("Sair");
		JMenuSair.setFont(new Font("Calibri", Font.BOLD, 18));
		menuBarTelaPrincipal.add(JMenuSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel JPanelTelaPrincipal = new JPanel();
		JPanelTelaPrincipal.setBackground(new Color(153, 204, 204));
		contentPane.add(JPanelTelaPrincipal, BorderLayout.CENTER);
		JPanelTelaPrincipal.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FARMA");
		lblNewLabel.setFont(new Font("Nirmala UI", Font.PLAIN, 90));
		lblNewLabel.setBounds(34, 50, 370, 97);
		JPanelTelaPrincipal.add(lblNewLabel);
		
		JLabel lblUlife = new JLabel("ULIFE");
		lblUlife.setFont(new Font("Nirmala UI", Font.PLAIN, 90));
		lblUlife.setBounds(187, 140, 232, 106);
		JPanelTelaPrincipal.add(lblUlife);
	}

}
