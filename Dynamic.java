package javapro;
class Mom
{
	int rs;
	Mom()
	{
		rs=5000;
	}
	void ring()
	{
		System.out.println("Ring cost is"+" " +rs);
		//System.out.println("mom's RING");
	}
}
public class Dynamic extends Mom
	{
		void ring()
		{
			rs=234;

			System.out.println("cost :"+rs);
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Dynamic d1=new Dynamic();
			d1.ring();
	}

}
