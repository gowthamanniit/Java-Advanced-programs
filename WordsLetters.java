package javapro;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.*;


public class WordsLetters implements ActionListener{

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	JLabel label;
	JLabel lblCountWords;
	JLabel label_1;
	JLabel lblCountLetters;
	JLabel label_2;
	private JTextArea textArea;
	private JLabel textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new WordsLetters();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WordsLetters window = new WordsLetters();
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
	public WordsLetters() {
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
		
		label = new JLabel("");
		label.setBounds(82, 76, 46, 14);
		frame.getContentPane().add(label);
		
		lblCountWords = new JLabel("count words");
		lblCountWords.setBounds(69, 164, 91, 14);
		frame.getContentPane().add(lblCountWords);
		
		label_1 = new JLabel(":");
		label_1.setBounds(133, 164, 46, 14);
		frame.getContentPane().add(label_1);
		
		lblCountLetters = new JLabel("count letters");
		lblCountLetters.setBounds(69, 189, 123, 14);
		frame.getContentPane().add(lblCountLetters);
		
		label_2 = new JLabel(" :");
		label_2.setBounds(133, 189, 46, 14);
		frame.getContentPane().add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(155, 161, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(155, 189, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnCount = new JButton("COUNT");
		btnCount.setBounds(290, 164, 89, 23);
		frame.getContentPane().add(btnCount);
		
		textArea = new JTextArea();
		textArea.setBounds(58, 28, 321, 83);
		frame.getContentPane().add(textArea);
		btnCount.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String str=textArea.getText();
		String word[]=str.split("\\s");
		textField_1.setText("str"+word.length);
		textField_2.setText("count"+str.length());
		
		
	}

}
