package javapro;
abstract class Abt
{int x;
	Abt()
	{
		x=30;
	}
	abstract void method1();
}
public class InnerAbst extends Abt{
	void method1()
	{
		System.out.println("Abstract method defined"+x);
	}

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		//Abt a1;
		//a1=new InnerAbst();
		Abt a1=new InnerAbst();
		a1.method1();
	}

}
