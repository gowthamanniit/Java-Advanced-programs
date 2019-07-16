package javapro;
class Teddy
{
	void beer()
	{
		System.out.println("TEDDYBEER");
	}
	static class Dora
	{
		void bujji()
		{
			System.out.println("DORABUJJI");
		}
	}
}

public class StaticInn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teddy t1=new Teddy();
		t1.beer();
		Teddy.Dora b1=new Teddy.Dora();
		b1.bujji();
	}

}
