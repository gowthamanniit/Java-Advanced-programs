package javapro;
//Method Inner class
class Method123
{
	void normalMethod()
	{
		class MethodInnerClass12
		{
			void print()
			{
				System.out.println("Executing Method Inner class");
				
			}
			
		}
		MethodInnerClass12 min=new MethodInnerClass12();
		min.print();
	}
}
public class MClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Method123 m12=new Method123();
m12.normalMethod();
	}

}
