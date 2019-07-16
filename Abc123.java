package javapro;
abstract class Building123
{
 Building123()
{
	 System.out.println("constructor in abstract class");
}
 abstract void floor3();
}

public class Abc123 extends Building123{
	void floor12()
	{
		System.out.println("completely built floor");
	}
	void floor2()
	{
		System.out.println("finishe floor-2");
	}
	@Override
	void floor3() {
		// TODO Auto-generated method stub
		System.out.println("floor-3 also completed");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Abc123 n1=new Abc123();
 n1.floor12();
 n1.floor2();
 n1.floor3();
 
 
	}

}
