package javapro;
import java.util.Scanner;
public class RunTime 
{
	RunTime(int a) 
	{
		System.out.println("a:"+a);
	}
	RunTime(int a, int b)
	{
		System.out.println("a+b" +(a+b));
	}
	public static void main(String args[])
	{
		System.out.println("enter the num:");
		Scanner ak=new Scanner(System.in);
		int x=ak.nextInt();
		int y=ak.nextInt();
		RunTime r1=new RunTime(x,y);
		RunTime r2=new RunTime(12);
	}
}
