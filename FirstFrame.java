package javapro;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;

public class FirstFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstFrame window = new FirstFrame();
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
	public FirstFrame() {
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
		
		JButton btnClick = new JButton("Click");
		btnClick.setBounds(162, 94, 89, 23);
		frame.getContentPane().add(btnClick);
		btnClick.addActionListener(new ActionListener()
				
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						SecondFrame1 s1=new SecondFrame1();
						s1.setVisible(true);
					}
			
				});
		
		
		
		
	}

}
