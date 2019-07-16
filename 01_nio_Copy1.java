import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Copy1 {

	private static final CopyOption COPY_ATTRIBUTES = null;
	private static CopyOption REPLACE_EXISTING;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path src=Paths.get("D:/test.txt");
		Path dest=Paths.get("D:/NewJava/f1.txt"); // new file
		try
		{
			Files.copy(src,dest);
					
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
