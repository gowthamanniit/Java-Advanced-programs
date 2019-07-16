import java.awt.Color;

public class ThreadNew {

	private JFrame frame;
	JButton red;
	
	JButton green;
	JButton yellow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThreadNew window = new ThreadNew();
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
	public ThreadNew() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	 private int state=0;
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(3, 1, 10, 20));
		
		 red = new JButton("New button");
		frame.getContentPane().add(red);
		
		 green = new JButton("New button");
		/*green.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "green");
			}
		});*/
		frame.getContentPane().add(green);
		
		 yellow = new JButton("New button");
		frame.getContentPane().add(yellow);
		Thread t = new Thread(new Runnable() {
            public void run() {
                while (true) {
        	        int n = state % 3;
        	        red.setBackground(n == 0 ? Color.RED : Color.WHITE);
        	        yellow.setBackground(n == 1 ? Color.YELLOW :  Color.WHITE);
        	        green.setBackground(n == 2 ? Color.GREEN : Color.WHITE);
        	        state++;

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                    }
                }
            }
            
        });
        t.start();
	}
	 
}
