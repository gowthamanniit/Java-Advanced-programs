package javapro;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*; //
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.*;

public class Calculator implements ActionListener{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	JLabel lblA ;//
	JLabel lblB;
	JLabel lblResult;
	JButton btnAdd;
	JButton btnSubtract ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Calculator();// Calculator c=new Calculator();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblA = new JLabel("A");
		lblA.setBounds(34, 23, 46, 14);
		frame.getContentPane().add(lblA);
		
		textField = new JTextField();
		textField.setBounds(90, 20, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		 lblB = new JLabel("B");
		lblB.setBounds(34, 63, 46, 14);
		frame.getContentPane().add(lblB);
		
		textField_1 = new JTextField();
		textField_1.setBounds(90, 60, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		 lblResult = new JLabel("Result");
		lblResult.setBounds(34, 112, 46, 14);
		frame.getContentPane().add(lblResult);
		
		textField_2 = new JTextField();
		textField_2.setBounds(90, 109, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		 btnAdd = new JButton("Add");
		btnAdd.setBounds(225, 59, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		btnSubtract = new JButton("Subtract");
		btnSubtract.setBounds(308, 59, 89, 23);
		frame.getContentPane().add(btnSubtract);
		btnAdd.addActionListener(this);
		btnSubtract.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s1=textField.getText();
		String s2=textField_1.getText();
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int result=0;
		if(e.getSource()==btnAdd)
		{
			result=a+b;
		}
		else if(e.getSource()==btnSubtract)
		{
			result=a-b;
		}
		
		String s3=Integer.toString(result);
		textField_2.setText(s3);
	}

}
