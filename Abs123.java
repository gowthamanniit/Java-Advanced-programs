package javapro;
abstract class Color
{
	abstract void red();
}
public class Abs123 extends Color{
void red()
{
	System.out.println("Executing Color");
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color c1;
		c1=new Abs123();
		c1.red();
	}

}
