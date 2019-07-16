//Static inner class
package javapro;
class Fruit4546
{
	void display()
	{
		System.out.println("displaying outer class");
	}
	static class Apple
	{
		void display1()
		{
			System.out.println("displaying inner class");
		}
	}
}

public class Staticpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit4546 f1=new Fruit4546();
		f1.display();
		Fruit4546.Apple a2=new Fruit4546.Apple();
		a2.display1();
	}

}
