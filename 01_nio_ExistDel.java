import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path target=Paths.get("D:/NewJava/f3.txt");
		Boolean pathExist=Files.exists(target, LinkOption.NOFOLLOW_LINKS);
		System.out.println(pathExist);
		
		try {
			Files.delete(target);
			System.out.println("Deleted");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
