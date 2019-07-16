package javapro;

import java.awt.EventQueue;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Key1 implements KeyListener{

	private JFrame frame;
	JTextArea textArea;
	JLabel lblNewLabel;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Key1();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Key1 window = new Key1();
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
	public Key1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(127, 255, 212));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		 textArea = new JTextArea();
		textArea.setBounds(54, 47, 290, 65);
		frame.getContentPane().add(textArea);
		textArea.addKeyListener(this);
		
		 lblNewLabel = new JLabel("New label");
		 lblNewLabel.setForeground(new Color(72, 61, 139));
		lblNewLabel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				lblNewLabel.setText("Key Pressed");
			}
			@Override
			public void keyReleased(KeyEvent e) {
				lblNewLabel.setText("Key Released");
			}
			@Override
			public void keyTyped(KeyEvent e) {
				lblNewLabel.setText("Typing");
			}
		});
		lblNewLabel.setFont(new Font("Snap ITC", Font.ITALIC, 11));
		lblNewLabel.setBackground(new Color(255, 204, 153));
		lblNewLabel.setBounds(87, 133, 231, 93);
		frame.getContentPane().add(lblNewLabel);
		textArea.addKeyListener(this);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		lblNewLabel.setText("\nKey Pressed");
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		lblNewLabel.setText("\nKey Released");
		

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		lblNewLabel.setText("Key Typing");
		
	}
}
