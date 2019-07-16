package javapro;

public class Throws1{
int division(int a,int b) throws ArithmeticException 
{
	int t=a/b;
	return t;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Throws1 t1=new Throws1();
 
  try
  {
	  System.out.println(t1.division(15, 0));
  }
  catch(ArithmeticException e)
  {
	  System.out.println("Divide by zero");
  }
	}

}

