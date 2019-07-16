package javapro;

public class Second {
int t;
	void division() throws ArithmeticException
	{
		t=15/0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second s1=new Second();
		try
		{
			s1.division();
			System.out.println("DIV:"+s1.t);
		}
		catch (ArithmeticException k)
		{
			System.out.println("Divide by zero");
		}
	}

}
