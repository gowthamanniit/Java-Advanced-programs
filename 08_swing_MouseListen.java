import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListen extends JFrame implements MouseListener{

	private JFrame frame;
	JLabel lbl;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new MouseListen();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MouseListen window = new MouseListen();
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
	public MouseListen() {
		

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
		frame.addMouseListener(this);
		lbl = new JLabel("");
		lbl.setBounds(37, 37, 310, 26);
		frame.getContentPane().add(lbl);
	}
	public void mouseClicked(MouseEvent e) {  
        lbl.setText("Mouse Clicked");  
    }  
	 
	      
    public void mouseEntered(MouseEvent e) {  
        lbl.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        lbl.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        lbl.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        lbl.setText("Mouse Released");  
    }  

}
