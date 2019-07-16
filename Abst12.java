package javapro;

abstract class Circle
{
	int k;
	Circle()
	{
		 k=45;
	}
	abstract void area();    // only declaration , cannot instantiation
}

public class Abst12 extends Circle{
	void area()
	{
		System.out.println(k);
		System.out.println("Circle was inherited");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1;
		c1=new Abst12();
		//Circle c1=new Abst12();
		c1.area();
		//c1.area();
	}

}
//abstract class can be inherited
// constructor , static can be used in abstraction
// abstract method cannot be defined/instantiated inside abstract class
// abstract method has to be derived and defined in derive class
