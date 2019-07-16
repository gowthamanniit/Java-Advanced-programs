package javapro;
class Fruit123          //Outer
{
	int x;
	void display()
	{
		x=20;
		System.out.println("Displying outer class" +x);
	}
	class Mango      //Inner
	{
		int x;
		void displayInner()
		{
			x=50;
		System.out.println("Displayinh Inner class Mango"+this.x);
		}
	}
}

public class InnerCl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fruit123 f1=new Fruit123();
f1.display();
Fruit123.Mango m1= f1.new Mango();
m1.displayInner();
	}

}
//
/*Inner class - Local inner class
Method inner class
Static Inner class
ananymous Inner Class,( abstract, interface)*/
