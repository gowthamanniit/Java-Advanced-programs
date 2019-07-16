import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.*;

public class Move {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path src=Paths.get("D:/test.txt");
		Path dest=Paths.get("D:/NewJava/f3.txt"); // new file
		try
		{
			Files.move(src, dest, REPLACE_EXISTING);
					
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
