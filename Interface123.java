package javapro;
/* interface - 100% , only u can declare method, 
 * no constructor
 * class should implement methods defined in interface
 * can also accept abstract method
 * interface can be inherited to another interface
 */
interface Bike1
{
	void register();
	void horn();
}
interface Censor extends Bike1
{
	void enable();
}
class KingBike 
{
	void admin()
	{
		System.out.println("New Bike Launched");
	}
}
public class Interface123 extends KingBike implements Censor {
	@Override
	public void register() {
		// TODO Auto-generated method stub
		System.out.println("Bike got Registered");
	}

	@Override
	public void horn() {
		// TODO Auto-generated method stub
		System.out.println("Horn got fixed");
	}

	@Override
	public void enable() {
		// TODO Auto-generated method stub
		System.out.println("All censors got enabled");
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Interface123 if1=new Interface123();
		if1.admin();
		if1.register();
		if1.horn();
		if1.enable();
	}
}