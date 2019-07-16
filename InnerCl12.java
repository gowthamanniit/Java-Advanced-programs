package javapro;
class Bank
{ 
	int x;
	void display()
	{
		x=20;
		System.out.println("Printing Bank Class"+x);
		class InnerBank
		{
			void disInner()
			{
				System.out.println("Method inner class execute");
			}
		}
		InnerBank b1=new InnerBank();
		b1.disInner();
	
	}
}
public class InnerCl12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1=new Bank();
		b1.display();
		//Bank.Verification v1=new Bank.Verification();
	//	v1.disVerify();
	}

}
