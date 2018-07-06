package com.niit;

import com.niit.ABC1.ABC2;
import com.niit.ABC1.ABC2.abc3;

class ABC1
{	
	//-----------------------
	static class ABC2
	{
		//---------------
		static class abc3
		{
			void disp2()
			{
				System.out.println("outter c-static c-static c- nor method");
			}
			static void disp7()
			{
				System.out.println("outter c-static c-static c- static method");
			}
		}
		//----------------------
		void disp3()
		{
			System.out.println("outter c-static c-nor method");
		}
		static void disp6()
		{
			System.out.println("outter c-static c-static method");
		}
	}
	//----------------------
	   //-----------------------------
		class abc4
			{
				void disp()
				{
					System.out.println("outter c-inner c-nor method");
				}
			}
		//-------------------------
		void dis5()
		{
			System.out.println("outter c-nor method");
		}
}

public class TestStaticClassStarting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ABC1 ob1=new ABC1();  // very basic simple
		ob1.dis5();
	
		ABC1.abc4 ob2=ob1.new abc4(); // regular inner class
		ob2.disp();
		
		ABC2 ob3=new ABC2();    // static inner class regular methoed call
		ob3.disp3();
		
		ABC2.disp6();  // static inner class static method call
		
		abc3 ob4=new abc3(); // outter class->static class -->inside static class--> regular method
		ob4.disp2();           
		
		abc3.disp7(); // outter class - static class - static class -- static method
	}
	

}
