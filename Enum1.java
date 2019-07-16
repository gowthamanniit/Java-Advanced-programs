package javapro;
/* Enum - enumerator
 * java 1.5 , final - 
 * enum - variable, it acts like class, and constructor 
 * group of constants,
 * enum cannot be in local
 * can declare either inside the class or outside the class
 * type safety
 *  starts with zero
 */
// enum inside class
public class Enum1 {
	enum Product
	{
		machine1, machine2,machine3
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Product p1=Product.values();
		for(Product p1:Product.values())
		{
			System.out.println(p1);
		}
	
		
	}

}
