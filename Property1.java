package javapro;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.*;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class Property1  {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Property1();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Property1 window = new Property1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Property1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setBounds(10, 11, 86, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setBounds(10, 44, 46, 14);
		frame.getContentPane().add(lblGender);
		
		JLabel lblDob = new JLabel("D.O.B");
		lblDob.setBounds(10, 69, 46, 14);
		frame.getContentPane().add(lblDob);
		
		JLabel lblNewLabel_1 = new JLabel("AGE");
		lblNewLabel_1.setBounds(10, 94, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblQualification = new JLabel("QUALIFICATION");
		lblQualification.setBounds(10, 119, 46, 14);
		frame.getContentPane().add(lblQualification);
		
		textField = new JTextField();
		textField.setBounds(128, 12, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male\r\n");
		rdbtnNewRadioButton.setBounds(124, 40, 53, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setBounds(175, 40, 59, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6"}));
		comboBox.setBounds(128, 66, 49, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(185, 66, 49, 20);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(244, 66, 73, 20);
		frame.getContentPane().add(comboBox_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(128, 91, 49, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(128, 116, 86, 20);
		frame.getContentPane().add(comboBox_3);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 144, 46, 14);
		frame.getContentPane().add(label);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSubmit.setBounds(69, 189, 89, 23);
		frame.getContentPane().add(btnSubmit);
	}
	}


