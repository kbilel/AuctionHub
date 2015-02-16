package tn.esprit.auction.gui.manager;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;

public class AddProduct extends JInternalFrame {
	private JTextField tfProdName;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddProduct frame = new AddProduct();
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
	public AddProduct() {
		setIconifiable(true);
		setClosable(true);
		setMaximizable(true);
		setBounds(100, 100, 531, 376);
		
		JLabel lblAddProduct = new JLabel("Add Product");
		lblAddProduct.setForeground(new Color(178, 34, 34));
		lblAddProduct.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddProduct.setFont(new Font("Times New Roman", Font.BOLD, 22));
		
		JLabel lblProductName = new JLabel("Product Name:");
		lblProductName.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblProductName.setForeground(new Color(0, 0, 0));
		
		JLabel lblCategory = new JLabel("Category:");
		lblCategory.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		
		tfProdName = new JTextField();
		tfProdName.setColumns(10);
		
		JComboBox cbCategory = new JComboBox();
		cbCategory.setModel(new DefaultComboBoxModel(new String[] {"Electronics", "Cell Phones & Accessories", "Music", "Antiques"}));
		
		JSpinner sQuantity = new JSpinner();
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblDt = new JLabel("DT");
		lblDt.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JTextArea taDescription = new JTextArea();
		
		JLabel lblPhoto = new JLabel("Photo:");
		lblPhoto.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		
		JTextPane textPane = new JTextPane();
		
		JButton btnUpload = new JButton("Upload");
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBackground(new Color(255, 255, 240));
		btnNewButton.setSelectedIcon(null);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.setIcon(new ImageIcon(AddProduct.class.getResource("/tn/esprit/auction/gui/manager/tickokjpg.jpg")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(142)
							.addComponent(lblAddProduct))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblProductName)
								.addComponent(lblCategory)
								.addComponent(lblQuantity)
								.addComponent(lblPrice)
								.addComponent(lblDescription))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(sQuantity, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
								.addComponent(cbCategory, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfProdName)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblDt))
								.addComponent(taDescription, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))))
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(37)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPhoto)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
									.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(33, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnUpload)
							.addGap(76))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAddProduct)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblProductName)
						.addComponent(tfProdName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPhoto))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCategory)
								.addComponent(cbCategory, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblQuantity)
								.addComponent(sQuantity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPrice)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDt))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblDescription))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(15)
									.addComponent(taDescription, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnUpload)))
					.addGap(30)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 51, Short.MAX_VALUE)
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);

	}
}
