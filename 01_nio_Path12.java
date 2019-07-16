import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Path1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path pathob= Paths.get("D:/NewJava/abc.txt");
		System.out.println(pathob.getFileName());     //returns path
		
		Path target=Paths.get("D:/NewJava/abc.txt");
		System.out.println(target.getFileSystem());  // name of file system
		
		System.out.println(target.getNameCount());
		
		System.out.println(target.getName(0));
		
		System.out.println(target.getParent());
		
		System.out.println(target.getRoot());
		
		System.out.println(target.isAbsolute()); //returns true if the path is an absolute path
		
			
	}

}
