package com.ismo.crjj.ihm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ismo.crjj.metier.IMetier;
import com.ismo.crjj.metier.MetierProduit;
import com.ismo.crjj.model.Produit;

import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.util.List;

import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;

public class Principale extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JList listproduit;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JRadioButton rd1;
	private JRadioButton rd2;
	private JRadioButton rd3;
	private JTextField txtcode;
	private JTextField txt_lib;
	private JTextField txt_achat;
	private JTextField txtvente;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	DefaultListModel<String> model = new DefaultListModel<>();
	List<Produit> produits;
	IMetier<Produit> metier = new MetierProduit();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principale frame = new Principale();
					frame.setVisible(true);
					frame.pack();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principale() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE, 0.0, 0.0, 0.0};
		contentPane.setLayout(gbl_contentPane);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(10, 10, 10, 10);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Rechercher");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 0;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		listproduit = new JList();
		GridBagConstraints gbc_listproduit = new GridBagConstraints();
		gbc_listproduit.gridheight = 6;
		gbc_listproduit.insets = new Insets(0, 0, 5, 5);
		gbc_listproduit.gridwidth = 2;
		gbc_listproduit.fill = GridBagConstraints.BOTH;
		gbc_listproduit.gridx = 0;
		gbc_listproduit.gridy = 1;
		listproduit.setModel(model);
		contentPane.add(listproduit, gbc_listproduit);
		
		txtcode = new JTextField();
		GridBagConstraints gbc_txtcode = new GridBagConstraints();
		gbc_txtcode.insets = new Insets(0, 0, 5, 5);
		gbc_txtcode.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtcode.gridx = 3;
		gbc_txtcode.gridy = 1;
		contentPane.add(txtcode, gbc_txtcode);
		txtcode.setColumns(10);
		
		btnNewButton_6 = new JButton("Ajouter");
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_6.gridx = 6;
		gbc_btnNewButton_6.gridy = 1;
		contentPane.add(btnNewButton_6, gbc_btnNewButton_6);
		
		lblNewLabel_1 = new JLabel("Libelle produit :");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 2;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txt_lib = new JTextField();
		GridBagConstraints gbc_txt_lib = new GridBagConstraints();
		gbc_txt_lib.gridwidth = 3;
		gbc_txt_lib.insets = new Insets(0, 0, 5, 5);
		gbc_txt_lib.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_lib.gridx = 3;
		gbc_txt_lib.gridy = 2;
		contentPane.add(txt_lib, gbc_txt_lib);
		txt_lib.setColumns(10);
		
		btnNewButton_7 = new JButton("Modifier");
		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		gbc_btnNewButton_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_7.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_7.gridx = 6;
		gbc_btnNewButton_7.gridy = 2;
		contentPane.add(btnNewButton_7, gbc_btnNewButton_7);
		
		lblNewLabel_2 = new JLabel("Prix achat : ");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 3;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txt_achat = new JTextField();
		GridBagConstraints gbc_txt_achat = new GridBagConstraints();
		gbc_txt_achat.gridwidth = 2;
		gbc_txt_achat.insets = new Insets(0, 0, 5, 5);
		gbc_txt_achat.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_achat.gridx = 3;
		gbc_txt_achat.gridy = 3;
		contentPane.add(txt_achat, gbc_txt_achat);
		txt_achat.setColumns(10);
		
		btnNewButton_8 = new JButton("Supprimer");
		GridBagConstraints gbc_btnNewButton_8 = new GridBagConstraints();
		gbc_btnNewButton_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_8.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_8.gridx = 6;
		gbc_btnNewButton_8.gridy = 3;
		contentPane.add(btnNewButton_8, gbc_btnNewButton_8);
		
		lblNewLabel_3 = new JLabel("Prix vente :");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 4;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		txtvente = new JTextField();
		txtvente.setText("");
		GridBagConstraints gbc_txtvente = new GridBagConstraints();
		gbc_txtvente.gridwidth = 2;
		gbc_txtvente.insets = new Insets(0, 0, 5, 5);
		gbc_txtvente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtvente.gridx = 3;
		gbc_txtvente.gridy = 4;
		contentPane.add(txtvente, gbc_txtvente);
		txtvente.setColumns(10);
		
		btnNewButton_9 = new JButton("Rechercher");
		GridBagConstraints gbc_btnNewButton_9 = new GridBagConstraints();
		gbc_btnNewButton_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_9.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_9.gridx = 6;
		gbc_btnNewButton_9.gridy = 4;
		contentPane.add(btnNewButton_9, gbc_btnNewButton_9);
		
		lblNewLabel_4 = new JLabel("Famille produit : ");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 2;
		gbc_lblNewLabel_4.gridy = 5;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		rd1 = new JRadioButton("Agricole");
		buttonGroup.add(rd1);
		rd1.setSelected(true);
		GridBagConstraints gbc_rd1 = new GridBagConstraints();
		gbc_rd1.anchor = GridBagConstraints.SOUTH;
		gbc_rd1.gridheight = 2;
		gbc_rd1.insets = new Insets(0, 0, 5, 5);
		gbc_rd1.gridx = 3;
		gbc_rd1.gridy = 5;
		contentPane.add(rd1, gbc_rd1);
		
		rd2 = new JRadioButton("Textile");
		buttonGroup.add(rd2);
		GridBagConstraints gbc_rd2 = new GridBagConstraints();
		gbc_rd2.anchor = GridBagConstraints.SOUTH;
		gbc_rd2.gridheight = 2;
		gbc_rd2.insets = new Insets(0, 0, 5, 5);
		gbc_rd2.gridx = 4;
		gbc_rd2.gridy = 5;
		contentPane.add(rd2, gbc_rd2);
		
		rd3 = new JRadioButton("Epicerie");
		buttonGroup.add(rd3);
		GridBagConstraints gbc_rd3 = new GridBagConstraints();
		gbc_rd3.anchor = GridBagConstraints.SOUTH;
		gbc_rd3.gridheight = 2;
		gbc_rd3.insets = new Insets(0, 0, 5, 5);
		gbc_rd3.gridx = 5;
		gbc_rd3.gridy = 5;
		contentPane.add(rd3, gbc_rd3);
		
		btnNewButton_10 = new JButton("Fermer");
		GridBagConstraints gbc_btnNewButton_10 = new GridBagConstraints();
		gbc_btnNewButton_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_10.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_10.gridx = 6;
		gbc_btnNewButton_10.gridy = 5;
		contentPane.add(btnNewButton_10, gbc_btnNewButton_10);
		
		btnNewButton_1 = new JButton("<<");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 7;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
		
		btnNewButton_2 = new JButton(">>");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_2.gridx = 1;
		gbc_btnNewButton_2.gridy = 7;
		contentPane.add(btnNewButton_2, gbc_btnNewButton_2);
		
		lblNewLabel = new JLabel("Code produit :");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		btnNewButton_3 = new JButton("Enregistrer");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_3.gridx = 3;
		gbc_btnNewButton_3.gridy = 7;
		contentPane.add(btnNewButton_3, gbc_btnNewButton_3);
		
		btnNewButton_4 = new JButton("Annuler");
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_4.gridx = 4;
		gbc_btnNewButton_4.gridy = 7;
		contentPane.add(btnNewButton_4, gbc_btnNewButton_4);
		
		btnNewButton_5 = new JButton("Initialiser");
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_5.gridx = 5;
		gbc_btnNewButton_5.gridy = 7;
		contentPane.add(btnNewButton_5, gbc_btnNewButton_5);
		
		
		produits = metier.getAll();
		fillListProduit(produits);
	}
	
	
	public void fillListProduit(List<Produit> produits) {
		model.clear();
		
		for(Produit p : produits)
			model.addElement(String.format("P%04d - %s", p.getCode(), p.getLibelle()));
		
		listproduit.setSelectedIndex(0);
	}
	
	

}
