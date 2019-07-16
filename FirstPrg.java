package javapro;
import java.util.regex.*;
public class FirstPrg 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Pattern p=Pattern.compile(".s");
	Matcher m=p.matcher("as");
	Boolean b=m.matches();
	
	
	Boolean b2=Pattern.compile(".s").matcher("as").matches();
	
	Boolean b3=Pattern.matches(".s","as");
	
	System.out.println(b+" "+b2+" "+b3);
	

	

	}

}
