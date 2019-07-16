package javapro;
 interface Fruit
{
	 void eatable();
	
}
public abstract class AnInner implements Fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Fruit f1=new Fruit()
		{
			void eatable()
			{
				System.out.println("Anonymous inner class");
			}
		};
		f1.eatable();*/
		System.out.println("Execute interface");
	}

}
