import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NioWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String content="Using BufferedWriter Class";
		Path file=Paths.get("D:/NewJava/f2.txt");
		Charset charset=Charset.forName("Us-ASCII");
		try	(BufferedWriter writer=Files.newBufferedWriter(file,charset, StandardOpenOption.CREATE))
				{
			writer.write(content);
			System.out.println("Done");
				}
		
		catch(IOException e)
		{
			System.out.println(e);
		}

	}

}
