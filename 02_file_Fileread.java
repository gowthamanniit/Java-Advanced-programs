import java.io.FileReader;
public class Fileread12  {

	
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("D:\\NewJava\\abc.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.println((char)i);
		}
	}

}
