package tn.esprit.auction.gui.authentification;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Scrollbar;
import java.awt.ScrollPane;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import tn.esprit.auction.gui.client.SubscribingSpace;

import java.awt.Component;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomeAllUsers extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeAllUsers frame = new HomeAllUsers();
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
	public HomeAllUsers() {
		setTitle("Clic Bid");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 901, 657);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 885, 619);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(HomeAllUsers.class.getResource("/tn/esprit/auction/gui/authentification/images (1).png")));
		label.setBounds(0, 99, 885, 520);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 885, 97);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(HomeAllUsers.class.getResource("/tn/esprit/auction/gui/authentification/bid1.gif")));
		lblNewLabel.setBounds(0, 0, 161, 97);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(313, 43, 151, 31);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(474, 43, 95, 31);
		panel_1.add(comboBox);
		
		JButton btnGo = new JButton("");
		btnGo.setIcon(new ImageIcon(HomeAllUsers.class.getResource("/tn/esprit/auction/gui/authentification/search.png")));
		btnGo.setBounds(579, 42, 78, 32);
		panel_1.add(btnGo);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Authentification().setVisible(true);
				setVisible(false);
			}
		});
		btnConnect.setBounds(786, 0, 89, 86);
		panel_1.add(btnConnect);
	}
}
