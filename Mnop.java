package javapro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;

public class Mnop {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mnop window = new Mnop();
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
	public Mnop() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 37));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLinkHere = new JLabel("Link here");
		lblLinkHere.setBackground(UIManager.getColor("Label.disabledForeground"));
		lblLinkHere.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 27));
		lblLinkHere.setBounds(120, 93, 201, 49);
		frame.getContentPane().add(lblLinkHere);
	}

}
