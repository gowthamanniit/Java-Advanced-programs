package javapro;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CoboBxEx1 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoboBxEx1 window = new CoboBxEx1();
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
	public CoboBxEx1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox.setBounds(101, 47, 56, 29);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "july"}));
		comboBox_1.setBounds(167, 47, 122, 29);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1995", "1996", "1997", "1998", "1999", "2000"}));
		comboBox_2.setBounds(299, 47, 78, 29);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(13, 47, 56, 29);
		frame.getContentPane().add(lblDate);
		
		textField = new JTextField();
		textField.setBounds(73, 103, 279, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("click");
		btnNewButton.setBounds(362, 102, 62, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String date=(String) comboBox.getItemAt(comboBox.getSelectedIndex());
				String month=(String)comboBox_1.getItemAt(comboBox_1.getSelectedIndex());
				String Year=(String)comboBox_2.getItemAt(comboBox_2.getSelectedIndex());
				textField.setText(date+"/"+month+"/"+Year);
				
			}
		});
	}
}
