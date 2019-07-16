import java.awt.EventQueue;
import java.awt.color.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.*;

 public class KeyListenerEx implements KeyListener {

	private JFrame frame;
	JTextArea textArea;
	JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new KeyListenerEx();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyListenerEx window = new KeyListenerEx();
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
	public KeyListenerEx() {
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
		
		 textArea = new JTextArea();
		textArea.setBounds(64, 55, 320, 182);
		frame.getContentPane().add(textArea);
		
		 lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(64, 11, 231, 24);
		frame.getContentPane().add(lblNewLabel);
		textArea.addKeyListener(this);
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
