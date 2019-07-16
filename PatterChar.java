package javapro;

import java.util.regex.*;
public class PatterChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[def]","F")); // true , if d or e or f 
		System.out.println(Pattern.matches("[^def]","e")); // true , if , except d or e or f
		System.out.println(Pattern.matches("[a-zA-Z]","1")); // true ,either small or caps
		System.out.println(Pattern.matches("[a-e[x-z]]","k")); // true , if range a-e, x-z
		System.out.println(Pattern.matches("[a-z&&[abc]]","k")); // true ,small letter ,along a or b orc
		System.out.println(Pattern.matches("[a-z&&[^bcd]]","c")); // true ,small letter ,except bcd
		System.out.println(Pattern.matches("[a-z&&[^n-p]]","o")); // true , if not range in n-p
		System.out.println(Pattern.matches("[DEF]","f")); // true , if D or E or F
		
	}

}

