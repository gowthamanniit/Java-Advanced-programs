package javapro;

import java.awt.EventQueue;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class FocusEvent1 implements FocusListener{

	private JFrame frame;
	private JTextField txtHai;
	JLabel lblNewLabel;
	private JTextField txtHello;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new FocusEvent1();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FocusEvent1 window = new FocusEvent1();
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
	public FocusEvent1() {
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
		
		txtHai = new JTextField();
		txtHai.setText("Hai");
		txtHai.setBounds(39, 11, 122, 33);
		frame.getContentPane().add(txtHai);
		txtHai.setColumns(10);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(39, 105, 280, 24);
		frame.getContentPane().add(lblNewLabel);
		
		txtHello = new JTextField();
		txtHello.setText("Hello");
		txtHello.setBounds(205, 17, 130, 27);
		frame.getContentPane().add(txtHello);
		txtHello.setColumns(10);
		txtHai.addFocusListener(this);
		txtHello.addFocusListener(this);
		
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		lblNewLabel.setText("Focus gained");
		//txtHai.
	}

	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub
		lblNewLabel.setText("Focus Lost");
	}
}
