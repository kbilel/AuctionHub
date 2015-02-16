package tn.esprit.auction.gui.manager;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

import java.awt.Insets;
import java.awt.Font;

import javax.swing.JLabel;

//import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.JEditorPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.JButton;

import tn.esprit.auction.gui.authentification.Authentification;

import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EspaceManager extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EspaceManager frame = new EspaceManager();
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
	public EspaceManager() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(EspaceManager.class.getResource("/javax/swing/plaf/metal/icons/ocean/computer.gif")));
		setTitle("Auction");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 892, 494);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		menuBar.setToolTipText("");
		menuBar.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 16));
		setJMenuBar(menuBar);
		
		JMenuItem mntmHome = new JMenuItem("Home");
		menuBar.add(mntmHome);
		
		JMenuItem mntmAuctions = new JMenuItem("Auctions");
		menuBar.add(mntmAuctions);
		
		JMenuItem mntmProducts = new JMenuItem("Products");
		menuBar.add(mntmProducts);
		
		JMenuItem mntmAboutUs = new JMenuItem("About us");
		menuBar.add(mntmAboutUs);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		menuBar_1.setBounds(0, 150, 866, 21);
		contentPane.add(menuBar_1);
		
		JMenuItem mntmMyProfile = new JMenuItem("My Profile");
		menuBar_1.add(mntmMyProfile);
		
		JMenuItem mntmMessage = new JMenuItem("Message");
		menuBar_1.add(mntmMessage);
		
		JMenuItem mntmManageAuctions = new JMenuItem("Manage Auctions");
		menuBar_1.add(mntmManageAuctions);
		
		JMenuItem mntmManageOrders = new JMenuItem("Manage Order");
		menuBar_1.add(mntmManageOrders);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(667, 182, 199, 258);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblManager = new JLabel("Manager");
		lblManager.setForeground(new Color(0, 0, 139));
		lblManager.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblManager.setBounds(59, 11, 100, 41);
		panel.add(lblManager);
		
		JLabel lblUserName = new JLabel("User Name :");
		lblUserName.setBounds(20, 173, 69, 14);
		panel.add(lblUserName);
		
		JButton btnLogOut = new JButton("Log out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Authentification frame = new Authentification();
				frame.setVisible(true);
			}
		});
		btnLogOut.setIcon(new ImageIcon(EspaceManager.class.getResource("/javax/swing/plaf/metal/icons/ocean/error.png")));
		btnLogOut.setBounds(68, 211, 121, 36);
		panel.add(btnLogOut);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(EspaceManager.class.getResource("/tn/esprit/auction/gui/manager/bid.png")));
		lblNewLabel.setBounds(27, 0, 120, 116);
		contentPane.add(lblNewLabel);
		
		JLabel lblISubscribe = new JLabel("Manager  Space");
		lblISubscribe.setBackground(Color.WHITE);
		lblISubscribe.setForeground(Color.RED);
		lblISubscribe.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 40));
		lblISubscribe.setBounds(246, 36, 659, 74);
		contentPane.add(lblISubscribe);
	}
}
