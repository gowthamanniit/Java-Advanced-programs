import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class BufferedInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fi=new FileInputStream("D:\\JavaNew\\abc.txt");
			BufferedInputStream bf=new BufferedInputStream(fi);
			int i;
			while((i=bf.read())!=-1)
			{
				System.out.println((char)i);
			}
			bf.close();
			fi.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

	}

}
