package javapro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RadioButton1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButton1 window = new RadioButton1();
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
	public RadioButton1() {
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
		
		JLabel lblClickYesOr = new JLabel("Click Yes or No");
		lblClickYesOr.setBounds(34, 41, 360, 31);
		frame.getContentPane().add(lblClickYesOr);
		
		JRadioButton rdbtnYes = new JRadioButton("Yes");
		rdbtnYes.setBounds(41, 111, 109, 23);
		frame.getContentPane().add(rdbtnYes);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setBounds(144, 111, 109, 23);
		frame.getContentPane().add(rdbtnNo);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnYes.isSelected())
					rdbtnYes.setEnabled(true);
				rdbtnNo.setEnabled(false);
				if(rdbtnNo.isSelected())
					rdbtnNo.setEnabled(true);
				rdbtnYes.setEnabled(false);
					//JOptionPane.showMessageDialog(rdbtnYes, this, "Yes", 0);
					
				
			}
		});
		btnSelect.setBounds(305, 111, 89, 23);
		frame.getContentPane().add(btnSelect);
		
	}
}
