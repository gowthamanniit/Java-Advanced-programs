import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutput1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			BufferedOutputStream bout=new  BufferedOutputStream(new FileOutputStream("D:\\test.txt"));
			String str="Welcome to NIIT";
			byte b[]=str.getBytes();
			bout.write(b);
			bout.close();
			
			System.out.println("Success");
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
