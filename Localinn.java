package javapro;
class Kishore
{
	void display()
	{
		System.out.println("I LOVE YOU");
	}
	class Abi
	{
		void display1()
		{
			System.out.println("I LOVE YOU TOO");
		}
	}
}

public class Localinn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kishore k1=new Kishore();
		k1.display();
		Kishore.Abi a1=k1.new Abi();
		a1.display1();
	}

}
