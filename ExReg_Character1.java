import java.util.regex.*;
public class ExReg_Character1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[def]","f")); // true , if d or e or f 
		System.out.println(Pattern.matches("[^def]","g")); // true , if , except d or e or f
		System.out.println(Pattern.matches("[a-zA-Z]","T")); // true ,either small or caps
		System.out.println(Pattern.matches("[a-e[x-z]]","d")); // true , if range a-e, x-z
		System.out.println(Pattern.matches("[a-z&&[abc]]","a")); // true ,small letter ,along a or b orc
		System.out.println(Pattern.matches("[a-z&&[^bcd]]","e")); // true ,small letter ,except bcd
		System.out.println(Pattern.matches("[a-z&&[^n-p]]","e")); // true , if not range in n-p
		System.out.println(Pattern.matches("[DEF]","F")); // true , if D or E or F
		
	}

}
