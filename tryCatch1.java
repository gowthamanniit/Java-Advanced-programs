package javapro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch1 {
	Scanner sc=new Scanner(System.in);
	void checking()
	{
		try
		{
			System.out.println("Enter the numbers:");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("c result:"+c);
		}
	    catch(ArithmeticException e)
		{
			System.out.println("You have entered zero- caught exception");
		}
		catch(InputMismatchException e)
		{
			System.out.println("You have not typed numerical value");
		}
		catch(Exception e)
		{
		//	System.out.println(e);
			e.printStackTrace();
			
		}
		finally
		{
			System.out.println("excutes at the end of try-catch");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tryCatch1 t1=new tryCatch1();
		t1.checking();
		System.out.println("Program flow");
	}

}
