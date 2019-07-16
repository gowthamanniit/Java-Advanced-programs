package javapro;
/*abstract class
syntax, 
abstract class class name
{
	constrctor()
	{
	}
	abstract void methodname(); --> declare
}
abstract  class- can be inherited... through extends keyword
*/
abstract class Building
{
	Building()
	{
		System.out.println("Constructor in abstract class");
	}
	
	abstract void floor3();
}
public class check1 extends Building{
	void floor1()
	{
		System.out.println("Completly built floor-1");
	}
	void floor2()
	{
		System.out.println("Finished floor 2");
	}
	@Override
	void floor3() {
		// TODO Auto-generated method stub
		System.out.println("Floor -3  also completed");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
check1 n1=new check1();
n1.floor1();
n1.floor2();
n1.floor3();
	}


}
