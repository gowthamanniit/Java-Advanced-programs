package javapro;

import java.awt.geom.Dimension2D;

class Day
{
	<T>void print(T a,T b)
	{
		
		System.out.println("A Value :"+a +"B value" + b);
	}
}
public class GMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day d1=new Day();
		d1.print(10, 20);
		d1.print("hai",1234);

	}

}
