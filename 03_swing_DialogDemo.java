import javax.swing.*;
public class DialogDemo
{
	JDialog ob;
	public DialogDemo()
	{
		ob=new JDialog();
		ob.setTitle("Dialog Demo");
		ob.setVisible(true);
		ob.setSize(100,150);

JButton b=new JButton("click");//creating instance of JButton  
b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
          
ob.add(b);//adding button in JFrame  

//ob.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{	
		DialogDemo dob=new DialogDemo();
	}
}