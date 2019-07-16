package javapro;
import java.util.Scanner;
public class Checking {
	int no;
	Scanner sc=new Scanner(System.in);
	void verify()
	{
		System.out.println("enter the num:");
		no=sc.nextInt();
		try
		{
			if(no>9)
				throw new NumException();
			else
				System.out.println("correct number");
		}
		catch(NumException n)
		{
			System.out.println("You entered a wrong number!!!!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checking c1=new Checking();
		c1.verify();
	}

}
