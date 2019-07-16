package javapro;
//DownCasting
class Super
{	
	void Sample()
	{
		System.out.println("Method of Super class");
	}
}
public class Downcasting extends Super
{
	void Sample()
	{
		System.out.println("Method of Sub class");
	}
	public static void main(String srgs[])
	{
		Super obj=new Downcasting();
		Downcasting ds=(Downcasting)obj;
		ds.Sample();
	}
}
		