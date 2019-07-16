package javapro;
import java.util.Scanner;
public class Variable {
	int i;
    static char value[]=new char[10];
	Scanner sc=new Scanner(System.in);
	void get()
	{
		System.out.println("enter the characters:");
		for(i=0;i<6;i++)
		{
			value[i]=sc.next().charAt(0);
		}
	}
	void get()
	{
		System.out.println("Characters :");
		for(i=0;i<6;i++)
		{
			System.out.print(value[i]);
		}
	}

public static void main(String args[])
{
	Variable v1=new Variable();
	v1.get();
	v1.get();
}
}