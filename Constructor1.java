package javapro;

public class Constructor1 {
	int n;
	Constructor1(int x,int y)
	{ 
		System.out.println("X :" + x + "Y :" +y);   //parameterized constructor
	}
	void printValue()
	{
		System.out.println("the assigned value is :" +n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor1 c1=new Constructor1(12,10);
		//Constructor1 c1;
		//c1=new Constructor1();
		c1.printValue();

	}

}
/* constructor will be invoked whenever the object is created, */