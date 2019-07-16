package javapro;
abstract class Number
{
	abstract void count();
}
public class AnyInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number n1=new Number()
				{
				void count()
				{
					System.out.println("Printing Abstract Method/Anonymous class");
				}
			
				};
				n1.count();
	}

}
