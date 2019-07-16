package javapro;
class A
{
	static int a=5;
    void ak()
	{
		System.out.println("all the best");
	}
}

public class Over extends A {
	void ak()
	{
		System.out.println("best of luck");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Over o1=new Over();
		o1.ak();
		o1.ak();
	}

}
