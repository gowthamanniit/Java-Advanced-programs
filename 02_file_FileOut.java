import java.io.FileOutputStream;

public class FileOutput1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileOutputStream fout=new FileOutputStream("D:\\test.txt");
			String str="Welcome to java World";
			byte b[]=str.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Success");
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
