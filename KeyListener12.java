package javapro;

import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.KeyAdapter;

public class KeyListener12 implements KeyListener{

	protected static final JTextComponent Label = null;
	private JFrame frame;
	private JTextField textField;
	 JLabel label;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyListener12 window = new KeyListener12();
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
	public KeyListener12() {
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
		textField.setBounds(88, 39, 238, 62);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("");
		label.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				Label.setText("KEY Pressed");
			}
		});
		label.setBackground(new Color(160, 82, 45));
		label.setBounds(94, 148, 245, 37);
		frame.getContentPane().add(label);
		textField.addKeyListener(this);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Key Pressed");
		//label.setText("Key Pressed");
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Key Released");
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Key Typed");
	}
}
