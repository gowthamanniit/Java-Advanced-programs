package javapro;
import java.util.regex.*;
public class Quantifier1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[amn]?","y"));     //once or not at all
		System.out.println(Pattern.matches("[a-g]*","abbbkcdefggg")); //zero or more time
		System.out.println(Pattern.matches("[art]+","aaaaaaaaaaaarrrrrrrrrrrrrttttt")); //x,one or more time
		System.out.println(Pattern.matches("[tom]{3}","tom")); //exactly n times
		System.out.println(Pattern.matches("[r]{4,}","rrrrr")); //atleast n times
		System.out.println(Pattern.matches("[st]{2,5}","sstt")); //atleast n times, not more than m times\
		System.out.println(Pattern.matches("[jerry]{3}","jer"));
	}

}
