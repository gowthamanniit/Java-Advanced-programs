package com.niit;

import com.niit.NAV.Tam;

class NAV  // dont create static class in outter class.
{
	static int a=10;
	static class Tam  // we can declare both static & normal method & var 
	{
		int b=20;
		static void display()
		{
		System.out.println("static inner class called "+a); // a is static var so use
		}                                                   // b not use be.. nor var 
		void display2()
		{
			System.out.println("b = "+b);  //normal method accept both static & nor var
			System.out.println("a = "+a);
		}
		
	}
	
}

public class StaticInnerClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Tam.display();  // dont create object to call static method

Tam ob=new Tam();  // static inner class we can create object directly.
                   // but regular innerclas we cannot create object.
ob.display2();    
	}

}
