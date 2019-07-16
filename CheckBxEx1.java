package javapro;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.*;

public class CheckBxEx1 implements ActionListener{

	private JFrame frame;
	JLabel lblApplyYourOrder;
	JCheckBox chckbxJuice ;
	JCheckBox chckbxColdCoffee ;
	JCheckBox chckbxCake ;
	JButton btnOrder ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new CheckBxEx1();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBxEx1 window = new CheckBxEx1();
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
	public CheckBxEx1() {
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
		
		lblApplyYourOrder = new JLabel("Apply your Order");
		lblApplyYourOrder.setBounds(35, 11, 319, 22);
		frame.getContentPane().add(lblApplyYourOrder);
		
		chckbxJuice = new JCheckBox("Juice @ 50");
		chckbxJuice.setBounds(20, 40, 97, 23);
		frame.getContentPane().add(chckbxJuice);
		
		 chckbxColdCoffee = new JCheckBox("Cold Coffee @ 80");
		chckbxColdCoffee.setBounds(20, 66, 111, 23);
		frame.getContentPane().add(chckbxColdCoffee);
		
		chckbxCake = new JCheckBox("Cake @100");
		chckbxCake.setBounds(20, 98, 97, 23);
		frame.getContentPane().add(chckbxCake);
		
		btnOrder = new JButton("Order");
		btnOrder.setBounds(35, 147, 89, 23);
		frame.getContentPane().add(btnOrder);
		
		btnOrder.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String msg="";
		int amount=0;
		if (chckbxJuice.isSelected())
		{
			amount=amount+50;
			msg+="Juice @ 50\n";
		}
		if(chckbxColdCoffee.isSelected())
		{
			amount=amount+80;
			msg+="cold Coffee @ 80\n";
		}
		if(chckbxCake.isSelected())
		{
			amount=amount+100;
			msg+="cake @ 100\n";
		}
	//	JOptionPane.showMessageDialog(this,msg +"Total:"+amount);
		msg+="============================\n";
		JOptionPane.showMessageDialog(null, msg+"Total:"+amount);
	
	}
	
}
