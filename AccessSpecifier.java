package javapro;
class New1
{

	private int total,a,b;
	int c;
	void get()
	{
	a=10;
	b=20;
	c=a+b;
	total =c;
	
}
void print()
{
	System.out.println("C value :"+c);
	System.out.println("Total value:"+total);
}
}

public class AccessSpecifier {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		New1 a1=new New1();
		a1.get();
		a1.print();
		//System.out.println("Private value:"+a1.total);
		System.out.println("Private value:"+ a1.c);
	}

}
