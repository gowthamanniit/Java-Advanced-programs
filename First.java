package javapro;

import java.util.Scanner;

public class First {
	void method()
	{
		int age;
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		if(age<18)
			throw new ArithmeticException();
		else 
			System.out.println("valid");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First f1=new First();
		f1.method();
	}

}
