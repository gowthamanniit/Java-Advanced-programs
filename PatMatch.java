//Pattern classes
package javapro;
import java.util.regex.*;
public class PatMatch{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s1="pattern";
	Pattern mypattern=Pattern.compile(s1);
	String s2=mypattern.pattern();
	System.out.println(s2);                 // returns compiled regular expression
	
	Pattern mypattern1=Pattern.compile(":");
	String[] split=mypattern1.split("One:two:three:Four",2);
	for(String element:split)
	{
		System.out.println("elements:"+element);  // split the given input sequence 
	}

	System.out.println(Pattern.matches("name","name")); //matching 
	
	Pattern pattern=Pattern.compile("Apple");
	Matcher matcher=pattern.matcher("Apple a day ,keeps the doctor away");
	StringBuffer s3=new StringBuffer();
	while(matcher.find())
	{
		matcher.appendReplacement(s3, "coffee");
		System.out.println(s3.toString());   // Upto this, only replacement+
	}
	matcher.appendTail(s3);
	System.out.println(s3.toString());        // here, it adds extra lines (appending)
	
	
	Pattern pattern2 =Pattern.compile("videogames");
	Matcher matcher1=pattern2.matcher("Ram likes videogames, videogames is a hobbby ");
	String s4=matcher1.replaceAll("Cricket");
	System.out.println("Replace all"+s4);   // replace All
	
	String s5=matcher1.replaceFirst("Football");
	System.out.println("ReplaceFirst="+s5);   //replace only at first
	
	while(matcher1.find())
	{
		System.out.println("Match ended:"+matcher1.end(0));
		
	}
	System.out.println(Pattern.matches("[DEF]", "F"));
	
}
}
