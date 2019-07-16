package javapro;
import java.util.*;
public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="We Win";
		int len;
		len=str.length();
		System.out.println(len);
		
		char result;
		result=str.charAt(2);
		System.out.println(result);
		
		String str1=new String("Welcome to java");
		char[]str2=new char[2];
		str1.getChars(3,5,str2,0);
		System.out.println("value:");
		System.out.println(str2);
		
		String s1="JAVA";
		String s2="JAVA";
		boolean results=s1.equals(s2);
		System.out.println(results);
		
		String com1="strings_string hai";
		String com2="hai";
		int result3=com1.compareTo(com2);
		System.out.println("Compare to  "+result3);
		
		System.out.println(str1.startsWith("Welcome"));
		System.out.println(str1.endsWith("Java"));
		System.out.println(str1.indexOf("m"));
		System.out.println(str1.lastIndexOf("v"));
		System.out.println(str1.substring(10));
		System.out.println(str1.concat(s1));
		System.out.println(str1.replace('a','A'));
		System.out.println(com1.toUpperCase());
		System.out.println(com1.toLowerCase());
	}
}

		
		
		
		
		
		
		
	
