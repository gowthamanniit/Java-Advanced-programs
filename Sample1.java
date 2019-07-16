package javapro;

class A_Class
{
	final int x=20;
	 final void run1()                         //final method can be inherited
	{
		System.out.println("Running sample");
	}
}

public class Sample1 extends A_Class{
	void run1()
	{
		System.out.println("Final value:"+x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 s1=new Sample1();
		s1.run1();
		//s1.run1();
	}
}
