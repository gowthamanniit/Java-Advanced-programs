package javapro;
//Final variable
public class Final {
	final int x=20;           //constant 
	void printFinal()
	{
	//	int z=2*x;
		System.out.println("Final value is "+x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final f1=new Final();
		f1.printFinal();
	}

}
