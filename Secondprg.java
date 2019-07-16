package javapro;



import java.util.regex.*;
public class Secondprg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Pattern";
		Pattern p1=Pattern.compile(s1);
		String s2=p1.pattern();
		System.out.println(s2);
		
		Pattern p2=Pattern.compile(":");
		String[]split=p2.split("one:two:three:four:five",3);
		for(String element:split)
		{
			System.out.println("elements:"+element);
		}
		
		System.out.println(Pattern.matches("name","name"));
		
		Pattern p3=Pattern.compile("Apple");
		Matcher m1=p3.matcher("Apple a day,keeps the doctor away");
		
		StringBuffer s3=new StringBuffer();
		while(m1.find())
		{
			m1.appendReplacement(s3,"coffee");
			System.out.println(s3.toString());
		}
		
		m1.appendTail(s3);
		System.out.println(s3.toString());
		
		Pattern p4=Pattern.compile("videogames");
		Matcher m2=p4.matcher("Ram likes videogames, videogames is a hobby");
		String s4=m2.replaceAll("cricket");
		System.out.println("Replace all="+s4);
		String s5=m2.replaceFirst("Football");
		System.out.println("ReplaceFirst="+s5);
		
		while(m2.find())
		{
			System.out.println("match ended:"+m2.end(0));
		}
	}

}
