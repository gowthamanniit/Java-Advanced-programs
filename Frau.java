package javapro;

import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;

public class Frau implements ItemListener {

	private JFrame frame;
	JLabel lblNewLabel ;
	JCheckBox chckbxExcellent ;
	JCheckBox chckbxGood;
	JCheckBox chckbxAverage ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Frau();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frau window = new Frau();
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
	public Frau() {
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
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(32, 22, 151, 29);
		frame.getContentPane().add(lblNewLabel);
		
		chckbxExcellent = new JCheckBox("Excellent");
		chckbxExcellent.setBounds(107, 58, 97, 23);
		frame.getContentPane().add(chckbxExcellent);
		
		chckbxGood = new JCheckBox("Good");
		chckbxGood.setBounds(107, 84, 97, 23);
		frame.getContentPane().add(chckbxGood);
		
		chckbxAverage = new JCheckBox("Average");
		chckbxAverage.setBounds(107, 110, 97, 23);
		frame.getContentPane().add(chckbxAverage);
		chckbxExcellent.addItemListener(this);
		chckbxGood.addItemListener(this);
		chckbxAverage.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==chckbxExcellent)
			lblNewLabel.setText("Excellent "+(e.getStateChange()==1?"checked":"unchecked"));
			if(e.getSource()==chckbxGood)
				lblNewLabel.setText("Good "+(e.getStateChange()==1?"checked":"unchecked"));
				if(e.getSource()==chckbxAverage)
					lblNewLabel.setText("Average "+(e.getStateChange()==1?"checked":"unchecked"));
		
	}
}
