import java.util.regex.*;
public class ExReg_Quantifiers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[amn]?","m"));     //once or not at all
		System.out.println(Pattern.matches("[a-g]*","abcdef")); //zero or more time
		System.out.println(Pattern.matches("[art]+","aarrtt")); //x,one or more time
		System.out.println(Pattern.matches("[tom]{3}","tom")); //exactly n times
		System.out.println(Pattern.matches("[r]{5,}","rrrrrr")); //atleast n times
		System.out.println(Pattern.matches("[st]{2,5}","sstt")); //atleast n times, not more than m times
	}

}
