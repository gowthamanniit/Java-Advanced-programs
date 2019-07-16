import javax.swing.*;
class FrameDemo
{
	JFrame obj;
	public FrameDemo()
	{
		obj=new JFrame();
		obj.setTitle("JFrameDemo");
		obj.setVisible(true);
		obj.setSize(300,300);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		FrameDemo fobj=new FrameDemo();
	}
	
}