package javapro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class Second1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Second1 frame = new Second1();
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
	public Second1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToNiit = new JLabel("           WELCOME TO NIIT");
		lblWelcomeToNiit.setFont(new Font("Eras Bold ITC", Font.PLAIN, 15));
		lblWelcomeToNiit.setForeground(new Color(0, 0, 255));
		lblWelcomeToNiit.setBackground(Color.LIGHT_GRAY);
		lblWelcomeToNiit.setBounds(21, 103, 385, 36);
		contentPane.add(lblWelcomeToNiit);
	}
}
