 package javapro;
/* Poylporphism - 2 types
 * 1) Method overloading 2 ) Method overriding
 * 
 * Method overloading/Compile time polymorphism /early binding /static polymorphism
 * achieves with one class only,
 * 
 */
 class Maths1
 {
	 void area(double radius)
		{
			double circle=3.14*radius*radius;
			System.out.println("Circle Area  : "  + circle);
		}
		void area(int length,int breadth)
		{
			int rectangle=length*breadth;
			System.out.println("Rectangle area: " + rectangle);
		}
		float area(float side)
		{
			float square= 4*side;
			return square;
			
		}
 }
public class Polymor12 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths1 pm=new Maths1();
		pm.area(10.50);
		pm.area (30,20);
		float cal=pm.area(12.5f);
		System.out.println("Square area:" +cal);
		}

}
