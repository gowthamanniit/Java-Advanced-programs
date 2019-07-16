package javapro;
abstract class Bike
{
	abstract void run1();
}
public class Abst extends Bike{
void run1()
{
	System.out.println("running safely");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bike obj=new Abst();
obj.run1();
	}

}
