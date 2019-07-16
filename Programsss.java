package javapro;
import java.util.*;
public class Programsss 
{
	void methodsss()
	{
		try
		{
		System.out.println("Numbers:");
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		System.out.println("C value:"+c);
		}
		/*catch(ArithmeticException a)
		{
			System.out.println("you have entered ZERO");
		}*/
		finally
		{
			System.out.println("if try and catch does not executes,finally would executes");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programsss p1=new Programsss();
		p1.methodsss();
		System.out.println("program flow");

	}

}
