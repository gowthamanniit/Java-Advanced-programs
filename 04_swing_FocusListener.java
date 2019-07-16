import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class FocusList implements FocusListener {

	private JFrame frame;
	private JTextField txtaaa;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FocusList window = new FocusList();
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
	public FocusList() {
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
		
		txtaaa = new JTextField();
		txtaaa.setText("aaa");
		txtaaa.setBounds(10, 43, 233, 20);
		frame.getContentPane().add(txtaaa);
		txtaaa.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(22, 89, 194, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		txtaaa.addFocusListener(this);
	}

	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==txtaaa)
		{
			txtaaa.setForeground(Color.BLUE);
		}
		
	}

	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==txtaaa)
		{
			txtaaa.setForeground(Color.BLACK);
		}
		
	}
}
