package javapro;

import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class KeyL implements KeyListener{

	private JFrame frame;
	private JTextField textField;
	JLabel lblWrite ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyL window = new KeyL();
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
	public KeyL() {
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
		textField.setBounds(52, 34, 319, 57);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblWrite = new JLabel("WRITE");
		lblWrite.setBounds(142, 142, 46, 14);
		frame.getContentPane().add(lblWrite);
		textField.addKeyListener(this);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		lblWrite.setText("key pressed");
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		lblWrite.setText("key released");
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		lblWrite.setText("key typed");
	}

}
