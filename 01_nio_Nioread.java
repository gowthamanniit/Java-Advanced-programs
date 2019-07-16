import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioFile {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Path pathobj=Paths.get("D:/NewJava/f1.txt");
			Charset chset=Charset.forName("US-ASCII");
			try
			{
					BufferedReader reader=Files.newBufferedReader(pathobj,chset);
					String line=null;
					while((line=reader.readLine())!=null)
					{
						System.out.println(line);
					}
			}
			catch(IOException e)
			{
				System.out.println(e);
						
			}

	}

}
