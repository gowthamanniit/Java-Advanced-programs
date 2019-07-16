
import java.util.regex.Pattern;

public class ExRegex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//boolean  ans=Pattern.matches("[a-z]*", "alkhdskljfsdalksdfakj");
		//boolean  ans=Pattern.matches("[a-z]+", ""); // non empty
		
		//boolean  ans=Pattern.matches("[a-zA-Z]*", "dsfasdsKJHKJHJKHK12");
		//boolean  ans=Pattern.matches("[a-zA-Z0-9]*", "dsfasdsKJHKJHJKHK12");
		//boolean  ans=Pattern.matches("[^bcr]at", "aat");
		boolean  ans=Pattern.matches("[bcr]{5,10}", "brrcbcbcbc");
		
		System.out.println(ans);
		
		
	}

}
