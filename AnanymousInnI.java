package javapro;
interface People
{
	void votes();
}

public class AnanymousInnI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People p1=new People()
		{
			public void votes() 
			{
				System.out.println("rights");
			}
		};
		p1.votes();
	}

}
