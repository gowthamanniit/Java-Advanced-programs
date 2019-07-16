import java.awt.EventQueue;

public class Thread2 extends Thread{

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
		
	public static void main(String[] args) {
				
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Thread2 window = new Thread2();
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
	public Thread2() {
		initialize();
		//display();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(26, 47, 287, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		Thread t = new Thread(new Runnable() {
         public void run() 
         {
      
        	 for(int i=60;i>=0;i--)
        	 {
        		 try
        		 {
        			 Thread.sleep(1000);
        			 String s=Integer.toString(i);
        			 textField.setText(s+"Seconds to go");
        		 }
        		 catch(Exception e)
        		 {
        			 System.out.println(e);
        		 }
        	 }
        	 JOptionPane.showMessageDialog(frame,"time up!!!");
		
         }
		});
          t.start();      
}
}