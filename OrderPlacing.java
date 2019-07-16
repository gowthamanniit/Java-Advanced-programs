package javapro;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;


public class OrderPlacing implements ActionListener {

	private JFrame frame;
	JLabel lblApplyYoursOrderspls ;
	JCheckBox chckbxHotBiters;
	JCheckBox chckbxCrisppyPotatoSanwichrs;
	JCheckBox chckbxLavaCake ;
	JCheckBox chckbxPanniPoori;
	JButton btnOrder;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new OrderPlacing();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderPlacing window = new OrderPlacing();
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
	public OrderPlacing() {
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
		
		lblApplyYoursOrderspls = new JLabel("Apply your's orders.....pls!!!!");
		lblApplyYoursOrderspls.setBounds(21, 32, 237, 14);
		frame.getContentPane().add(lblApplyYoursOrderspls);
		
		chckbxHotBiters = new JCheckBox("Hot bite@Rs.45");
		chckbxHotBiters.setBounds(35, 70, 122, 23);
		frame.getContentPane().add(chckbxHotBiters);
		
		chckbxCrisppyPotatoSanwichrs = new JCheckBox("Crisppy potato sanwich@Rs.40");
		chckbxCrisppyPotatoSanwichrs.setBounds(35, 109, 186, 23);
		frame.getContentPane().add(chckbxCrisppyPotatoSanwichrs);
		
		chckbxLavaCake = new JCheckBox("Lava cake@70");
		chckbxLavaCake.setBounds(40, 148, 97, 23);
		frame.getContentPane().add(chckbxLavaCake);
		
		chckbxPanniPoori = new JCheckBox("Panni poori@20");
		chckbxPanniPoori.setBounds(40, 186, 117, 23);
		frame.getContentPane().add(chckbxPanniPoori);
		
		btnOrder = new JButton("order");
		btnOrder.setBounds(290, 109, 89, 23);
		frame.getContentPane().add(btnOrder);
		btnOrder.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String msg=" ";
		int amt=0;
		if(chckbxHotBiters.isSelected())
		{
			amt=amt+45;
			msg+="Hot bite@Rs.45\n";
		}
		if(chckbxCrisppyPotatoSanwichrs.isSelected())
		{
			amt=amt+40;
			msg+="Crisppy potato sanwich@Rs.40\n";
		}
		if(chckbxLavaCake.isSelected())
		{
			amt=amt+70;
			msg+="Lava cake@Rs.70\n";
		}
		if( chckbxPanniPoori.isSelected() )
		{
			amt=amt+20;
			msg+="Paani poori@Rs.20\n";
		}
		msg+="!!!!!!!!!!!!!!!!!!!!!!!!!!\n";
		JOptionPane.showMessageDialog(null, msg+ "total: "+amt);
	}
}
