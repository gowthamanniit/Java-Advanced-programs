package javapro;
enum Pro
{
	mac1,mac2,MAC3;
}
public class Product {
	

	
	//private static Product mac1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Pro p:Pro.values())
		{
		System.out.println(p);
		}
	}

}
