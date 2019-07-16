package javapro;

import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class ItemEventEx implements ItemListener{

	private JFrame frame;
	JLabel lblNewLabel;
	JCheckBox chckbxHigh;
	JCheckBox chckbxMedium;
	JCheckBox chckbxLow;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new ItemEventEx();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ItemEventEx window = new ItemEventEx();
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
	public ItemEventEx() {
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
		
		chckbxHigh = new JCheckBox("High");
		chckbxHigh.setBounds(159, 35, 97, 23);
		frame.getContentPane().add(chckbxHigh);
		
		chckbxMedium = new JCheckBox("Medium");
		chckbxMedium.setBounds(159, 61, 97, 23);
		frame.getContentPane().add(chckbxMedium);
		
		chckbxLow = new JCheckBox("Low");
		chckbxLow.setBounds(159, 87, 97, 23);
		frame.getContentPane().add(chckbxLow);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 11, 372, 14);
		frame.getContentPane().add(lblNewLabel);
		 chckbxHigh.addItemListener(this);    
	     chckbxMedium.addItemListener(this);
	     chckbxLow.addItemListener(this);
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==chckbxHigh)
			lblNewLabel.setText(" High"+ (e.getStateChange()==1? "Checked":"unchecked"));
		if(e.getSource()==chckbxMedium)
			lblNewLabel.setText("Medium "+(e.getStateChange()==1?"Checked":"unchecked"));
		if(e.getSource()==chckbxLow)
			lblNewLabel.setText("Low "+(e.getStateChange()==1?"Checked":"unchecked"));
	}
	
	

	}

