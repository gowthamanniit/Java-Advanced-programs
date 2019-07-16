import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Dir1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path newDir=Paths.get("D:/java1/Prg");
		
		try
		{
			Files.createDirectories(newDir);
		}
		catch(IOException e)
		{
			System.err.println(e);
		}
	}

}
