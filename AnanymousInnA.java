package javapro;
abstract class Union
{
	abstract void mun();
}

public class AnanymousInnA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Union u1=new Union()
		{
			void mun()
			{
				System.out.println("ALL ARE EQUAL");
			}
		};
		u1.mun();
	}

}
