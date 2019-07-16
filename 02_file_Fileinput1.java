import java.io.FileInputStream;
import java.io.IOException;
public class FileInput1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		char c;
		try
		{
			FileInputStream f=new FileInputStream("D:\\NewJava\\abc.txt");
			while((i=f.read())!=-1)
			{
				c=(char)i;
				System.out.println(c);
			}
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
	}

}
