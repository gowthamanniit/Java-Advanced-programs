package javapro;  //Inheriting interface  
interface Inter1
{
	void abc();
}
interface Inter2 extends Inter1
{
	void xyz();
}
public class ExInter implements Inter2{
	public void abc()
	{
		System.out.println("Displaying Inter1");
	}
	public void xyz()
	{
		System.out.println("Displaying Inter2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExInter e1=new ExInter();
		e1.abc();
		e1.xyz();

	}

}
