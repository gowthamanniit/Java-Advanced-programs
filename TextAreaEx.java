package javapro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TextAreaEx implements ActionListener {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	JTextArea textArea;
	JLabel lblNoofWords ;
	JLabel lblNoOfLettersl ;
	JButton btnCount;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new TextAreaEx();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextAreaEx window = new TextAreaEx();
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
	public TextAreaEx() {
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
		textArea.setBounds(57, 36, 304, 86);
		frame.getContentPane().add(textArea);
		
		lblNoofWords = new JLabel("No.of Words");
		lblNoofWords.setBounds(57, 151, 90, 14);
		frame.getContentPane().add(lblNoofWords);
		
		 lblNoOfLettersl = new JLabel("No of lettersl");
		lblNoOfLettersl.setBounds(61, 176, 72, 14);
		frame.getContentPane().add(lblNoOfLettersl);
		
		textField = new JTextField();
		textField.setBounds(201, 148, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(201, 173, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		btnCount = new JButton("Count");
		btnCount.setBounds(110, 205, 89, 23);
		frame.getContentPane().add(btnCount);
		btnCount.addActionListener(this);
	}

		
	public void actionPerformed(ActionEvent e)
	{
		String str=textArea.getText();
		String word[]=str.split("\\s");
		textField.setText("Str"+word.length);
		textField_1.setText("Count"+str.length());
	}
	
}
