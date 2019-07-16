/* Method Override/ Late Binding /Run Time Polymorphism
 * 
 * 
 */
package javapro;
class Board
{
	void write() 
	{
		System.out.println("Written in Board");
	}
}

public class OverRide1 extends Board
{
	void write()
	{
		System.out.println("Overwritten");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	OverRide1 r1=new OverRide1();
	r1.write();
	}

}
