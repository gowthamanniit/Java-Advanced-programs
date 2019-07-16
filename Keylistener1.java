package javapro;

import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Keylistener1 implements KeyListener{

	private JFrame frame;
	private JTextField textField;
	JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Keylistener1 window = new Keylistener1();
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
	public Keylistener1() {
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
		
		textField = new JTextField();
		textField.setBounds(51, 28, 335, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		 lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(55, 93, 295, 24);
		frame.getContentPane().add(lblNewLabel);

		textField.addKeyListener(this);
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		lblNewLabel.setText("Key Typed");

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		lblNewLabel.setText("Key Pressed");

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		lblNewLabel.setText("Key Released");

	}
}
