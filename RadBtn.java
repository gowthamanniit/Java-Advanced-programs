package javapro;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class RadBtn implements ActionListener{

	private JFrame frame;
	JRadioButton rdbtnMale;

	JRadioButton rdbtnFemale;
	JButton btnClick;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadBtn window = new RadBtn();
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
	public RadBtn() {
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
		
		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(91, 31, 109, 23);
		frame.getContentPane().add(rdbtnMale);
		
		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(91, 86, 109, 23);
		frame.getContentPane().add(rdbtnFemale);
		
		btnClick = new JButton("click");
		btnClick.setBounds(97, 141, 89, 23);
		frame.getContentPane().add(btnClick);
		btnClick.addActionListener(new ActionListener(){
		
	
		public void actionPerformed(ActionEvent arg0)
		{
		if(rdbtnMale.isSelected())
			rdbtnMale.setEnabled(true);
		rdbtnFemale.setEnabled(false);
		if(rdbtnFemale.isSelected())
			rdbtnFemale.setEnabled(true);
		rdbtnMale.setEnabled(false);
	}
	});
	}
}



