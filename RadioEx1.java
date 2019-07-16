package javapro;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class RadioEx1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioEx1 window = new RadioEx1();
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
	public RadioEx1() {
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
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(26, 41, 109, 23);
		frame.getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(209, 41, 109, 23);
		frame.getContentPane().add(rdbtnFemale);
		
		JButton btnClick = new JButton("Click");
		btnClick.setBounds(116, 99, 89, 23);
		frame.getContentPane().add(btnClick);
		
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnMale.isSelected())
					rdbtnMale.setEnabled(true);
				rdbtnFemale.setEnabled(false);
				if(rdbtnFemale.isSelected())
					rdbtnFemale.setEnabled(true);
				rdbtnFemale.setEnabled(false);
					//JOptionPane.showMessageDialog(rdbtnYes, this, "Yes", 0);
					
				
			}
		});
	}
}
