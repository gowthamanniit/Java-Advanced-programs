package javapro;
//method overloading/ compile time poly/ static ... / early binding
//method overriding/runtime polymorphism/ dynamic polymorphism /late binding

class Parent
{
	void house()
	{
		System.out.println("Parent old house");
	}
}
public class Riding123 extends Parent {
			void house()
		{
			System.out.println("Alternated the old house");
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Riding123 r1=new Riding123();
			r1.house();
			
	}

}
