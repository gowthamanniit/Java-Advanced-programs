package javapro;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class MulDiv implements ActionListener {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	JLabel lblA;
	JLabel lblB;
	JButton btnMul ;
	JButton btnDiv;
	JButton btnAnswer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new MulDiv();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MulDiv window = new MulDiv();
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
	public MulDiv() {
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
		
		lblA = new JLabel("A");
		lblA.setBounds(78, 52, 46, 14);
		frame.getContentPane().add(lblA);
		
		lblB = new JLabel("B");
		lblB.setBounds(78, 95, 46, 14);
		frame.getContentPane().add(lblB);
		
		btnMul = new JButton("MUL");
		btnMul.setBounds(42, 138, 89, 23);
		frame.getContentPane().add(btnMul);
		
		btnDiv = new JButton("DIV");
		btnDiv.setBounds(174, 138, 89, 23);
		frame.getContentPane().add(btnDiv);
		
		btnAnswer = new JButton("ANSWER");
		btnAnswer.setBounds(214, 65, 89, 23);
		frame.getContentPane().add(btnAnswer);
		
		textField = new JTextField();
		textField.setBounds(104, 49, 70, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(104, 92, 70, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(322, 66, 64, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		btnMul.addActionListener(this);
		btnDiv.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent k) {
		// TODO Auto-generated method stub
		String s1=textField.getText();
		String s2=textField_1.getText();
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int answer=0;
		if(k.getSource()==btnMul)
		{
			answer=a*b;
		}
		else if(k.getSource()==btnDiv)
		{
			answer=a/b;
		}
		String s3=Integer.toString(answer);
		textField_2.setText(s3);
	}

}
