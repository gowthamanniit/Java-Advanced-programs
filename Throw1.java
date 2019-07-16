package javapro;

import java.util.Scanner;

public class Throw1 {
	void check()
	{
		int no;
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		if(no<5)
			throw new ArithmeticException();
		else
			System.out.println("Valid");
		
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Throw1 n1=new Throw1();
			n1.check();
	}

}
