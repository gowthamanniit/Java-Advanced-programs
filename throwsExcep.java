package javapro;

public class throwsExcep {
int division(int a,int b) throws ArithmeticException
{
	int t=a/b;
	return t;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  throwsExcep ex=new throwsExcep();
  try
  {
	  System.out.println(ex.division(15, 3));
  }
  catch(ArithmeticException e)
  {
	  System.out.println("Divide by zero");
  }
	}

}
